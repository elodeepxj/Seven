package com.jokerpeng.demo.seven.bean;

import com.jokerpeng.demo.seven.base.BaseBean;

import java.util.List;

/**
 * Created by PengXiaoJie on 2017/5/23.20 25..
 */

public class PM25Bean extends BaseBean {

    /**
     * webPage : {"header":"为您找到以下结果","url":"http://kcbj.openspeech.cn/service/iss?wuuid=a7087d5eedace17751aa422d75940084&ver=2.0&method=webPage&uuid=fd0431d661a53eccf35dca4fefbcd1d5query"}
     * semantic : {"slots":{"location":{"cityAddr":"成都","city":"成都市","type":"LOC_BASIC"}}}
     * rc : 0
     * data : {"result":[{"sourceName":"PM2.5监测网","aqi":43,"publishDateTime":"2017-05-21 11:00:00","subArea":"蒲江县","publishDateTimeLong":1495335600,"pm25":26,"positionName":"全局监测","quality":"优","area":"成都"},{"sourceName":"PM2.5监测网","aqi":43,"publishDateTime":"2017-05-21 11:00:00","subArea":"金堂县","publishDateTimeLong":1495335600,"pm25":26,"positionName":"全局监测","quality":"优","area":"成都"},{"sourceName":"PM2.5监测网","aqi":43,"publishDateTime":"2017-05-21 11:00:00","subArea":"青白江区","publishDateTimeLong":1495335600,"pm25":26,"positionName":"全局监测","quality":"优","area":"成都"},{"sourceName":"PM2.5监测网","aqi":43,"publishDateTime":"2017-05-21 11:00:00","subArea":"成华区","publishDateTimeLong":1495335600,"pm25":26,"positionName":"全局监测","quality":"优","area":"成都"},{"sourceName":"PM2.5监测网","aqi":43,"publishDateTime":"2017-05-21 11:00:00","subArea":"金牛区","publishDateTimeLong":1495335600,"pm25":26,"positionName":"全局监测","quality":"优","area":"成都"},{"sourceName":"PM2.5监测网","aqi":43,"publishDateTime":"2017-05-21 11:00:00","subArea":"武侯区","publishDateTimeLong":1495335600,"pm25":26,"positionName":"全局监测","quality":"优","area":"成都"},{"sourceName":"PM2.5监测网","aqi":43,"publishDateTime":"2017-05-21 11:00:00","subArea":"新津县","publishDateTimeLong":1495335600,"pm25":26,"positionName":"全局监测","quality":"优","area":"成都"},{"sourceName":"PM2.5监测网","aqi":43,"publishDateTime":"2017-05-21 11:00:00","subArea":"新都区","publishDateTimeLong":1495335600,"pm25":26,"positionName":"全局监测","quality":"优","area":"成都"},{"sourceName":"PM2.5监测网","aqi":43,"publishDateTime":"2017-05-21 11:00:00","subArea":"彭州市","publishDateTimeLong":1495335600,"pm25":26,"positionName":"全局监测","quality":"优","area":"成都"},{"sourceName":"PM2.5监测网","aqi":43,"publishDateTime":"2017-05-21 11:00:00","subArea":"锦江区","publishDateTimeLong":1495335600,"pm25":26,"positionName":"全局监测","quality":"优","area":"成都"},{"sourceName":"PM2.5监测网","aqi":43,"publishDateTime":"2017-05-21 11:00:00","subArea":"都江堰市","publishDateTimeLong":1495335600,"pm25":26,"positionName":"全局监测","quality":"优","area":"成都"},{"sourceName":"PM2.5监测网","aqi":43,"publishDateTime":"2017-05-21 11:00:00","subArea":"青羊区","publishDateTimeLong":1495335600,"pm25":26,"positionName":"全局监测","quality":"优","area":"成都"},{"sourceName":"PM2.5监测网","aqi":43,"publishDateTime":"2017-05-21 11:00:00","subArea":"邛崃市","publishDateTimeLong":1495335600,"pm25":26,"positionName":"全局监测","quality":"优","area":"成都"},{"sourceName":"PM2.5监测网","aqi":43,"publishDateTime":"2017-05-21 11:00:00","subArea":"郫县","publishDateTimeLong":1495335600,"pm25":26,"positionName":"全局监测","quality":"优","area":"成都"},{"sourceName":"PM2.5监测网","aqi":43,"publishDateTime":"2017-05-21 11:00:00","subArea":"双流县","publishDateTimeLong":1495335600,"pm25":26,"positionName":"全局监测","quality":"优","area":"成都"},{"sourceName":"PM2.5监测网","aqi":43,"publishDateTime":"2017-05-21 11:00:00","subArea":"龙泉驿区","publishDateTimeLong":1495335600,"pm25":26,"positionName":"全局监测","quality":"优","area":"成都"},{"sourceName":"PM2.5监测网","aqi":43,"publishDateTime":"2017-05-21 11:00:00","subArea":"温江区","publishDateTimeLong":1495335600,"pm25":26,"positionName":"全局监测","quality":"优","area":"成都"},{"sourceName":"PM2.5监测网","aqi":43,"publishDateTime":"2017-05-21 11:00:00","subArea":"崇州市","publishDateTimeLong":1495335600,"pm25":26,"positionName":"全局监测","quality":"优","area":"成都"},{"sourceName":"PM2.5监测网","aqi":43,"publishDateTime":"2017-05-21 11:00:00","subArea":"大邑县","publishDateTimeLong":1495335600,"pm25":26,"positionName":"全局监测","quality":"优","area":"成都"},{"sourceName":"PM2.5监测网","aqi":43,"publishDateTime":"2017-05-21 11:00:00","subArea":"成都","publishDateTimeLong":1495335600,"pm25":26,"positionName":"全局监测","quality":"优","area":"成都"},{"sourceName":"PM2.5监测网","aqi":32,"publishDateTime":"2017-05-21 11:00:00","subArea":"成都","publishDateTimeLong":1495335600,"pm25":22,"positionName":"大石西路","quality":"优","area":"成都"},{"sourceName":"PM2.5监测网","aqi":68,"publishDateTime":"2017-05-21 11:00:00","subArea":"成都","publishDateTimeLong":1495335600,"pm25":32,"positionName":"金泉两河","quality":"良","area":"成都"},{"sourceName":"PM2.5监测网","aqi":32,"publishDateTime":"2017-05-21 11:00:00","subArea":"成都","publishDateTimeLong":1495335600,"pm25":20,"positionName":"君平街","quality":"优","area":"成都"},{"sourceName":"PM2.5监测网","aqi":57,"publishDateTime":"2017-05-21 11:00:00","subArea":"成都","publishDateTimeLong":1495335600,"pm25":30,"positionName":"梁家巷","quality":"良","area":"成都"},{"sourceName":"PM2.5监测网","aqi":22,"publishDateTime":"2017-05-21 11:00:00","subArea":"成都","publishDateTimeLong":1495335600,"pm25":14,"positionName":"灵岩寺","quality":"优","area":"成都"},{"sourceName":"PM2.5监测网","aqi":59,"publishDateTime":"2017-05-21 11:00:00","subArea":"成都","publishDateTimeLong":1495335600,"pm25":42,"positionName":"美国领事馆","quality":"良","area":"成都"},{"sourceName":"PM2.5监测网","aqi":31,"publishDateTime":"2017-05-21 11:00:00","subArea":"成都","publishDateTimeLong":1495335600,"pm25":16,"positionName":"三瓦窑","quality":"优","area":"成都"},{"sourceName":"PM2.5监测网","aqi":38,"publishDateTime":"2017-05-21 11:00:00","subArea":"成都","publishDateTimeLong":1495335600,"pm25":25,"positionName":"沙河铺","quality":"优","area":"成都"},{"sourceName":"PM2.5监测网","aqi":54,"publishDateTime":"2017-05-21 11:00:00","subArea":"成都","publishDateTimeLong":1495335600,"pm25":36,"positionName":"十里店","quality":"良","area":"成都"},{"sourceName":"PM2.5监测网","aqi":30,"publishDateTime":"2015-06-24 20:00:00","subArea":"成都","publishDateTimeLong":1435147200,"pm25":14,"positionName":"草堂寺","quality":"优","area":"成都"}]}
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
         * header : 为您找到以下结果
         * url : http://kcbj.openspeech.cn/service/iss?wuuid=a7087d5eedace17751aa422d75940084&ver=2.0&method=webPage&uuid=fd0431d661a53eccf35dca4fefbcd1d5query
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
         * slots : {"location":{"cityAddr":"成都","city":"成都市","type":"LOC_BASIC"}}
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
             * location : {"cityAddr":"成都","city":"成都市","type":"LOC_BASIC"}
             */

            private LocationBean location;

            public LocationBean getLocation() {
                return location;
            }

            public void setLocation(LocationBean location) {
                this.location = location;
            }

            public static class LocationBean {
                /**
                 * cityAddr : 成都
                 * city : 成都市
                 * type : LOC_BASIC
                 */

                private String cityAddr;
                private String city;
                private String type;
                private String country;
                private String province;
                private String keyword;
                private String area;
                private String datetime;

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

                public String getDatetime() {
                    return datetime;
                }

                public void setDatetime(String datetime) {
                    this.datetime = datetime;
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
             * sourceName : PM2.5监测网
             * aqi : 43
             * publishDateTime : 2017-05-21 11:00:00
             * subArea : 蒲江县
             * publishDateTimeLong : 1495335600
             * pm25 : 26
             * positionName : 全局监测
             * quality : 优
             * area : 成都
             */

            private String sourceName;
            private int aqi;
            private String publishDateTime;
            private String subArea;
            private int publishDateTimeLong;
            private int pm25;
            private String positionName;
            private String quality;
            private String area;

            public String getSourceName() {
                return sourceName;
            }

            public void setSourceName(String sourceName) {
                this.sourceName = sourceName;
            }

            public int getAqi() {
                return aqi;
            }

            public void setAqi(int aqi) {
                this.aqi = aqi;
            }

            public String getPublishDateTime() {
                return publishDateTime;
            }

            public void setPublishDateTime(String publishDateTime) {
                this.publishDateTime = publishDateTime;
            }

            public String getSubArea() {
                return subArea;
            }

            public void setSubArea(String subArea) {
                this.subArea = subArea;
            }

            public int getPublishDateTimeLong() {
                return publishDateTimeLong;
            }

            public void setPublishDateTimeLong(int publishDateTimeLong) {
                this.publishDateTimeLong = publishDateTimeLong;
            }

            public int getPm25() {
                return pm25;
            }

            public void setPm25(int pm25) {
                this.pm25 = pm25;
            }

            public String getPositionName() {
                return positionName;
            }

            public void setPositionName(String positionName) {
                this.positionName = positionName;
            }

            public String getQuality() {
                return quality;
            }

            public void setQuality(String quality) {
                this.quality = quality;
            }

            public String getArea() {
                return area;
            }

            public void setArea(String area) {
                this.area = area;
            }
        }
    }
}
