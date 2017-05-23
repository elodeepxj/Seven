package com.jokerpeng.demo.seven.utils;

import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

/**
 * Created by ${PengXiaoJie} on 2017/5/22.11 22..
 */

public class CommonJSONParser {

    public Map<String,Object> parse(String jsonStr){
        Map<String,Object> result = null;
        if(null != jsonStr){
            try {
                JSONObject jsonObject = new JSONObject(jsonStr);
                result = parseJSONObject(jsonObject);
            } catch (JSONException e) {
                e.printStackTrace();
            }
        }
        return result;
    }

    private Map<String, Object> parseJSONObject(JSONObject jsonObject) throws JSONException {

        Map<String,Object> valueObject = null;
        if(null != jsonObject){
            valueObject = new HashMap<String,Object>();
            Iterator<String> keyIterator = jsonObject.keys();
            while (keyIterator.hasNext()){
                String keyStr = keyIterator.next();
                Object itemObject = jsonObject.opt(keyStr);
                if(null != itemObject){
                    valueObject.put(keyStr,parseValue(itemObject));
                }
            }
        }
        return valueObject;
    }

    private Object parseValue(Object itemObject) throws JSONException {
        Object outputObject = null;
        if(null != itemObject){
            if(itemObject instanceof JSONArray){
                outputObject = parseJSONArray((JSONArray) itemObject);
            }else if (itemObject instanceof JSONObject) {
                outputObject = parseJSONObject((JSONObject) itemObject);
            } else if (itemObject instanceof String || itemObject instanceof Boolean || itemObject instanceof Integer) {
                outputObject = itemObject;
            }
        }
        return outputObject;
    }

    private Object parseJSONArray(JSONArray jsonArray) throws JSONException {
        List<Object> valueList = null;
        if(null != jsonArray){
            valueList = new ArrayList<Object>();
            for(int i = 0;i<jsonArray.length();i++){
                Object itemObject = jsonArray.get(i);
                if(null != itemObject){
                    valueList.add(parseValue(itemObject));
                }
            }
        }
        return valueList;
    }
}
