package com.jokerpeng.demo.seven.presenter;

import android.content.Context;
import android.os.Bundle;
import android.text.TextUtils;
import android.widget.Toast;

import com.iflytek.cloud.RecognizerListener;
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

    private void init(Context context){
        mSpeechRecognizer = SpeechRecognizer.createRecognizer(context, null);
        mRecognizerDialog = new RecognizerDialog(context,null);
        mResult = new LinkedHashMap<>();
    }
    private void initData(){
//        FlowerCollector.onEvent(mContext,"iat_recognize");
        mResult.clear();
        setParameter();
    }
    /**
     * 语音转文字显示UI
     * */
    public void voiceToTextShowUI(final DictationListener listener){
        if(null ==mSpeechRecognizer ){
            listener.initFail();
            return;
        }
        initData();
        mRecognizerDialog.setListener(new RecognizerDialogListener() {
            @Override
            public void onResult(RecognizerResult recognizerResult, boolean b) {
                if(null != recognizerResult){
                    if(!TextUtils.isEmpty(recognizerResult.getResultString())){
                        listener.success(parseRecognizerResult(recognizerResult.getResultString()));
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
    /**
     * 语音转文字不显示UI
     * */
    public void VoiceToText(final DictationListener listener){
        if(null ==mSpeechRecognizer ){
            listener.initFail();
            return;
        }
        initData();
        mSpeechRecognizer.startListening(new RecognizerListener() {
            @Override
            public void onVolumeChanged(int i, byte[] bytes) {

            }

            @Override
            public void onBeginOfSpeech() {

            }

            @Override
            public void onEndOfSpeech() {

            }

            @Override
            public void onResult(RecognizerResult recognizerResult, boolean b) {
                if(null != recognizerResult){
                    if(!TextUtils.isEmpty(recognizerResult.getResultString())){
                        listener.success(parseRecognizerResult(recognizerResult.getResultString()));
                    }else {
                        listener.empty();
                    }
                }else {
                    listener.empty();
                }

            }

            @Override
            public void onError(SpeechError speechError) {
                listener.error(speechError.getPlainDescription(true));
            }

            @Override
            public void onEvent(int i, int i1, int i2, Bundle bundle) {

            }
        });
    }
    /*
    * 转换结果解析
    * */
    private String parseRecognizerResult(String recognizerResult){
        String text = JsonParser.parseIatResult(recognizerResult);
        String sn = null;
        try {
            JSONObject jsonObject = new JSONObject(recognizerResult);
            sn = jsonObject.optString("sn");
        } catch (JSONException e) {
            e.printStackTrace();
        }
        mResult.put(sn,text);
        mResultBuffer = new StringBuffer();
        for (String key : mResult.keySet()) {
            mResultBuffer.append(mResult.get(key));
        }
        return mResultBuffer.toString();
    }

    /*
    * 设置参数
    * */
    public void setParameter() {
        if(null == mSpeechRecognizer){
            Toast.makeText(mContext,"dictationManager创建对象失败",Toast.LENGTH_LONG).show();
            return;
        }
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
