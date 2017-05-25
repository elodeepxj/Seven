package com.jokerpeng.demo.seven.bean;

import com.jokerpeng.demo.seven.base.BaseBean;

/**
 * Created by PengXiaoJie on 2017/5/24.09 22..
 */

public class StockBean extends BaseBean {

    /**
     * webPage : {"header":"","url":"http://kcbj.openspeech.cn/service/iss?wuuid=b5cc576716174d981544c7333d9e5f13&ver=2.0&method=webPage&uuid=97679068dda8414dee64e111cb9b0f71query"}
     * semantic : {"slots":{"category":"sz","name":"科大讯飞","code":"002230"}}
     * rc : 0
     */

    private WebPageBean webPage;
    private SemanticBean semantic;

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

    public static class WebPageBean {
        /**
         * header :
         * url : http://kcbj.openspeech.cn/service/iss?wuuid=b5cc576716174d981544c7333d9e5f13&ver=2.0&method=webPage&uuid=97679068dda8414dee64e111cb9b0f71query
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
         * slots : {"category":"sz","name":"科大讯飞","code":"002230"}
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
             * category : sz
             * name : 科大讯飞
             * code : 002230
             */

            private String category;
            private String name;
            private String code;
            private String chartType;

            public String getChartType() {
                return chartType;
            }

            public void setChartType(String chartType) {
                this.chartType = chartType;
            }

            public String getCategory() {
                return category;
            }

            public void setCategory(String category) {
                this.category = category;
            }

            public String getName() {
                return name;
            }

            public void setName(String name) {
                this.name = name;
            }

            public String getCode() {
                return code;
            }

            public void setCode(String code) {
                this.code = code;
            }
        }
    }
}
