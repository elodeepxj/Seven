package com.jokerpeng.demo.seven.presenter;

import android.content.Context;
import android.os.Bundle;
import android.os.Environment;
import android.widget.Toast;

import com.iflytek.cloud.ErrorCode;
import com.iflytek.cloud.SpeechConstant;
import com.iflytek.cloud.SpeechError;
import com.iflytek.cloud.SpeechSynthesizer;
import com.iflytek.cloud.SynthesizerListener;
import com.iflytek.sunflower.FlowerCollector;

/**
 * Created by PengXiaoJie on 2017/5/24.10 44..
 */

public class SpeechManager {
    private Context mContext;
    private SpeechSynthesizer speechSynthesizer;
    public SpeechManager(Context context) {
        this.mContext = context;
        init(context);
    }

    private void init(Context context) {
        speechSynthesizer = SpeechSynthesizer.createSynthesizer(mContext,null);
    }

    private void initData(){
        FlowerCollector.onEvent(mContext, "tts_play");
    }
    /*
    * 设置参数
    * */
    private void setParameter(){
        if(null == speechSynthesizer){
            Toast.makeText(mContext,"speechManager创建对象失败",Toast.LENGTH_LONG).show();
            return;
        }
        speechSynthesizer.setParameter(SpeechConstant.PARAMS, null);
        speechSynthesizer.setParameter(SpeechConstant.ENGINE_TYPE, SpeechConstant.TYPE_CLOUD);
        // 设置在线合成发音人
        speechSynthesizer.setParameter(SpeechConstant.VOICE_NAME, SettingManager.getSpeechVoice(mContext));
        //设置合成语速
        speechSynthesizer.setParameter(SpeechConstant.SPEED, SettingManager.getSpeechSpeed(mContext));
        //设置合成音调
        speechSynthesizer.setParameter(SpeechConstant.PITCH, SettingManager.getSpeechPitch(mContext));
        //设置合成音量
        speechSynthesizer.setParameter(SpeechConstant.VOLUME,SettingManager.getSpeechVolume(mContext));
        //设置播放器音频流类型
        speechSynthesizer.setParameter(SpeechConstant.STREAM_TYPE,"3");
        // 设置播放合成音频打断音乐播放，默认为true
        speechSynthesizer.setParameter(SpeechConstant.KEY_REQUEST_FOCUS, "true");

        // 设置音频保存路径，保存音频格式支持pcm、wav，设置路径为sd卡请注意WRITE_EXTERNAL_STORAGE权限
        // 注：AUDIO_FORMAT参数语记需要更新版本才能生效
        speechSynthesizer.setParameter(SpeechConstant.AUDIO_FORMAT, "wav");
        speechSynthesizer.setParameter(SpeechConstant.TTS_AUDIO_PATH, Environment.getExternalStorageDirectory()+"/msc/tts.wav");
    }
    /**
     * 开始讲话
     * */
    public void startSpeech(String content, final SpeechListener listener){
        setParameter();
        int i = speechSynthesizer.startSpeaking(content, new SynthesizerListener() {
            @Override
            public void onSpeakBegin() {
                listener.begin();
            }

            @Override
            public void onBufferProgress(int i, int i1, int i2, String s) {

            }

            @Override
            public void onSpeakPaused() {
                listener.paused();
            }

            @Override
            public void onSpeakResumed() {
                listener.resumed();
            }

            @Override
            public void onSpeakProgress(int i, int i1, int i2) {

            }

            @Override
            public void onCompleted(SpeechError speechError) {
                if(null ==speechError){
                    listener.completed();
                }else{
                    listener.error(speechError.getPlainDescription(true));
                }
            }

            @Override
            public void onEvent(int i, int i1, int i2, Bundle bundle) {

            }
        });
        if(i != ErrorCode.SUCCESS && i != ErrorCode.ERROR_COMPONENT_NOT_INSTALLED){
            listener.initFail();
        }
    }


    public interface SpeechListener{
        void initFail();
        void paused();
        void resumed();
        void error(String error);
        void completed();
        void begin();
    }
    /**
     * 停止讲话
     * */
    public void stopSpeech(){speechSynthesizer.stopSpeaking();}
    /**
     * 暂停讲话
     * */
    public void pasueSpeech(){speechSynthesizer.pauseSpeaking();}
    /*
    * 销毁讲话
    * */
    public void destroy(){
        if(null != speechSynthesizer){
            stopSpeech();
            speechSynthesizer.destroy();
        }
    }
}
