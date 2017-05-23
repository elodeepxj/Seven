package com.jokerpeng.demo.seven.bean;

import com.jokerpeng.demo.seven.base.BaseBean;

import java.util.List;

/**
 * Created by PengXiaoJie on 2017/5/22.20 58..
 */

public class FlowerBean extends BaseBean {

    /**
     * webPage : {"header":"","url":"http://kcbj.openspeech.cn/service/iss?wuuid=95d92bd9443c52cddbc003c0a8c5e91c&ver=2.0&method=webPage&uuid=a2735bfb43198ba99d05b23a7dd4c933query"}
     * semantic : {"slots":{"category":"鲜花"}}
     * rc : 0
     * data : {"result":[{"sourceName":"订购鲜花","name":"鲜花/致美丽的你","category":"鲜花","price":"156","url":"http://m.hua.com/flower/detail.asp?product_code=9010877","imgUrl":"http://www.hua.com/uploadpic/images/2014161604372105.jpg","composition":"11枝红玫瑰,黄莺、满天星适量搭配"},{"sourceName":"订购鲜花","name":"鲜花/真爱","category":"鲜花","price":"139","url":"http://m.hua.com/flower/detail.asp?product_code=9010804","imgUrl":"http://www.hua.com/uploadpic/images/20141616452827404.jpg","composition":"红玫瑰9枝、黄莺+满天星搭配"},{"sourceName":"订购鲜花","name":"鲜花/唯一","category":"鲜花","price":"162","url":"http://m.hua.com/flower/detail.asp?product_code=9010753","imgUrl":"http://www.hua.com/uploadpic/images/20141615235470604.jpg","composition":"11枝粉玫瑰，黄莺丰满搭配，点缀紫色勿忘我"},{"sourceName":"订购鲜花","name":"鲜花/幸福相伴","category":"鲜花","price":"252","url":"http://m.hua.com/flower/detail.asp?product_code=9010788","imgUrl":"http://www.hua.com/uploadpic/images/9010788_m.jpg","composition":"16枝粉玫瑰，5寸小熊2只,适量绿叶"},{"sourceName":"订购鲜花","name":"鲜花/缘份","category":"鲜花","price":"229","url":"http://m.hua.com/flower/detail.asp?product_code=9010849","imgUrl":"http://www.hua.com/uploadpic/images/20141615375572113.jpg","composition":"11枝红玫瑰,2枝白香水百合,黄莺丰满"},{"sourceName":"订购鲜花","name":"鲜花/牵手一生","category":"鲜花","price":"262","url":"http://m.hua.com/flower/detail.asp?product_code=9010731","imgUrl":"http://www.hua.com/uploadpic/images/2014161515324947.jpg","composition":"19枝顶级红玫瑰(长柄)紧密居中，外围满天星丰满环绕"},{"sourceName":"订购鲜花","name":"鲜花/相遇","category":"鲜花","price":"226","url":"http://m.hua.com/flower/detail.asp?product_code=9010712","imgUrl":"http://www.hua.com/uploadpic/images/20141614253741498.jpg","composition":"16枝白玫瑰，外围一圈紫色勿忘我"},{"sourceName":"订购鲜花","name":"鲜花/爱的纪念日","category":"鲜花","price":"166","url":"http://m.hua.com/flower/detail.asp?product_code=9010105","imgUrl":"http://www.hua.com/uploadpic/images/2014161639841504.jpg","composition":"红玫瑰11枝，勿忘我、黄莺丰满。"},{"sourceName":"订购鲜花","name":"鲜花/幸福女主角","category":"鲜花","price":"198","url":"http://m.hua.com/flower/detail.asp?product_code=9010789","imgUrl":"http://www.hua.com/uploadpic/images/9010789_m.jpg","composition":"11枝粉玫瑰，1枝多头白香水百合，满天星适量搭配。"},{"sourceName":"订购鲜花","name":"鲜花/最美","category":"鲜花","price":"186","url":"http://m.hua.com/flower/detail.asp?product_code=9010828","imgUrl":"http://www.hua.com/uploadpic/images/2011127165676089.jpg","composition":"11枝红玫瑰，5寸小熊一只,黄莺丰满"}]}
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
         * url : http://kcbj.openspeech.cn/service/iss?wuuid=95d92bd9443c52cddbc003c0a8c5e91c&ver=2.0&method=webPage&uuid=a2735bfb43198ba99d05b23a7dd4c933query
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
         * slots : {"category":"鲜花"}
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
             * category : 鲜花
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
             * sourceName : 订购鲜花
             * name : 鲜花/致美丽的你
             * category : 鲜花
             * price : 156
             * url : http://m.hua.com/flower/detail.asp?product_code=9010877
             * imgUrl : http://www.hua.com/uploadpic/images/2014161604372105.jpg
             * composition : 11枝红玫瑰,黄莺、满天星适量搭配
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
