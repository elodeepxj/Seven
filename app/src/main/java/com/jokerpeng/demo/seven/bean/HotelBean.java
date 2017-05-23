package com.jokerpeng.demo.seven.bean;

import com.jokerpeng.demo.seven.base.BaseBean;

/**
 * Created by PengXiaoJie on 2017/5/23.20 01..
 */

public class HotelBean extends BaseBean {

    /**
     * semantic : {"slots":{"location":{"type":"LOC_POI","city":"CURRENT_CITY","poi":"CURRENT_POI"},"checkinDate":{"date":"2017-05-23","type":"DT_BASIC"}}}
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
         * slots : {"location":{"type":"LOC_POI","city":"CURRENT_CITY","poi":"CURRENT_POI"},"checkinDate":{"date":"2017-05-23","type":"DT_BASIC"}}
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
             * location : {"type":"LOC_POI","city":"CURRENT_CITY","poi":"CURRENT_POI"}
             * checkinDate : {"date":"2017-05-23","type":"DT_BASIC"}
             */

            private LocationBean location;
            private CheckinDateBean checkinDate;
            private String checkoutDate;
            private String priceMax;
            private String priceMin;
            private String hotelLvl;
            private String roomCount;
            private String roomType;

            public String getCheckoutDate() {
                return checkoutDate;
            }

            public void setCheckoutDate(String checkoutDate) {
                this.checkoutDate = checkoutDate;
            }

            public String getPriceMax() {
                return priceMax;
            }

            public void setPriceMax(String priceMax) {
                this.priceMax = priceMax;
            }

            public String getPriceMin() {
                return priceMin;
            }

            public void setPriceMin(String priceMin) {
                this.priceMin = priceMin;
            }

            public String getHotelLvl() {
                return hotelLvl;
            }

            public void setHotelLvl(String hotelLvl) {
                this.hotelLvl = hotelLvl;
            }

            public String getRoomCount() {
                return roomCount;
            }

            public void setRoomCount(String roomCount) {
                this.roomCount = roomCount;
            }

            public String getRoomType() {
                return roomType;
            }

            public void setRoomType(String roomType) {
                this.roomType = roomType;
            }

            public LocationBean getLocation() {
                return location;
            }

            public void setLocation(LocationBean location) {
                this.location = location;
            }

            public CheckinDateBean getCheckinDate() {
                return checkinDate;
            }

            public void setCheckinDate(CheckinDateBean checkinDate) {
                this.checkinDate = checkinDate;
            }

            public static class LocationBean {
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
                private String area;
                private String street;
                private String region;
                private String keyword;

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

                public String getKeyword() {
                    return keyword;
                }

                public void setKeyword(String keyword) {
                    this.keyword = keyword;
                }
            }

            public static class CheckinDateBean {
                /**
                 * date : 2017-05-23
                 * type : DT_BASIC
                 */

                private String date;
                private String type;
                private String time;

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

                public String getTime() {
                    return time;
                }

                public void setTime(String time) {
                    this.time = time;
                }
            }
        }
    }
}
