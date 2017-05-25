package com.jokerpeng.demo.seven.utils;

import com.google.gson.Gson;
import com.jokerpeng.demo.seven.base.BaseBean;
import com.jokerpeng.demo.seven.base.BaseKey;
import com.jokerpeng.demo.seven.bean.AppBean;
import com.jokerpeng.demo.seven.bean.BaikeBean;
import com.jokerpeng.demo.seven.bean.CalcBean;
import com.jokerpeng.demo.seven.bean.ChatBean;
import com.jokerpeng.demo.seven.bean.CookbookBean;
import com.jokerpeng.demo.seven.bean.DateTimeBean;
import com.jokerpeng.demo.seven.bean.FAQBean;
import com.jokerpeng.demo.seven.bean.FlightBean;
import com.jokerpeng.demo.seven.bean.FlowerBean;
import com.jokerpeng.demo.seven.bean.GiftBean;
import com.jokerpeng.demo.seven.bean.HotelBean;
import com.jokerpeng.demo.seven.bean.MapBean;
import com.jokerpeng.demo.seven.bean.MessageBean;
import com.jokerpeng.demo.seven.bean.MusicBean;
import com.jokerpeng.demo.seven.bean.OpenQABean;
import com.jokerpeng.demo.seven.bean.PM25Bean;
import com.jokerpeng.demo.seven.bean.RadioBean;
import com.jokerpeng.demo.seven.bean.RestaurantBean;
import com.jokerpeng.demo.seven.bean.ScheduleBean;
import com.jokerpeng.demo.seven.bean.ShortRentBean;
import com.jokerpeng.demo.seven.bean.StockBean;
import com.jokerpeng.demo.seven.bean.TVBean;
import com.jokerpeng.demo.seven.bean.TelephoneBean;
import com.jokerpeng.demo.seven.bean.TrainBean;
import com.jokerpeng.demo.seven.bean.TranslationBean;
import com.jokerpeng.demo.seven.bean.VideoBean;
import com.jokerpeng.demo.seven.bean.WeatherBean;
import com.jokerpeng.demo.seven.bean.WebSearchBean;
import com.jokerpeng.demo.seven.bean.WebSiteBean;
import com.jokerpeng.demo.seven.bean.WeiboBean;

import org.json.JSONArray;
import org.json.JSONObject;
import org.json.JSONTokener;

/**
 * Json结果解析类
 */
public class JsonParser {

	public static String parseIatResult(String json) {
		StringBuffer ret = new StringBuffer();
		try {
			JSONTokener tokener = new JSONTokener(json);
			JSONObject joResult = new JSONObject(tokener);

			JSONArray words = joResult.getJSONArray("ws");
			for (int i = 0; i < words.length(); i++) {
				// 转写结果词，默认使用第一个结果
				JSONArray items = words.getJSONObject(i).getJSONArray("cw");
				JSONObject obj = items.getJSONObject(0);
				ret.append(obj.getString("w"));
//				如果需要多候选结果，解析数组其他字段
//				for(int j = 0; j < items.length(); j++)
//				{
//					JSONObject obj = items.getJSONObject(j);
//					ret.append(obj.getString("w"));
//				}
			}
		} catch (Exception e) {
			e.printStackTrace();
		} 
		return ret.toString();
	}
	
	public static String parseGrammarResult(String json) {
		StringBuffer ret = new StringBuffer();
		try {
			JSONTokener tokener = new JSONTokener(json);
			JSONObject joResult = new JSONObject(tokener);

			JSONArray words = joResult.getJSONArray("ws");
			for (int i = 0; i < words.length(); i++) {
				JSONArray items = words.getJSONObject(i).getJSONArray("cw");
				for(int j = 0; j < items.length(); j++)
				{
					JSONObject obj = items.getJSONObject(j);
					if(obj.getString("w").contains("nomatch"))
					{
						ret.append("没有匹配结果.");
						return ret.toString();
					}
					ret.append("【结果】" + obj.getString("w"));
					ret.append("【置信度】" + obj.getInt("sc"));
					ret.append("\n");
				}
			}
		} catch (Exception e) {
			e.printStackTrace();
			ret.append("没有匹配结果.");
		} 
		return ret.toString();
	}
	
	public static String parseLocalGrammarResult(String json) {
		StringBuffer ret = new StringBuffer();
		try {
			JSONTokener tokener = new JSONTokener(json);
			JSONObject joResult = new JSONObject(tokener);

			JSONArray words = joResult.getJSONArray("ws");
			for (int i = 0; i < words.length(); i++) {
				JSONArray items = words.getJSONObject(i).getJSONArray("cw");
				for(int j = 0; j < items.length(); j++)
				{
					JSONObject obj = items.getJSONObject(j);
					if(obj.getString("w").contains("nomatch"))
					{
						ret.append("没有匹配结果.");
						return ret.toString();
					}
					ret.append("【结果】" + obj.getString("w"));
					ret.append("\n");
				}
			}
			ret.append("【置信度】" + joResult.optInt("sc"));

		} catch (Exception e) {
			e.printStackTrace();
			ret.append("没有匹配结果.");
		} 
		return ret.toString();
	}

	/*
	* 语义理解解析
	* */
	public static String parseUnderstanderResult(String json){
		Gson gson = new Gson();
		BaseBean baseBean = gson.fromJson(json, BaseBean.class);
		if(!BaseKey.SUCCESS_CODE.equals(baseBean.getRc())){
			return null;
		}
		String result = null;
		switch (baseBean.getService()){
			case BaseKey.SERVICE_APP://app
				AppBean appBean = gson.fromJson(json,AppBean.class);
				if(BaseKey.OPERATION_LAUNCH.equals(baseBean.getOperation())){//打开应用

				}else if(BaseKey.OPERATION_QUERY.equals(baseBean.getOperation())){//查找应用

				}else if(BaseKey.OPERATION_DOWNLOAD.equals(baseBean.getOperation())){//下载应用

				}else {

				}
				break;
			case BaseKey.SERVICE_AIR_CONTROL://空调控制

				break;
			case BaseKey.SERVICE_BAIKE://百科
				BaikeBean baikeBean = gson.fromJson(json,BaikeBean.class);
				if(BaseKey.OPERATION_ANSWER.equals(baseBean.getOperation())){
					return baikeBean.getAnswer().getText();
				}
				break;
			case BaseKey.SERVICE_CALC://計算
                CalcBean calcBean = gson.fromJson(json,CalcBean.class);
                if(BaseKey.OPERATION_ANSWER.equals(baseBean.getOperation())){
					return calcBean.getAnswer().getText();
                }
				break;
			case BaseKey.SERVICE_CHAT://閒聊
                ChatBean chatBean = gson.fromJson(json,ChatBean.class);
                if(BaseKey.OPERATION_ANSWER.equals(baseBean.getOperation())){
					return chatBean.getAnswer().getText();
                }
				break;
			case BaseKey.SERVICE_COOKBOOK://菜譜
                CookbookBean cookbookBean = gson.fromJson(json,CookbookBean.class);
                if(BaseKey.OPERATION_QUERY.equals(baseBean.getOperation())){

                }
				break;
			case BaseKey.SERVICE_DATETIME:
                DateTimeBean dateTimeBean = gson.fromJson(json, DateTimeBean.class);
                if(BaseKey.OPERATION_ANSWER.equals(baseBean.getOperation())){
					return dateTimeBean.getAnswer().getText();
                }
				break;
			case BaseKey.SERVICE_FAQ:
                FAQBean faqBean = gson.fromJson(json,FAQBean.class);
                if(BaseKey.OPERATION_ANSWER.equals(baseBean.getOperation())){
					return faqBean.getAnswer().getText();
                }
				break;
			case BaseKey.SERVICE_FLIGHT:
                FlightBean flightBean = gson.fromJson(json,FlightBean.class);
                if(BaseKey.OPERATION_QUERY.equals(baseBean.getOperation())){

                }
				break;
			case BaseKey.SERVICE_FLOWER:
				FlowerBean flowerBean = gson.fromJson(json,FlowerBean.class);
				if(BaseKey.OPERATION_QUERY.equals(baseBean.getOperation())){

				}
				break;
			case BaseKey.SERVICE_GIFT:
				GiftBean giftBean = gson.fromJson(json,GiftBean.class);
				if(BaseKey.OPERATION_QUERY.equals(baseBean.getOperation())){

				}
				break;
			case BaseKey.SERVICE_HOTEL:
				HotelBean hotelBean = gson.fromJson(json,HotelBean.class);
				if(BaseKey.OPERATION_QUERY.equals(baseBean.getOperation())){

				}else if(BaseKey.OPERATION_BOOK.equals(baseBean.getOperation())){

				}
				break;
			case BaseKey.SERVICE_MAP:
				MapBean mapBean = gson.fromJson(json,MapBean.class);
				if(BaseKey.OPERATION_POSITION.equals(baseBean.getOperation())){

				}else if(BaseKey.OPERATION_ROUTE.equals(baseBean.getOperation())){

				}
				break;
			case BaseKey.SERVICE_MESSAGE:
				MessageBean messageBean = gson.fromJson(json,MessageBean.class);
				if(BaseKey.OPERATION_SEND.equals(baseBean.getOperation())){

				}
				break;
			case BaseKey.SERVICE_MUSIC:
				MusicBean musicBean = gson.fromJson(json,MusicBean.class);
				if(BaseKey.OPERATION_PLAY.equals(baseBean.getOperation())){

				}
				break;
			case BaseKey.SERVICE_OPEN_QA://情绪问答,问候
				OpenQABean openQABean = gson.fromJson(json,OpenQABean.class);
				if(BaseKey.OPERATION_ANSWER.equals(baseBean.getOperation())){
					return openQABean.getAnswer().getText();
				}
				break;
			case BaseKey.SERVICE_PM25:
				PM25Bean pm25Bean = gson.fromJson(json,PM25Bean.class);
				if(BaseKey.OPERATION_QUERY.equals(baseBean.getOperation())){

				}
				break;
			case BaseKey.SERVICE_RADIO:
				RadioBean radioBean = gson.fromJson(json,RadioBean.class);
				if(BaseKey.OPERATION_LAUNCH.equals(baseBean.getOperation())){

				}
				break;
			case BaseKey.SERVICE_RESTAURANT:
				RestaurantBean restaurantBean = gson.fromJson(json,RestaurantBean.class);
				if(BaseKey.OPERATION_QUERY.equals(baseBean.getOperation())){

				}
				break;
			case BaseKey.SERVICE_SCHEDULE:
				ScheduleBean scheduleBean = gson.fromJson(json,ScheduleBean.class);
				if(BaseKey.OPERATION_CREATE.equals(baseBean.getOperation())){

				}
				break;
			case BaseKey.SERVICE_SHORTRENT:
				ShortRentBean shortRentBean = gson.fromJson(json,ShortRentBean.class);
				if(BaseKey.OPERATION_QUERY.equals(baseBean.getOperation())){

				}
				break;
			case BaseKey.SERVICE_STOCK:
				StockBean stockBean = gson.fromJson(json,StockBean.class);
				if(BaseKey.OPERATION_QUERY.equals(baseBean.getOperation())){

				}
				break;
			case BaseKey.SERVICE_TELEPHONE:
				TelephoneBean telephoneBean = gson.fromJson(json,TelephoneBean.class);
				if(BaseKey.OPERATION_CALL.equals(baseBean.getOperation())){

				}
				break;
			case BaseKey.SERVICE_TRAIN:
				TrainBean trainBean = gson.fromJson(json,TrainBean.class);
				if(BaseKey.OPERATION_QUERY.equals(baseBean.getOperation())){

				}
				break;
			case BaseKey.SERVICE_TRANSLATION:
				TranslationBean translationBean = gson.fromJson(json,TranslationBean.class);
				if(BaseKey.OPERATION_TRANSLATION.equals(baseBean.getOperation())){

				}
				break;
			case BaseKey.SERVICE_TV:
				TVBean tvBean = gson.fromJson(json,TVBean.class);
				if(BaseKey.OPERATION_QUERY_TV.equals(baseBean.getOperation())){

				}else if(BaseKey.OPERATION_QUERY_PROGRAM.equals(baseBean.getOperation())){

				}
				break;
			case BaseKey.SERVICE_TV_CONTROL:

				break;
			case BaseKey.SERVICE_VIDEO:
				VideoBean videoBean = gson.fromJson(json,VideoBean.class);
				if(BaseKey.OPERATION_QUERY.equals(baseBean.getOperation())){

				}else if(BaseKey.OPERATION_PLAY.equals(baseBean.getOperation())){

				}
				break;
			case BaseKey.SERVICE_WEATHER:
				WeatherBean weatherBean = gson.fromJson(json,WeatherBean.class);
				if(BaseKey.OPERATION_QUERY.equals(baseBean.getOperation())){

				}
				break;
			case BaseKey.SERVICE_WEBSEARCH:
				WebSearchBean webSearchBean = gson.fromJson(json,WebSearchBean.class);
				if(BaseKey.OPERATION_QUERY.equals(baseBean.getOperation())){

				}
				break;
			case BaseKey.SERVICE_WEBSITE:
				WebSiteBean webSiteBean = gson.fromJson(json,WebSiteBean.class);
				if(BaseKey.OPERATION_OPEN.equals(baseBean.getOperation())){

				}
				break;
			case BaseKey.SERVICE_WEIBO:
				WeiboBean weiboBean = gson.fromJson(json,WeiboBean.class);
				if(BaseKey.OPERATION_VIEW.equals(baseBean.getOperation())){

				}else if(BaseKey.OPERATION_PUBLISH.equals(baseBean.getOperation())){

				}
				break;
		}
		return result;
	}
}
