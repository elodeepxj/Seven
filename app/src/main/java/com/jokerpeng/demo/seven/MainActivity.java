package com.jokerpeng.demo.seven;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;

import com.jokerpeng.demo.seven.presenter.UnderstanderManager;
import com.jokerpeng.demo.seven.presenter.DictationManager;

public class MainActivity extends AppCompatActivity {
    private DictationManager dictationManager;
    private UnderstanderManager understanderManager;

    // Used to load the 'native-lib' library on application startup.
    static {
        System.loadLibrary("native-lib");
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        dictationManager = new DictationManager(this);
        understanderManager = new UnderstanderManager(this);
    }

    private void setParameter(){
        dictationManager.setParameter();
        understanderManager.setParameter();
    }
    /*
    * 声音转文字
    * */
    private void voiceToText(){
        dictationManager.voiceToText(new DictationManager.DictationListener() {
            @Override
            public void initFail() {
                //初始化失败
            }

            @Override
            public void success(String str) {
                //识别成功
            }

            @Override
            public void empty() {
                //识别内容为空

            }

            @Override
            public void error(String error) {
                //识别失败
            }
        });
    }
    /*
    * 理解文字
    * */
    private void understandTest(){

    }
    /*
    * 理解声音
    * */
    private void understandVoic(){
        understanderManager.voiceUnderstander(new UnderstanderManager.VoiceUnderstanderListener() {
            @Override
            public void initFail() {

            }

            @Override
            public void success(String result) {

            }

            @Override
            public void empty() {

            }

            @Override
            public void beginSpeech() {

            }

            @Override
            public void endSpeech() {

            }

            @Override
            public void error(String errorMessage) {

            }

            @Override
            public void volumeChanged(int volume) {

            }
        });
    }
}
