package com.jokerpeng.demo.seven.bean;

import com.jokerpeng.demo.seven.base.BaseBean;

import java.util.List;

/**
 * Created by PengXiaoJie on 2017/5/23.19 58..
 */

public class GiftBean extends BaseBean {

    /**
     * webPage : {"header":"","url":"http://kcbj.openspeech.cn/service/iss?wuuid=0e4e28e855f91e96701ff81bdb7eed4c&ver=2.0&method=webPage&uuid=340aede986e635758ffea13301b461d2query"}
     * semantic : {"slots":{"category":"礼品"}}
     * rc : 0
     * data : {"result":[{"sourceName":"中国鲜花礼品网","name":"礼品/纯心纯意","category":"礼品","price":"398","url":"http://m.hua.com/gifts/detail.asp?product_code=1060006","imgUrl":"http://www.hua.com/uploadpic/images/20111027946535202.jpg","composition":"精选绽放优美的五枝(香槟玫+彩玫)，配叶适量，在采摘"},{"sourceName":"中国鲜花礼品网","name":"礼品/紫水晶钢琴","category":"礼品","price":"258","url":"http://m.hua.com/gifts/detail.asp?product_code=1064033","imgUrl":"http://www.hua.com/uploadpic/images/20121026190499274.jpg","composition":"内置18音精品机芯，机芯纯铜镀金制作，音质和质量都属上乘。采"},{"sourceName":"中国鲜花礼品网","name":"礼品/五彩生活","category":"礼品","price":"298","url":"http://m.hua.com/gifts/detail.asp?product_code=1060007","imgUrl":"http://www.hua.com/uploadpic/images/1060007_m.jpg","composition":"精选绽放优美的玫瑰五枝(香槟玫+彩玫)，配叶适量，在"},{"sourceName":"中国鲜花礼品网","name":"礼品/温馨的爱","category":"礼品","price":"126","url":"http://m.hua.com/gifts/detail.asp?product_code=1060020","imgUrl":"http://www.hua.com/uploadpic/images/20111111212745815.jpg","composition":"精选绽放优美的香槟玫瑰一枝，配叶勿忘我及绿叶适量，"},{"sourceName":"中国鲜花礼品网","name":"礼品/固体精油香薰套装（玫瑰晨曦）","category":"礼品","price":"78","url":"http://m.hua.com/gifts/detail.asp?product_code=1069027","imgUrl":"http://www.hua.com/uploadpic/images/201342156366067.jpg","composition":"套装组成：8ml空气精油、陶瓷香薰炉、香薰固体精油、香薰茶蜡"},{"sourceName":"中国鲜花礼品网","name":"礼品/迷你水晶钢琴","category":"礼品","price":"168","url":"http://m.hua.com/gifts/detail.asp?product_code=1064032","imgUrl":"http://www.hua.com/uploadpic/images/201267171385692.jpg","composition":"内置18音精品机芯镀机芯质量和音质都达到最好的标准。采用通透"},{"sourceName":"中国鲜花礼品网","name":"礼品/田园恋歌","category":"礼品","price":"208","url":"http://m.hua.com/gifts/detail.asp?product_code=1060041","imgUrl":"http://www.hua.com/uploadpic/images/20125181945362092.jpg","composition":"精选绽放优美的红玫瑰三枝，配叶适量，在采摘后一个小"},{"sourceName":"中国鲜花礼品网","name":"礼品/爱永恒","category":"礼品","price":"248","url":"http://m.hua.com/gifts/detail.asp?product_code=1060003","imgUrl":"http://www.hua.com/uploadpic/images/201110271594940514.jpg","composition":"精选绽放优美的玫瑰三枝(香槟玫+彩玫)，配叶适量，在"},{"sourceName":"中国鲜花礼品网","name":"礼品/怡情薰衣草（馨悦香语香薰套装）","category":"礼品","price":"179","url":"http://m.hua.com/gifts/detail.asp?product_code=1069005","imgUrl":"http://www.hua.com/uploadpic/images/20131611221649772.jpg","composition":"套装组成：55×45mm香薰雕刻杯蜡两支、天然香薰植物干花+"},{"sourceName":"中国鲜花礼品网","name":"礼品/薰衣草饼干抱枕","category":"礼品","price":"129","url":"http://m.hua.com/gifts/detail.asp?product_code=1062046","imgUrl":"http://www.hua.com/uploadpic/images/2011727952612692.jpg","composition":"【品牌】: Best-life [中国]【面料】："}]}
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
         * url : http://kcbj.openspeech.cn/service/iss?wuuid=0e4e28e855f91e96701ff81bdb7eed4c&ver=2.0&method=webPage&uuid=340aede986e635758ffea13301b461d2query
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
         * slots : {"category":"礼品"}
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
             * category : 礼品
             */

            private String category;

            public String getCategory() {
                return category;
            }

            public void setCategory(String category) {
                this.category = category;
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
             * sourceName : 中国鲜花礼品网
             * name : 礼品/纯心纯意
             * category : 礼品
             * price : 398
             * url : http://m.hua.com/gifts/detail.asp?product_code=1060006
             * imgUrl : http://www.hua.com/uploadpic/images/20111027946535202.jpg
             * composition : 精选绽放优美的五枝(香槟玫+彩玫)，配叶适量，在采摘
             */

            private String sourceName;
            private String name;
            private String category;
            private String price;
            private String url;
            private String imgUrl;
            private String composition;

            public String getSourceName() {
                return sourceName;
            }

            public void setSourceName(String sourceName) {
                this.sourceName = sourceName;
            }

            public String getName() {
                return name;
            }

            public void setName(String name) {
                this.name = name;
            }

            public String getCategory() {
                return category;
            }

            public void setCategory(String category) {
                this.category = category;
            }

            public String getPrice() {
                return price;
            }

            public void setPrice(String price) {
                this.price = price;
            }

            public String getUrl() {
                return url;
            }

            public void setUrl(String url) {
                this.url = url;
            }

            public String getImgUrl() {
                return imgUrl;
            }

            public void setImgUrl(String imgUrl) {
                this.imgUrl = imgUrl;
            }

            public String getComposition() {
                return composition;
            }

            public void setComposition(String composition) {
                this.composition = composition;
            }
        }
    }
}
