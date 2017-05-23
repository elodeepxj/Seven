package com.jokerpeng.demo.seven.presenter;

import android.content.Context;
import android.os.Bundle;
import android.text.TextUtils;
import android.widget.Toast;

import com.iflytek.cloud.SpeechConstant;
import com.iflytek.cloud.SpeechError;
import com.iflytek.cloud.SpeechUnderstander;
import com.iflytek.cloud.SpeechUnderstanderListener;
import com.iflytek.cloud.TextUnderstander;
import com.iflytek.cloud.UnderstanderResult;

/**
 * Created by ${PengXiaoJie} on 2017/5/19.10 57..
 */

public class UnderstanderManager {
    private SpeechUnderstander speechUnderstander;
    private TextUnderstander textUnderstander;
    private Context mContext;
    private VoiceUnderstanderListener voiceUnderstanderListener;
    private TextUnderstanderListener textUnderstanderListener;

    public UnderstanderManager(Context context) {
        this.mContext = context;
        init(context);
    }

    private void init(Context context) {
        speechUnderstander = SpeechUnderstander.createUnderstander(context,null);
        textUnderstander = TextUnderstander.createTextUnderstander(context,null);
    }

    public SpeechUnderstander getSpeechUnderstander() {
        return speechUnderstander;
    }

    public void setSpeechUnderstander(SpeechUnderstander speechUnderstander) {
        this.speechUnderstander = speechUnderstander;
    }

    public TextUnderstander getTextUnderstander() {
        return textUnderstander;
    }

    public void setTextUnderstander(TextUnderstander textUnderstander) {
        this.textUnderstander = textUnderstander;
    }

    public void setParameter(){
        if(null == speechUnderstander){
            Toast.makeText(mContext,"understanderManager创建对象失败",Toast.LENGTH_LONG).show();
            return;
        }
        speechUnderstander.setParameter(SpeechConstant.LANGUAGE, "en_us");
        speechUnderstander.setParameter(SpeechConstant.VAD_BOS, "4000");
        speechUnderstander.setParameter(SpeechConstant.VAD_EOS, "1000");
        speechUnderstander.setParameter(SpeechConstant.ASR_PTT,"1");
    }
    /*
    * 文字理解
    * */
    public void textUnderstander(String content, final TextUnderstanderListener textUnderstanderListener){
        if(null == textUnderstander){
            textUnderstanderListener.initFail();
            return;
        }
        textUnderstander.understandText(content, new com.iflytek.cloud.TextUnderstanderListener() {
            @Override
            public void onResult(UnderstanderResult understanderResult) {
                if(null != understanderResult){
                    if(!TextUtils.isEmpty(understanderResult.getResultString())){
                        textUnderstanderListener.success(understanderResult.getResultString());
                    }
                }else {

                }
            }

            @Override
            public void onError(SpeechError speechError) {
                textUnderstanderListener.error(speechError.getPlainDescription(true));
            }
        });
    }
    /*
    * 语音理解
    * */
    public void voiceUnderstander(final VoiceUnderstanderListener voiceUnderstanderListener){
        if(null == speechUnderstander){
            voiceUnderstanderListener.initFail();
            return;
        }
        int i = speechUnderstander.startUnderstanding(new SpeechUnderstanderListener() {
            @Override
            public void onVolumeChanged(int i, byte[] bytes) {
                voiceUnderstanderListener.volumeChanged(i);
            }

            @Override
            public void onBeginOfSpeech() {
                voiceUnderstanderListener.beginSpeech();
            }

            @Override
            public void onEndOfSpeech() {
                voiceUnderstanderListener.endSpeech();
            }

            @Override
            public void onResult(UnderstanderResult understanderResult) {
                if(null != understanderResult){
                    if(!TextUtils.isEmpty(understanderResult.getResultString())){//内容不为空
                        voiceUnderstanderListener.success(understanderResult.getResultString());
                    }else{
                        voiceUnderstanderListener.empty();
                    }
                }else {
                    voiceUnderstanderListener.empty();
                }
            }

            @Override
            public void onError(SpeechError speechError) {
                voiceUnderstanderListener.error(speechError.getPlainDescription(true));
            }

            @Override
            public void onEvent(int i, int i1, int i2, Bundle bundle) {

            }
        });
        if(i != 0){//语义理解失败

        }
    }
    /*
    * 语音理解回调
    * */
    public interface VoiceUnderstanderListener{
        void initFail();
        void success(String result);
        void empty();
        void beginSpeech();
        void endSpeech();
        void error(String errorMessage);
        void volumeChanged(int volume);
    }
    /*
    * 文字理解回调
    * */
    public interface TextUnderstanderListener{
        void initFail();
        void success(String result);
        void error(String errorMessage);
    }
}
