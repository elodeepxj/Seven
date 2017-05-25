package com.jokerpeng.demo.seven.base;

/**
 * Created by ${PengXiaoJie} on 2017/5/19.19 26..
 */

public class BaseKey {
    public static final String KEY = "appid=5907f91d";
    public static final int REQUEST_PERMISSION = 100;
    public static int WRITE_EXTERNAL_STORAGE;
    public static int READ_EXTERNAL_STORAGE;
    public static int CAMERA;
    public static int READ_PHONE_STATE;
    public static int RECORD_AUDIO;
//    public static int READ_CALENDAR;
//    public static int SEND_SMS;
//    public static int ACCESS_FINE_LOCATION;
//    public static int BODY_SENSORS;

    public static final String SUCCESS_CODE = "0";

    //TODO(操作)
    /**
    * 查询
    * */
    public static final String OPERATION_QUERY = "QUERY";
    /**
    * 打电话
    * */
    public static final String OPERATION_CALL = "CALL";
    /**
    * 发送
    * */
    public static final String OPERATION_SEND = "SEND";
    /**
    * 创建
    * */
    public static final String OPERATION_CREATE = "CREATE";
    /**
    * 路线
    * */
    public static final String OPERATION_ROUTE = "ROUTE";
    /**
    * 位置
    * */
    public static final String OPERATION_POSITION = "POSITION";
    /**
    * 下载
    * */
    public static final String OPERATION_DOWNLOAD = "DOWNLOAD";
    /**
    * 打开应用
    * */
    public static final String OPERATION_LAUNCH = "LAUNCH";
    /**
    * 预定
    * */
    public static final String OPERATION_BOOK = "BOOK";
    /**
    * TV控制
    * */
    public static final String OPERATION_CONTROLs = "CONTROL";
    /**
    * 打开视图类
    * */
    public static final String OPERATION_VIEW = "VIEW";
    /**
    * 发布微博
    * */
    public static final String OPERATION_PUBLISH = "PUBLISH";
    /**
    * 翻译
    * */
    public static final String OPERATION_TRANSLATION = "TRANSLATION";
    /**
    * 查询某个节目类型或者节目名称
    * */
    public static final String OPERATION_QUERY_PROGRAM	 = "QUERY_PROGRAM";
    /**
    * 查询电视
    * */
    public static final String OPERATION_QUERY_TV	 = "QUERY_TV";
    /**
    * 打开网页网站
    * */
    public static final String OPERATION_OPEN = "OPEN";
    /**
    * 设置
    * */
    public static final String OPERATION_SET = "SET";
    /**
    * 关闭
    * */
    public static final String OPERATION_CLOSE = "CLOSE";
    /**
    * 回答
    * */
    public static final String OPERATION_ANSWER = "ANSWER";
    /**
    * 播放
    * */
    public static final String OPERATION_PLAY = "PLAY";

   //TODO(服务)


    /**
    * telephone
    * */
    public static final String SERVICE_TELEPHONE = "telephone";
    /**
    * 闲聊
    * */
    public static final String SERVICE_CHAT = "chat";
    /**
    * 社区问答
    * */
    public static final String SERVICE_FAQ = "faq";
    /**
    * 百科
    * */
    public static final String SERVICE_BAIKE = "baike";
    /**
    * 计算
    * */
    public static final String SERVICE_CALC = "calc";
    /**
    * 日期计算
    * */
    public static final String SERVICE_DATETIME = "datetime";
    /**
    * 情绪问答,问候
    * */
    public static final String SERVICE_OPEN_QA = "openQA";
    /**
    * message
    * */
    public static final String SERVICE_MESSAGE = "message";
    /**
    * 房子短租
    * */
    public static final String SERVICE_SHORTRENT = "shortRent";
    /**
    * 礼品
    * */
    public static final String SERVICE_GIFT = "gift";
    /**
    * 鲜花
    * */
    public static final String SERVICE_FLOWER = "flower";
    /**
    * 菜谱
    * */
    public static final String SERVICE_COOKBOOK = "cookbook";
    /**
    * 电视预告节目
    * */
    public static final String SERVICE_TV = "tv";
    /**
    * app应用
    * */
    public static final String SERVICE_APP = "app";
    /**
    * 酒店
    * */
    public static final String SERVICE_HOTEL = "hotel";
    /**
    * 航班
    * */
    public static final String SERVICE_FLIGHT = "flight";
    /**
    * 天气
    * */
    public static final String SERVICE_WEATHER = "weather";
    /**
    * 餐馆
    * */
    public static final String SERVICE_RESTAURANT = "restaurant";
    /**
    * 火车
    * */
    public static final String SERVICE_TRAIN = "train";
    /**
    * 地图
    * */
    public static final String SERVICE_MAP = "map";
    /**
    * 日程安排
    * */
    public static final String SERVICE_SCHEDULE = "schedule";
    /**
    * 音乐
    * */
    public static final String SERVICE_MUSIC = "music";
    /**
    * 视频
    * */
    public static final String SERVICE_VIDEO = "video";
    /**
    * 股票
    * */
    public static final String SERVICE_STOCK = "stock";
    /**
    * 网页搜索
    * */
    public static final String SERVICE_WEBSEARCH = "websearch";
    /**
    * 网站
    * */
    public static final String SERVICE_WEBSITE = "website";
    /**
    * 翻译
    * */
    public static final String SERVICE_TRANSLATION = "translation";
    /**
    * 微博（OPERATION_SEND,OPERATION_VIEW）
    * */
    public static final String SERVICE_WEIBO = "weibo";
    /**
    * 电台
    * */
    public static final String SERVICE_RADIO = "radio";
    /**
    * 空气质量
    * */
    public static final String SERVICE_PM25 = "pm25";
    /**
    * 电视控制
    * */
    public static final String SERVICE_TV_CONTROL = "tvControl";
    /**
    * 空调控制
    * */
    public static final String SERVICE_AIR_CONTROL = "airControl";

    //TODO(设置)
    /**
    * 说话声音选择
    * */
    public static final String SPEECH_VOICE = "SPEECH_VOICE";
    /**
     * 说话速度
     * */
    public static final String SPEECH_SPEED = "SPEECH_SPEED";
    /**
     * 说话音调
     * */
    public static final String SPEECH_PITCH = "SPEECH_PITCH";
    /**
     * 说话音量
     * */
    public static final String SPEECH_VOLUME = "SPEECH_VOLUME";
    /**
     * 识别语言
     * */
    public static final String DICTATION_LANGUAGE = "DICTATION_LANGUAGE";
    /**
     * 识别方言
     * */
    public static final String DICTATION_ACCENT = "DICTATION_ACCENT";
    /**
     * 前端点静音时间
     * */
    public static final String FRONT_END_MUTE_TIME = "FRONT_END_MUTE_TIME";
    /**
     * 后端点静音时间
     * */
    public static final String BACK_END_MUTE_TIME = "BACK_END_MUTE_TIME";
    /**
     * 默认说话速度
     * */
    public static final String DEFAULT_SPEECH_SPEED = "50";
    /**
     * 默认说话声音
     * */
    public static final String DEFAULT_SPEECH_VOICE = "xiaoyan";
    /**
     * 默认说话音调
     * */
    public static final String DEFAULT_SPEECH_PITCH = "50";
    /**
     * 默认说话音量
     * */
    public static final String DEFAULT_SPEECH_VOLUME = "50";
    /**
     * 默认识别语言
     * */
    public static final String DEFAULT_DICTATION_LANGUAGE = "zh_cn";
    /**
     * 默认识别方言
     * */
    public static final String DEFAULT_DICTATION_ACCENT = "mandarin";
    /**
     * 默认前端点静音时间
     * */
    public static final String DEFAULT_FRONT_END_MUTE_TIME = "4000";
    /**
     * 默认后端点静音时间
     * */
    public static final String DEFAULT_BACK_END_MUTE_TIME = "1000";



}
