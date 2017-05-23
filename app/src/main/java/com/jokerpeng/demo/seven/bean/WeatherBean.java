package com.jokerpeng.demo.seven.bean;

import com.jokerpeng.demo.seven.base.BaseBean;

import java.util.List;

/**
 * Created by PengXiaoJie on 2017/5/23.20 31..
 */

public class WeatherBean extends BaseBean {

    /**
     * webPage : {"header":"","url":"http://kcbj.openspeech.cn/service/iss?wuuid=8a357eb21c390fe0a6aab6a38e84b694&ver=2.0&method=webPage&uuid=31db1e12ee14d1a94a0a7523ecfdf61fquery"}
     * semantic : {"slots":{"location":{"cityAddr":"北京","city":"北京市","type":"LOC_BASIC"},"datetime":{"date":"CURRENT_DAY","type":"DT_BASIC"}}}
     * rc : 0
     * data : {"result":[{"airQuality":"优","sourceName":"中国天气网","date":"2017-05-23","lastUpdateTime":"2017-05-23 18:34:25","dateLong":1495468800,"pm25":"14","city":"北京","humidity":"33%","windLevel":0,"weather":"晴","tempRange":"14℃","wind":"南风微风"},{"airQuality":"","sourceName":"中国天气网","date":"2017-05-24","lastUpdateTime":"2017-05-23 18:34:25","city":"北京","dateLong":1495555200,"windLevel":1,"weather":"多云转晴","tempRange":"17℃~33℃","wind":"西南风3-4级"},{"airQuality":"","sourceName":"中国天气网","date":"2017-05-25","lastUpdateTime":"2017-05-23 18:34:25","city":"北京","dateLong":1495641600,"windLevel":1,"weather":"晴","tempRange":"16℃~32℃","wind":"南风3-4级"},{"airQuality":"","sourceName":"中国天气网","date":"2017-05-26","lastUpdateTime":"2017-05-23 18:34:25","city":"北京","dateLong":1495728000,"windLevel":0,"weather":"晴","tempRange":"18℃~31℃","wind":"南风微风"},{"airQuality":"","sourceName":"中国天气网","date":"2017-05-27","lastUpdateTime":"2017-05-23 18:34:25","city":"北京","dateLong":1495814400,"windLevel":0,"weather":"晴","tempRange":"22℃~33℃","wind":"西南风微风"},{"airQuality":"","sourceName":"中国天气网","date":"2017-05-28","lastUpdateTime":"2017-05-23 18:34:25","city":"北京","dateLong":1495900800,"windLevel":0,"weather":"多云转阴","tempRange":"22℃~35℃","wind":"西南风微风"},{"airQuality":"","sourceName":"中国天气网","date":"2017-05-29","lastUpdateTime":"2017-05-23 18:34:25","city":"北京","dateLong":1495987200,"windLevel":0,"weather":"阴","tempRange":"16℃~29℃","wind":"东风微风"}]}
     */

    private WebPageBean webPage;
    private SemanticBean semantic;
    private DataBean data;

    public WebPageBean getWebPage() {
        return webPage;
    }

    public void setWebPage(WebPageBean webPage) {
        this.webPage = webPage;
    }

    public SemanticBean getSemantic() {
        return semantic;
    }

    public void setSemantic(SemanticBean semantic) {
        this.semantic = semantic;
    }

    public DataBean getData() {
        return data;
    }

    public void setData(DataBean data) {
        this.data = data;
    }

    public static class WebPageBean {
        /**
         * header :
         * url : http://kcbj.openspeech.cn/service/iss?wuuid=8a357eb21c390fe0a6aab6a38e84b694&ver=2.0&method=webPage&uuid=31db1e12ee14d1a94a0a7523ecfdf61fquery
         */

        private String header;
        private String url;

        public String getHeader() {
            return header;
        }

        public void setHeader(String header) {
            this.header = header;
        }

        public String getUrl() {
            return url;
        }

        public void setUrl(String url) {
            this.url = url;
        }
    }

    public static class SemanticBean {
        /**
         * slots : {"location":{"cityAddr":"北京","city":"北京市","type":"LOC_BASIC"},"datetime":{"date":"CURRENT_DAY","type":"DT_BASIC"}}
         */

        private SlotsBean slots;

        public SlotsBean getSlots() {
            return slots;
        }

        public void setSlots(SlotsBean slots) {
            this.slots = slots;
        }

        public static class SlotsBean {
            /**
             * location : {"cityAddr":"北京","city":"北京市","type":"LOC_BASIC"}
             * datetime : {"date":"CURRENT_DAY","type":"DT_BASIC"}
             */

            private LocationBean location;
            private DatetimeBean datetime;

            public LocationBean getLocation() {
                return location;
            }

            public void setLocation(LocationBean location) {
                this.location = location;
            }

            public DatetimeBean getDatetime() {
                return datetime;
            }

            public void setDatetime(DatetimeBean datetime) {
                this.datetime = datetime;
            }

            public static class LocationBean {
                /**
                 * cityAddr : 北京
                 * city : 北京市
                 * type : LOC_BASIC
                 */

                private String cityAddr;
                private String city;
                private String type;
                private String country;
                private String province;
                private String keyword;
                private String area;

                public String getCountry() {
                    return country;
                }

                public void setCountry(String country) {
                    this.country = country;
                }

                public String getProvince() {
                    return province;
                }

                public void setProvince(String province) {
                    this.province = province;
                }

                public String getKeyword() {
                    return keyword;
                }

                public void setKeyword(String keyword) {
                    this.keyword = keyword;
                }

                public String getArea() {
                    return area;
                }

                public void setArea(String area) {
                    this.area = area;
                }

                public String getCityAddr() {
                    return cityAddr;
                }

                public void setCityAddr(String cityAddr) {
                    this.cityAddr = cityAddr;
                }

                public String getCity() {
                    return city;
                }

                public void setCity(String city) {
                    this.city = city;
                }

                public String getType() {
                    return type;
                }

                public void setType(String type) {
                    this.type = type;
                }
            }

            public static class DatetimeBean {
                /**
                 * date : CURRENT_DAY
                 * type : DT_BASIC
                 */

                private String date;
                private String type;
                private String time;

                public String getTime() {
                    return time;
                }

                public void setTime(String time) {
                    this.time = time;
                }

                public String getDate() {
                    return date;
                }

                public void setDate(String date) {
                    this.date = date;
                }

                public String getType() {
                    return type;
                }

                public void setType(String type) {
                    this.type = type;
                }
            }
        }
    }

    public static class DataBean {
        private List<ResultBean> result;

        public List<ResultBean> getResult() {
            return result;
        }

        public void setResult(List<ResultBean> result) {
            this.result = result;
        }

        public static class ResultBean {
            /**
             * airQuality : 优
             * sourceName : 中国天气网
             * date : 2017-05-23
             * lastUpdateTime : 2017-05-23 18:34:25
             * dateLong : 1495468800
             * pm25 : 14
             * city : 北京
             * humidity : 33%
             * windLevel : 0
             * weather : 晴
             * tempRange : 14℃
             * wind : 南风微风
             */

            private String airQuality;
            private String sourceName;
            private String date;
            private String lastUpdateTime;
            private int dateLong;
            private String pm25;
            private String city;
            private String humidity;
            private int windLevel;
            private String weather;
            private String tempRange;
            private String wind;
            private String province;

            public String getProvince() {
                return province;
            }

            public void setProvince(String province) {
                this.province = province;
            }

            public String getAirQuality() {
                return airQuality;
            }

            public void setAirQuality(String airQuality) {
                this.airQuality = airQuality;
            }

            public String getSourceName() {
                return sourceName;
            }

            public void setSourceName(String sourceName) {
                this.sourceName = sourceName;
            }

            public String getDate() {
                return date;
            }

            public void setDate(String date) {
                this.date = date;
            }

            public String getLastUpdateTime() {
                return lastUpdateTime;
            }

            public void setLastUpdateTime(String lastUpdateTime) {
                this.lastUpdateTime = lastUpdateTime;
            }

            public int getDateLong() {
                return dateLong;
            }

            public void setDateLong(int dateLong) {
                this.dateLong = dateLong;
            }

            public String getPm25() {
                return pm25;
            }

            public void setPm25(String pm25) {
                this.pm25 = pm25;
            }

            public String getCity() {
                return city;
            }

            public void setCity(String city) {
                this.city = city;
            }

            public String getHumidity() {
                return humidity;
            }

            public void setHumidity(String humidity) {
                this.humidity = humidity;
            }

            public int getWindLevel() {
                return windLevel;
            }

            public void setWindLevel(int windLevel) {
                this.windLevel = windLevel;
            }

            public String getWeather() {
                return weather;
            }

            public void setWeather(String weather) {
                this.weather = weather;
            }

            public String getTempRange() {
                return tempRange;
            }

            public void setTempRange(String tempRange) {
                this.tempRange = tempRange;
            }

            public String getWind() {
                return wind;
            }

            public void setWind(String wind) {
                this.wind = wind;
            }
        }
    }
}
