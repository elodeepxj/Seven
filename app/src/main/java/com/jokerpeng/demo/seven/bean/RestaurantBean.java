package com.jokerpeng.demo.seven.bean;

import com.jokerpeng.demo.seven.base.BaseBean;

/**
 * Created by PengXiaoJie on 2017/5/24.09 13..
 */

public class RestaurantBean extends BaseBean {

    /**
     * semantic : {"slots":{"location":{"type":"LOC_POI","city":"CURRENT_CITY","poi":"CURRENT_POI"},"category":"餐厅"}}
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
         * slots : {"location":{"type":"LOC_POI","city":"CURRENT_CITY","poi":"CURRENT_POI"},"category":"餐厅"}
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
             * category : 餐厅
             * price : 价格
             * hasCoupon ; 是否有优惠券 1:有，null:没有
             * hasDeal : 是否有团购 1:有，null:没有
             */

            private LocationBean location;
            private String category;
            private String special;
            private String price;
            private String keyword;
            private String hasCoupon;
            private String radius;
            private String hasDeal;

            public String getSpecial() {
                return special;
            }

            public void setSpecial(String special) {
                this.special = special;
            }

            public String getPrice() {
                return price;
            }

            public void setPrice(String price) {
                this.price = price;
            }

            public String getKeyword() {
                return keyword;
            }

            public void setKeyword(String keyword) {
                this.keyword = keyword;
            }

            public String getHasCoupon() {
                return hasCoupon;
            }

            public void setHasCoupon(String hasCoupon) {
                this.hasCoupon = hasCoupon;
            }

            public String getRadius() {
                return radius;
            }

            public void setRadius(String radius) {
                this.radius = radius;
            }

            public String getHasDeal() {
                return hasDeal;
            }

            public void setHasDeal(String hasDeal) {
                this.hasDeal = hasDeal;
            }

            public LocationBean getLocation() {
                return location;
            }

            public void setLocation(LocationBean location) {
                this.location = location;
            }

            public String getCategory() {
                return category;
            }

            public void setCategory(String category) {
                this.category = category;
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
        }
    }
}
