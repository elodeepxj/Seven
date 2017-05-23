package com.jokerpeng.demo.seven.bean;

import com.jokerpeng.demo.seven.base.BaseBean;

import java.util.List;

/**
 * Created by PengXiaoJie on 2017/5/22.20 25..
 */

public class CookbookBean extends BaseBean {
    private WebPage webPage;
    private Semantic semantic;
    private Data data;

    public WebPage getWebPage() {
        return webPage;
    }

    public void setWebPage(WebPage webPage) {
        this.webPage = webPage;
    }

    public Semantic getSemantic() {
        return semantic;
    }

    public void setSemantic(Semantic semantic) {
        this.semantic = semantic;
    }

    public Data getData() {
        return data;
    }

    public void setData(Data data) {
        this.data = data;
    }

    class WebPage{
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

    class Semantic{
        private Slots slots;

        public Slots getSlots() {
            return slots;
        }

        public void setSlots(Slots slots) {
            this.slots = slots;
        }

        class Slots{
            private String tag;
            private String dishName;
            private String ingredient;

            public String getTag() {
                return tag;
            }

            public void setTag(String tag) {
                this.tag = tag;
            }

            public String getDishName() {
                return dishName;
            }

            public void setDishName(String dishName) {
                this.dishName = dishName;
            }

            public String getIngredient() {
                return ingredient;
            }

            public void setIngredient(String ingredient) {
                this.ingredient = ingredient;
            }
        }
    }

    class Data{
        private List<DetailsData> result;

        public List<DetailsData> getResult() {
            return result;
        }

        public void setResult(List<DetailsData> result) {
            this.result = result;
        }
        class DetailsData{
            private String ingredient;
            private String accessory;
            private String source;
            private String url;
            private String cuisine;
            private String imgUrl;

            public String getIngredient() {
                return ingredient;
            }

            public void setIngredient(String ingredient) {
                this.ingredient = ingredient;
            }

            public String getAccessory() {
                return accessory;
            }

            public void setAccessory(String accessory) {
                this.accessory = accessory;
            }

            public String getSource() {
                return source;
            }

            public void setSource(String source) {
                this.source = source;
            }

            public String getUrl() {
                return url;
            }

            public void setUrl(String url) {
                this.url = url;
            }

            public String getCuisine() {
                return cuisine;
            }

            public void setCuisine(String cuisine) {
                this.cuisine = cuisine;
            }

            public String getImgUrl() {
                return imgUrl;
            }

            public void setImgUrl(String imgUrl) {
                this.imgUrl = imgUrl;
            }
        }
    }

}
