package com.jokerpeng.demo.seven.utils;

import android.Manifest;
import android.app.Activity;
import android.content.pm.PackageManager;
import android.os.Build;
import android.support.v4.app.ActivityCompat;

import com.jokerpeng.demo.seven.base.BaseKey;

/**
 * Created by ${PengXiaoJie} on 2017/5/19.19 11..
 */

public class CommonUtils {
    /**
     * SD卡读写权限,开启摄像头权限,手机状态,录音
     */
    private static final String[] PERMISSION = new String[]{
            Manifest.permission.WRITE_EXTERNAL_STORAGE,
            Manifest.permission.READ_EXTERNAL_STORAGE,
            Manifest.permission.CAMERA,
            Manifest.permission.READ_PHONE_STATE,
            Manifest.permission.RECORD_AUDIO,
//            Manifest.permission.READ_CALENDAR,
//            Manifest.permission.ACCESS_FINE_LOCATION,
//            Manifest.permission.BODY_SENSORS,
//            Manifest.permission.SEND_SMS
    };


    /**
     * 用于OCR识别
     * SD卡读写权限,开启摄像头权限
     *
     * @param activity
     * @param b        用于判断是否需要动态申请权限
     */
    public static void verifyPermissions(Activity activity, boolean b) {
        if (b) {
            BaseKey.WRITE_EXTERNAL_STORAGE = ActivityCompat.checkSelfPermission(activity,Manifest.permission.WRITE_EXTERNAL_STORAGE);
            BaseKey.READ_EXTERNAL_STORAGE = ActivityCompat.checkSelfPermission(activity,Manifest.permission.READ_EXTERNAL_STORAGE);
            BaseKey.CAMERA = ActivityCompat.checkSelfPermission(activity,Manifest.permission.CAMERA);
            BaseKey.READ_PHONE_STATE = ActivityCompat.checkSelfPermission(activity,Manifest.permission.READ_PHONE_STATE);
            BaseKey.RECORD_AUDIO = ActivityCompat.checkSelfPermission(activity,Manifest.permission.RECORD_AUDIO);
//            BaseKey.ACCESS_FINE_LOCATION = ActivityCompat.checkSelfPermission(activity,Manifest.permission.ACCESS_FINE_LOCATION);
//            BaseKey.BODY_SENSORS = ActivityCompat.checkSelfPermission(activity,Manifest.permission.BODY_SENSORS);
//            BaseKey.READ_CALENDAR = ActivityCompat.checkSelfPermission(activity,Manifest.permission.READ_CALENDAR);
//            BaseKey.BODY_SENSORS = ActivityCompat.checkSelfPermission(activity,Manifest.permission.BODY_SENSORS);
//            BaseKey.SEND_SMS = ActivityCompat.checkSelfPermission(activity,Manifest.permission.SEND_SMS);
            if (BaseKey.WRITE_EXTERNAL_STORAGE != PackageManager.PERMISSION_GRANTED ||
                    BaseKey.READ_EXTERNAL_STORAGE != PackageManager.PERMISSION_GRANTED ||
                    BaseKey.CAMERA != PackageManager.PERMISSION_GRANTED ||
                    BaseKey.READ_PHONE_STATE != PackageManager.PERMISSION_GRANTED ||
                    BaseKey.RECORD_AUDIO != PackageManager.PERMISSION_GRANTED
//                    BaseKey.ACCESS_FINE_LOCATION != PackageManager.PERMISSION_GRANTED ||
//                    BaseKey.BODY_SENSORS != PackageManager.PERMISSION_GRANTED ||
//                    BaseKey.READ_CALENDAR != PackageManager.PERMISSION_GRANTED ||
//                    BaseKey.BODY_SENSORS != PackageManager.PERMISSION_GRANTED ||
//                    BaseKey.SEND_SMS != PackageManager.PERMISSION_GRANTED ||
                    ) {
                ActivityCompat.requestPermissions(activity, PERMISSION,
                        BaseKey.REQUEST_PERMISSION);
            }
        }
    }


    /**
     * 判断SDK版本号
     */
    public static boolean verifySdkVersion() {
        if (Build.VERSION.SDK_INT < 23) {
            return false;
        } else {
            return true;
        }
    }
}
