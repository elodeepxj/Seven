package com.jokerpeng.demo.seven.bean;

import com.jokerpeng.demo.seven.base.BaseBean;

/**
 * Created by PengXiaoJie on 2017/5/22.20 42..
 */

public class FlightBean extends BaseBean {
    private Semantic semantic;

    public Semantic getSemantic() {
        return semantic;
    }

    public void setSemantic(Semantic semantic) {
        this.semantic = semantic;
    }

    class Semantic{
        private Slots slots;

        public Slots getSlots() {
            return slots;
        }

        public void setSlots(Slots slots) {
            this.slots = slots;
        }
        class Slots{
            private StartDate startDate;
            private EndLoc endLoc;
            private StartLoc startLoc;

            public StartDate getStartDate() {
                return startDate;
            }

            public void setStartDate(StartDate startDate) {
                this.startDate = startDate;
            }

            public EndLoc getEndLoc() {
                return endLoc;
            }

            public void setEndLoc(EndLoc endLoc) {
                this.endLoc = endLoc;
            }

            public StartLoc getStartLoc() {
                return startLoc;
            }

            public void setStartLoc(StartLoc startLoc) {
                this.startLoc = startLoc;
            }
            class StartDate{
                private String date;
                private String type;
                private String dateOrig;

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

                public String getDateOrig() {
                    return dateOrig;
                }

                public void setDateOrig(String dateOrig) {
                    this.dateOrig = dateOrig;
                }
            }
            class EndLoc{
                private String country;
                private String province;
                private String cityAddr;
                private String city;
                private String type;
                private String area;
                private String keyword;

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

                public String getArea() {
                    return area;
                }

                public void setArea(String area) {
                    this.area = area;
                }

                public String getKeyword() {
                    return keyword;
                }

                public void setKeyword(String keyword) {
                    this.keyword = keyword;
                }
            }
            class StartLoc{
                private String country;
                private String province;
                private String cityAddr;
                private String city;
                private String type;
                private String area;
                private String keyword;

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

                public String getArea() {
                    return area;
                }

                public void setArea(String area) {
                    this.area = area;
                }

                public String getKeyword() {
                    return keyword;
                }

                public void setKeyword(String keyword) {
                    this.keyword = keyword;
                }
            }

        }
    }
}
