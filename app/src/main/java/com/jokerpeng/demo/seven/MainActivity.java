package com.jokerpeng.demo.seven;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;
import android.view.View;

import com.jokerpeng.demo.seven.presenter.DictationManager;
import com.jokerpeng.demo.seven.presenter.UnderstanderManager;
import com.jokerpeng.demo.seven.utils.CommonUtils;
import com.jokerpeng.demo.seven.utils.JsonParser;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {
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
        CommonUtils.verifyPermissions(this,CommonUtils.verifySdkVersion());
        initView();
        initData();
        initAction();

    }

    private void initAction() {
        findViewById(R.id.btn_dictation).setOnClickListener(this);
        findViewById(R.id.btn_understander).setOnClickListener(this);
        findViewById(R.id.btn_speech).setOnClickListener(this);
    }

    private void initView() {

    }

    private void initData() {
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
        understanderManager.textUnderstander("牛頓定律", new UnderstanderManager.TextUnderstanderListener() {
            @Override
            public void initFail() {

            }

            @Override
            public void success(String result) {
                Log.e("-----------",result);
                JsonParser.parseUnderstanderResult(result);
//               for(String key:map.keySet()){
//                   Log.e("-----------",key+":"+map.get(key));
//               }
            }

            @Override
            public void error(String errorMessage) {

            }
        });
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
                Log.e("",result);
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

    @Override
    public void onClick(View v) {

        setParameter();
        if(null != v){
            switch (v.getId()){
                case R.id.btn_dictation://听
                    voiceToText();
                    break;
                case R.id.btn_understander://理解
//                    understandVoic();
                    understandTest();
                    break;
                case R.id.btn_speech://讲话

                    break;

            }
        }
    }
}
