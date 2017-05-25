package com.jokerpeng.demo.seven.presenter;

import android.content.Context;
import android.text.TextUtils;

import com.jokerpeng.demo.seven.base.BaseKey;
import com.jokerpeng.demo.seven.utils.ACache;

/**
 * Created by PengXiaoJie on 2017/5/24.14 40..
 */

public class SettingManager {
    /**
     * 缓存讲话声音
     * */
    static void setSpeechVoice(Context context,String content){
        ACache.get(context).put(BaseKey.SPEECH_VOICE,content);
    }
    /**
     * 缓存讲话速度
     * */
    static void setSpeechSpeed(Context context,String content){
        ACache.get(context).put(BaseKey.SPEECH_SPEED,content);
    }
    /**
     * 缓存讲话音调
     * */
    static void setSpeechPitch(Context context,String content){
        ACache.get(context).put(BaseKey.SPEECH_PITCH,content);
    }
    /**
     * 缓存讲话音量
     * */
    static void setSpeechVolume(Context context,String content){
        ACache.get(context).put(BaseKey.SPEECH_VOLUME,content);
    }
    /**
     * 缓存识别语言
     * */
    static void setDictationLanguage(Context context,String content){
        ACache.get(context).put(BaseKey.DICTATION_LANGUAGE,content);
    }
    /**
     * 缓存识别方言
     * */
    static void setDictationAccent(Context context,String content){
        ACache.get(context).put(BaseKey.DICTATION_ACCENT,content);
    }
    /**
     * 缓存前端点静音时间
     * */
    static void setFrontEndMuteTime(Context context,String content){
        ACache.get(context).put(BaseKey.FRONT_END_MUTE_TIME,content);
    }
    /**
     * 缓存后端点静音时间
     * */
    static void setBackEndMuteTime(Context context,String content){
        ACache.get(context).put(BaseKey.BACK_END_MUTE_TIME,content);
    }
    /**
     * 获得缓存的说话声音
     * */
    static String getSpeechVoice(Context context){
        if(!TextUtils.isEmpty(ACache.get(context).getAsString(BaseKey.SPEECH_VOICE))){
            return ACache.get(context).getAsString(BaseKey.SPEECH_VOICE);
        }
        return BaseKey.DEFAULT_SPEECH_VOICE;
    }
    /**
     * 获得缓存的说话速度
     * */
    static String getSpeechSpeed(Context context){
        if(!TextUtils.isEmpty(ACache.get(context).getAsString(BaseKey.SPEECH_SPEED))){
            return ACache.get(context).getAsString(BaseKey.SPEECH_SPEED);
        }
        return BaseKey.DEFAULT_SPEECH_SPEED;
    }
    /**
     * 获取缓存的说话音调
     * */
    static String getSpeechPitch(Context context){
        if(!TextUtils.isEmpty(ACache.get(context).getAsString(BaseKey.SPEECH_PITCH))){
            return ACache.get(context).getAsString(BaseKey.SPEECH_PITCH);
        }
        return BaseKey.DEFAULT_SPEECH_PITCH;
    }
    /**
     * 获取缓存的说话音量
     * */
    static String getSpeechVolume(Context context){
        if(!TextUtils.isEmpty(ACache.get(context).getAsString(BaseKey.SPEECH_VOLUME))){
            return ACache.get(context).getAsString(BaseKey.SPEECH_VOLUME);
        }
        return BaseKey.DEFAULT_SPEECH_VOLUME;
    }
    /**
     * 获取缓存的识别语言
     * */
    static String getDictationLanguage(Context context){
        if(!TextUtils.isEmpty(ACache.get(context).getAsString(BaseKey.DICTATION_LANGUAGE))){
            return ACache.get(context).getAsString(BaseKey.DICTATION_LANGUAGE);
        }
        return BaseKey.DEFAULT_DICTATION_LANGUAGE;
    }
    /**
     * 获取缓存的识别方言
     * */
    static String getDictationAccent(Context context){
        if(!TextUtils.isEmpty(ACache.get(context).getAsString(BaseKey.DICTATION_ACCENT))){
            return ACache.get(context).getAsString(BaseKey.DICTATION_ACCENT);
        }
        return BaseKey.DEFAULT_DICTATION_ACCENT;
    }
    /**
     * 获取缓存的前端点静音时间
     * */
    static String getFrontEndMuteTime(Context context){
        if(!TextUtils.isEmpty(ACache.get(context).getAsString(BaseKey.FRONT_END_MUTE_TIME))){
            return ACache.get(context).getAsString(BaseKey.FRONT_END_MUTE_TIME);
        }
        return BaseKey.DEFAULT_FRONT_END_MUTE_TIME;
    }
    /**
     * 获取缓存的后端点静音时间
     * */
    static String getBackEndMuteTime(Context context){
        if(!TextUtils.isEmpty(ACache.get(context).getAsString(BaseKey.BACK_END_MUTE_TIME))){
            return ACache.get(context).getAsString(BaseKey.BACK_END_MUTE_TIME);
        }
        return BaseKey.DEFAULT_BACK_END_MUTE_TIME;
    }
}
