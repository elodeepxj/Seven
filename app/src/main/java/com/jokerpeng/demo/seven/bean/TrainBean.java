package com.jokerpeng.demo.seven.bean;

import com.jokerpeng.demo.seven.base.BaseBean;

/**
 * Created by PengXiaoJie on 2017/5/24.09 23..
 */

public class TrainBean extends BaseBean {

    /**
     * semantic : {"slots":{"category":"动车","endLoc":{"cityAddr":"上海","city":"上海市","type":"LOC_BASIC"},"startLoc":{"cityAddr":"合肥","city":"合肥市","type":"LOC_BASIC"}}}
     * rc : 0
     */

    private SemanticBean semantic;

    public SemanticBean getSemantic() {
        return semantic;
    }

    public void setSemantic(SemanticBean semantic) {
        this.semantic = semantic;
    }

    public static class SemanticBean {
        /**
         * slots : {"category":"动车","endLoc":{"cityAddr":"上海","city":"上海市","type":"LOC_BASIC"},"startLoc":{"cityAddr":"合肥","city":"合肥市","type":"LOC_BASIC"}}
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
             * category : 动车
             * endLoc : {"cityAddr":"上海","city":"上海市","type":"LOC_BASIC"}
             * startLoc : {"cityAddr":"合肥","city":"合肥市","type":"LOC_BASIC"}
             * seat : 座位级别
             * code : 车次
             * startDate ; 出发日期
             * type : 出航类型
             */

            private String category;
            private String startDate;
            private String seat;
            private String code;
            private String type;
            private EndLocBean endLoc;
            private StartLocBean startLoc;

            public String getStartDate() {
                return startDate;
            }

            public void setStartDate(String startDate) {
                this.startDate = startDate;
            }

            public String getSeat() {
                return seat;
            }

            public void setSeat(String seat) {
                this.seat = seat;
            }

            public String getCode() {
                return code;
            }

            public void setCode(String code) {
                this.code = code;
            }

            public String getType() {
                return type;
            }

            public void setType(String type) {
                this.type = type;
            }

            public String getCategory() {
                return category;
            }

            public void setCategory(String category) {
                this.category = category;
            }

            public EndLocBean getEndLoc() {
                return endLoc;
            }

            public void setEndLoc(EndLocBean endLoc) {
                this.endLoc = endLoc;
            }

            public StartLocBean getStartLoc() {
                return startLoc;
            }

            public void setStartLoc(StartLocBean startLoc) {
                this.startLoc = startLoc;
            }

            public static class EndLocBean {
                /**
                 * cityAddr : 上海
                 * city : 上海市
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

            public static class StartLocBean {
                /**
                 * cityAddr : 合肥
                 * city : 合肥市
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
        }
    }
}
