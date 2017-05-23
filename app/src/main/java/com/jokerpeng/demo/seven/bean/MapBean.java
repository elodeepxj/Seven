package com.jokerpeng.demo.seven.bean;

import com.jokerpeng.demo.seven.base.BaseBean;

/**
 * Created by PengXiaoJie on 2017/5/23.20 13..
 */

public class MapBean extends BaseBean {

    /**
     * semantic : {"slots":{"endLoc":{"type":"LOC_POI","city":"CURRENT_CITY","poi":"南阳市八中"},"startLoc":{"type":"LOC_POI","city":"CURRENT_CITY","poi":"CURRENT_POI"},"location":{"type":"LOC_BASIC","areaAddr":"新洲","area":"新洲区"}}}
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
         * slots : {"endLoc":{"type":"LOC_POI","city":"CURRENT_CITY","poi":"南阳市八中"},"startLoc":{"type":"LOC_POI","city":"CURRENT_CITY","poi":"CURRENT_POI"},"location":{"type":"LOC_BASIC","areaAddr":"新洲","area":"新洲区"}}
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
             * endLoc : {"type":"LOC_POI","city":"CURRENT_CITY","poi":"南阳市八中"}
             * startLoc : {"type":"LOC_POI","city":"CURRENT_CITY","poi":"CURRENT_POI"}
             * location : {"type":"LOC_BASIC","areaAddr":"新洲","area":"新洲区"}
             */

            private EndLocBean endLoc;
            private StartLocBean startLoc;
            private LocationBean location;

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

            public LocationBean getLocation() {
                return location;
            }

            public void setLocation(LocationBean location) {
                this.location = location;
            }

            public static class EndLocBean {
                /**
                 * type : LOC_POI
                 * city : CURRENT_CITY
                 * poi : 南阳市八中
                 */

                private String type;
                private String city;
                private String poi;
                private String country;
                private String province;
                private String keyword;
                private String area;
                private String street;
                private String region;

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

                public String getStreet() {
                    return street;
                }

                public void setStreet(String street) {
                    this.street = street;
                }

                public String getRegion() {
                    return region;
                }

                public void setRegion(String region) {
                    this.region = region;
                }

                public String getType() {
                    return type;
                }

                public void setType(String type) {
                    this.type = type;
                }

                public String getCity() {
                    return city;
                }

                public void setCity(String city) {
                    this.city = city;
                }

                public String getPoi() {
                    return poi;
                }

                public void setPoi(String poi) {
                    this.poi = poi;
                }
            }

            public static class StartLocBean {
                /**
                 * type : LOC_POI
                 * city : CURRENT_CITY
                 * poi : CURRENT_POI
                 */

                private String type;
                private String city;
                private String poi;
                private String country;
                private String province;
                private String keyword;
                private String area;
                private String street;
                private String region;

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

                public String getStreet() {
                    return street;
                }

                public void setStreet(String street) {
                    this.street = street;
                }

                public String getRegion() {
                    return region;
                }

                public void setRegion(String region) {
                    this.region = region;
                }

                public String getType() {
                    return type;
                }

                public void setType(String type) {
                    this.type = type;
                }

                public String getCity() {
                    return city;
                }

                public void setCity(String city) {
                    this.city = city;
                }

                public String getPoi() {
                    return poi;
                }

                public void setPoi(String poi) {
                    this.poi = poi;
                }
            }

            public static class LocationBean {
                /**
                 * type : LOC_BASIC
                 * areaAddr : 新洲
                 * area : 新洲区
                 */

                private String type;
                private String areaAddr;
                private String area;
                private String country;
                private String province;
                private String city;
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

                public String getCity() {
                    return city;
                }

                public void setCity(String city) {
                    this.city = city;
                }

                public String getKeyword() {
                    return keyword;
                }

                public void setKeyword(String keyword) {
                    this.keyword = keyword;
                }

                public String getType() {
                    return type;
                }

                public void setType(String type) {
                    this.type = type;
                }

                public String getAreaAddr() {
                    return areaAddr;
                }

                public void setAreaAddr(String areaAddr) {
                    this.areaAddr = areaAddr;
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
}
