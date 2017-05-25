package com.jokerpeng.demo.seven.bean;

import com.jokerpeng.demo.seven.base.BaseBean;

import java.util.List;

/**
 * Created by PengXiaoJie on 2017/5/24.09 20..
 */

public class ShortRentBean extends BaseBean {

    /**
     * webPage : {"header":"","url":"http://kcbj.openspeech.cn/service/iss?wuuid=ecdf4f1f6456485fac2b905813350186&ver=2.0&method=webPage&uuid=bbb231e9fe4e1f6e24fc4d48d18a2724query"}
     * semantic : {"slots":{"location":{"cityAddr":"上海","city":"上海市","type":"LOC_BASIC"}}}
     * rc : 0
     * data : {"result":[{"roomType":"公寓","region":"普陀","businessDistrict":"长寿路","rentType":"短租","imgUrl":"http://image.xiaozhustatic1.com/11/0,0,28,397,715,476,7399ed54.jpg","sourceName":"58同城-租房信息","roomName":"近玉佛寺 精妙绝伦的舒适与奢想","url":"http://sh.xiaozhu.com/fangzi/12662700.html?pk_campaign=pay-kedaxunfei-marketing","city":"上海"},{"roomType":"公寓","region":"闵行","businessDistrict":"春申","rentType":"短租","imgUrl":"http://image.xiaozhustatic3.com/11/0,0,18,3166,2000,1500,a4134d98.jpg","sourceName":"58同城-租房信息","roomName":"上海南站附近 迷你双人间","url":"http://sh.xiaozhu.com/fangzi/54359201.html?pk_campaign=pay-kedaxunfei-marketing","city":"上海"},{"roomType":"公寓","region":"长宁","businessDistrict":"虹桥","rentType":"短租","imgUrl":"http://image.xiaozhustatic2.com/11/0,0,11,2239,1537,1024,e8015d43.jpg","sourceName":"58同城-租房信息","roomName":"虹桥枢纽 近火车站旁 公寓大床房","url":"http://sh.xiaozhu.com/fangzi/36446800.html?pk_campaign=pay-kedaxunfei-marketing","city":"上海"},{"roomType":"公寓","region":"浦东","businessDistrict":"世纪公园","rentType":"短租","imgUrl":"http://image.xiaozhustatic1.com/11/0,0,53,827,721,480,7ca33dc6.jpg","sourceName":"58同城-租房信息","roomName":"双地铁(2、7号线)舒适标间","url":"http://sh.xiaozhu.com/fangzi/13236339.html?pk_campaign=pay-kedaxunfei-marketing","city":"上海"},{"roomType":"公寓","region":"徐汇","businessDistrict":"万体馆","rentType":"短租","imgUrl":"http://image.xiaozhustatic3.com/11/0,0,74,1317,715,476,0f487276.jpg","sourceName":"58同城-租房信息","roomName":"佳佳公寓豪华公寓期待你的入住","url":"http://sh.xiaozhu.com/fangzi/13284158.html?pk_campaign=pay-kedaxunfei-marketing","city":"上海"},{"roomType":"公寓","region":"闵行","businessDistrict":"春申","rentType":"短租","imgUrl":"http://image.xiaozhustatic2.com/11/0,0,66,3152,2000,1500,326614f0.jpg","sourceName":"58同城-租房信息","roomName":"1号地铁莲花路站 双人空调房出租","url":"http://sh.xiaozhu.com/fangzi/54358701.html?pk_campaign=pay-kedaxunfei-marketing","city":"上海"},{"roomType":"公寓","region":"徐汇","businessDistrict":"上海南站","rentType":"短租","imgUrl":"http://image.xiaozhustatic1.com/11/0,0,40,4072,1125,750,4d06b71d.jpg","sourceName":"58同城-租房信息","roomName":"火车南站给你不一样的体验4人","url":"http://sh.xiaozhu.com/fangzi/27178300.html?pk_campaign=pay-kedaxunfei-marketing","city":"上海"},{"roomType":"公寓","region":"徐汇","businessDistrict":"华泾","rentType":"短租","imgUrl":"http://image.xiaozhustatic3.com/11/0,0,75,4224,2000,1500,d406c42d.jpg","sourceName":"58同城-租房信息","roomName":"上海南站附近，大学生求职公寓！","url":"http://sh.xiaozhu.com/fangzi/78623201.html?pk_campaign=pay-kedaxunfei-marketing","city":"上海"},{"roomType":"公寓","region":"浦东","businessDistrict":"陆家嘴","rentType":"短租","imgUrl":"http://image.xiaozhustatic3.com/11/0,0,64,182,716,476,dedf2898.jpg","sourceName":"58同城-租房信息","roomName":"陆家嘴商圈 4号线 万源精品公寓房","url":"http://sh.xiaozhu.com/fangzi/11224855.html?pk_campaign=pay-kedaxunfei-marketing","city":"上海"},{"roomType":"公寓","region":"静安","businessDistrict":"False","rentType":"短租","imgUrl":"http://image.xiaozhustatic1.com/11/0,0,60,979,715,476,f1feb296.jpg","sourceName":"58同城-租房信息","roomName":"豪华酒店式公寓近7号地铁","url":"http://sh.xiaozhu.com/fangzi/13260700.html?pk_campaign=pay-kedaxunfei-marketing","city":"上海"}]}
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
         * url : http://kcbj.openspeech.cn/service/iss?wuuid=ecdf4f1f6456485fac2b905813350186&ver=2.0&method=webPage&uuid=bbb231e9fe4e1f6e24fc4d48d18a2724query
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
         * slots : {"location":{"cityAddr":"上海","city":"上海市","type":"LOC_BASIC"}}
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
             * location : {"cityAddr":"上海","city":"上海市","type":"LOC_BASIC"}
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
                 * cityAddr : 上海
                 * city : 上海市
                 * type : LOC_BASIC
                 */

                private String cityAddr;
                private String city;
                private String type;

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
             * roomType : 公寓
             * region : 普陀
             * businessDistrict : 长寿路
             * rentType : 短租
             * imgUrl : http://image.xiaozhustatic1.com/11/0,0,28,397,715,476,7399ed54.jpg
             * sourceName : 58同城-租房信息
             * roomName : 近玉佛寺 精妙绝伦的舒适与奢想
             * url : http://sh.xiaozhu.com/fangzi/12662700.html?pk_campaign=pay-kedaxunfei-marketing
             * city : 上海
             */

            private String roomType;
            private String region;
            private String businessDistrict;
            private String rentType;
            private String imgUrl;
            private String sourceName;
            private String roomName;
            private String url;
            private String city;

            public String getRoomType() {
                return roomType;
            }

            public void setRoomType(String roomType) {
                this.roomType = roomType;
            }

            public String getRegion() {
                return region;
            }

            public void setRegion(String region) {
                this.region = region;
            }

            public String getBusinessDistrict() {
                return businessDistrict;
            }

            public void setBusinessDistrict(String businessDistrict) {
                this.businessDistrict = businessDistrict;
            }

            public String getRentType() {
                return rentType;
            }

            public void setRentType(String rentType) {
                this.rentType = rentType;
            }

            public String getImgUrl() {
                return imgUrl;
            }

            public void setImgUrl(String imgUrl) {
                this.imgUrl = imgUrl;
            }

            public String getSourceName() {
                return sourceName;
            }

            public void setSourceName(String sourceName) {
                this.sourceName = sourceName;
            }

            public String getRoomName() {
                return roomName;
            }

            public void setRoomName(String roomName) {
                this.roomName = roomName;
            }

            public String getUrl() {
                return url;
            }

            public void setUrl(String url) {
                this.url = url;
            }

            public String getCity() {
                return city;
            }

            public void setCity(String city) {
                this.city = city;
            }
        }
    }
}
