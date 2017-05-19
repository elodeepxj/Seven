package com.jokerpeng.demo.seven.application;

import android.app.Application;

import com.iflytek.cloud.SpeechUtility;

/**
 * Created by ${PengXiaoJie} on 2017/5/17.20 49..
 */

public class SevenApplication extends Application {
    @Override
    public void onCreate() {
        super.onCreate();
        SpeechUtility.createUtility(this, "appid=" + "5907f91d");
    }
}
