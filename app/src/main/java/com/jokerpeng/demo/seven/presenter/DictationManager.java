package com.jokerpeng.demo.seven.presenter;

import android.content.Context;
import android.text.TextUtils;

import com.iflytek.cloud.RecognizerResult;
import com.iflytek.cloud.SpeechConstant;
import com.iflytek.cloud.SpeechError;
import com.iflytek.cloud.SpeechRecognizer;
import com.iflytek.cloud.ui.RecognizerDialog;
import com.iflytek.cloud.ui.RecognizerDialogListener;
import com.iflytek.sunflower.FlowerCollector;
import com.jokerpeng.demo.seven.utils.JsonParser;

import org.json.JSONException;
import org.json.JSONObject;

import java.util.HashMap;
import java.util.LinkedHashMap;

/**
 * Created by ${PengXiaoJie}  on 2017/5/5.
 */

public class DictationManager {
    private Context mContext;
    private SpeechRecognizer mSpeechRecognizer;
    private RecognizerDialog mRecognizerDialog;
    private HashMap<String ,String> mResult;
    private StringBuffer mResultBuffer;

    public DictationManager(Context context) {
        this.mContext = context;
        init(context);
    }

    public void init(Context context){
        mSpeechRecognizer = SpeechRecognizer.createRecognizer(context,null);
        mRecognizerDialog = new RecognizerDialog(context,null);
        mResult = new LinkedHashMap<>();
    }

    public void voiceToText(final DictationListener listener){
        if(null ==mSpeechRecognizer ){
            listener.initFail();
            return;
        }
        FlowerCollector.onEvent(mContext,"iat_recognize");
        mResult.clear();
        mRecognizerDialog.setListener(new RecognizerDialogListener() {
            @Override
            public void onResult(RecognizerResult recognizerResult, boolean b) {
                if(null != recognizerResult){
                    if(!TextUtils.isEmpty(recognizerResult.getResultString())){
                        String text = JsonParser.parseIatResult(recognizerResult.getResultString());
                        String sn = null;
                        try {
                            JSONObject jsonObject = new JSONObject(recognizerResult.getResultString());
                            sn = jsonObject.optString("sn");
                        } catch (JSONException e) {
                            e.printStackTrace();
                        }
                        mResult.put(sn,text);

                        mResultBuffer = new StringBuffer();
                        for (String key : mResult.keySet()) {
                            mResultBuffer.append(mResult.get(key));
                        }
                        listener.success(mResultBuffer.toString());
                    }else{
                        listener.empty();
                    }
                }else{
                    listener.empty();
                }
            }

            @Override
            public void onError(SpeechError speechError) {
                listener.error(speechError.getPlainDescription(true));
            }
        });
        mRecognizerDialog.show();
    }

    /*
    * 设置参数
    * */
    public void setParameter() {
        mSpeechRecognizer.setParameter(SpeechConstant.PARAMS,null);
        mSpeechRecognizer.setParameter(SpeechConstant.ENGINE_TYPE,SpeechConstant.TYPE_CLOUD);
        mSpeechRecognizer.setParameter(SpeechConstant.RESULT_TYPE,"json");
        mSpeechRecognizer.setParameter(SpeechConstant.LANGUAGE,"zh_cn");
        mSpeechRecognizer.setParameter(SpeechConstant.ACCENT,"mandarin");
        mSpeechRecognizer.setParameter(SpeechConstant.VAD_BOS, "4000");
        mSpeechRecognizer.setParameter(SpeechConstant.VAD_EOS, "2000");
        mSpeechRecognizer.setParameter(SpeechConstant.ASR_PTT, "1");
    }

    public interface DictationListener{
        void initFail();
        void success(String str);
        void empty();
        void error(String error);
    }
}
