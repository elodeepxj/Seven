package com.jokerpeng.demo.seven.bean;

import com.jokerpeng.demo.seven.base.BaseBean;

import java.util.List;

/**
 * Created by PengXiaoJie on 2017/5/24.09 31..
 */

public class TVBean extends BaseBean {

    /**
     * webPage : {"header":"为您找到下面的结果","url":"http://kcbj.openspeech.cn/service/iss?wuuid=65a591557906745a8b4c7d9ed37ae705&ver=2.0&method=webPage&uuid=60f9e8ed34db06dc0f800ffb2c1f915bquery"}
     * semantic : {"slots":{"programName":"快乐大本营"}}
     * rc : 0
     * data : {"result":[{"programType":"综艺","startTime":"05:00","programName":"\t快乐大本营","date":"2015-05-24","tvName":"湖南电视台国际频道(亚洲)","url":"http://m.tvsou.com/epg.asp?TVid=24&ChannelID=1544","tvShortName":"湖南电视台国际频道(亚洲)","isSatellite":"false"},{"programType":"综艺","startTime":"09:40","programName":"\t快乐大本营","date":"2015-05-24","tvName":"湖南电视台国际频道(亚洲)","url":"http://m.tvsou.com/epg.asp?TVid=24&ChannelID=1544","tvShortName":"湖南电视台国际频道(亚洲)","isSatellite":"false"},{"programType":"综艺","startTime":"11:27","programName":"快乐大本营","date":"2015-05-24","tvName":"湖南卫视","url":"http://m.tvsou.com/epg.asp?TVid=24&ChannelID=46","tvShortName":"湖南卫视","isSatellite":"true"},{"programType":"综艺","startTime":"11:27","programName":"快乐大本营","date":"2015-05-24","tvName":"湖南卫视（高清）","url":"http://m.tvsou.com/epg.asp?TVid=24&ChannelID=1786","tvShortName":"湖南卫视（高清）","isSatellite":"false"},{"programType":"其他","startTime":"08:37","programName":"汽车大本营","date":"2015-05-24","tvName":"合肥电视台财经频道","url":"http://m.tvsou.com/epg.asp?TVid=78&ChannelID=350","tvShortName":"合肥电视台财经频道","isSatellite":"false"},{"programType":"其他","startTime":"08:21","programName":"汽车大本营","date":"2015-05-25","tvName":"合肥电视台财经频道","url":"http://m.tvsou.com/epg.asp?TVid=78&ChannelID=350","tvShortName":"合肥电视台财经频道","isSatellite":"false"},{"programType":"综艺","startTime":"22:00","programName":"综艺大本营","date":"2015-05-26","tvName":"中视综艺台","url":"http://m.tvsou.com/epg.asp?TVid=111&ChannelID=579","tvShortName":"中视综艺台","isSatellite":"false"},{"programType":"综艺","startTime":"07:00","programName":"综艺大本营","date":"2015-05-27","tvName":"中视综艺台","url":"http://m.tvsou.com/epg.asp?TVid=111&ChannelID=579","tvShortName":"中视综艺台","isSatellite":"false"},{"programType":"动漫","startTime":"07:30","programName":"卡通大本营","date":"2015-05-28","tvName":"江苏电视台少儿频道","url":"http://m.tvsou.com/epg.asp?TVid=22&ChannelID=123","tvShortName":"江苏电视台少儿频道","isSatellite":"false"},{"programType":"动漫","startTime":"09:10","programName":"卡通大本营","date":"2015-05-28","tvName":"江苏电视台少儿频道","url":"http://m.tvsou.com/epg.asp?TVid=22&ChannelID=123","tvShortName":"江苏电视台少儿频道","isSatellite":"false"},{"programType":"动漫","startTime":"11:10","programName":"卡通大本营","date":"2015-05-28","tvName":"江苏电视台少儿频道","url":"http://m.tvsou.com/epg.asp?TVid=22&ChannelID=123","tvShortName":"江苏电视台少儿频道","isSatellite":"false"},{"programType":"动漫","startTime":"17:45","programName":"童星大本营","date":"2015-05-28","tvName":"DV生活","url":"http://m.tvsou.com/epg.asp?TVid=83&ChannelID=1157","tvShortName":"DV生活","isSatellite":"false"},{"programType":"体育","startTime":"19:31","programName":"首播 篮球大本营(2015022)","date":"2015-05-28","tvName":"广东电视台体育频道","url":"http://m.tvsou.com/epg.asp?TVid=39&ChannelID=72","tvShortName":"广东电视台体育频道","isSatellite":"false"},{"programType":"综艺","startTime":"10:21","programName":"快乐大魔方","date":"2015-05-24","tvName":"陕西电视台五套","url":"http://m.tvsou.com/epg.asp?TVid=18&ChannelID=357","tvShortName":"陕西电视台五套","isSatellite":"false"},{"programType":"其他","startTime":"10:40","programName":"快乐大挑战","date":"2015-05-24","tvName":"惠州电视台二套","url":"http://m.tvsou.com/epg.asp?TVid=126&ChannelID=660","tvShortName":"惠州电视台二套","isSatellite":"false"},{"programType":"其他","startTime":"12:42","programName":"快乐大排档","date":"2015-05-24","tvName":"湛江电视台综合频道","url":"http://m.tvsou.com/epg.asp?TVid=94&ChannelID=498","tvShortName":"湛江电视台综合频道","isSatellite":"false"},{"programType":"其他","startTime":"15:35","programName":"快乐大挑战","date":"2015-05-24","tvName":"惠州电视台一套","url":"http://m.tvsou.com/epg.asp?TVid=126&ChannelID=659","tvShortName":"惠州电视台一套","isSatellite":"false"},{"programType":"综艺","startTime":"18:20","programName":"快乐大魔方","date":"2015-05-24","tvName":"陕西电视台五套","url":"http://m.tvsou.com/epg.asp?TVid=18&ChannelID=357","tvShortName":"陕西电视台五套","isSatellite":"false"},{"programType":"综艺","startTime":"10:21","programName":"快乐大魔方","date":"2015-05-25","tvName":"陕西电视台五套","url":"http://m.tvsou.com/epg.asp?TVid=18&ChannelID=357","tvShortName":"陕西电视台五套","isSatellite":"false"},{"programType":"综艺","startTime":"18:20","programName":"快乐大魔方","date":"2015-05-25","tvName":"陕西电视台五套","url":"http://m.tvsou.com/epg.asp?TVid=18&ChannelID=357","tvShortName":"陕西电视台五套","isSatellite":"false"},{"programType":"其他","startTime":"18:29","programName":"快乐大排档","date":"2015-05-25","tvName":"湛江电视台综合频道","url":"http://m.tvsou.com/epg.asp?TVid=94&ChannelID=498","tvShortName":"湛江电视台综合频道","isSatellite":"false"},{"programType":"其他","startTime":"20:48","programName":"快乐大排档","date":"2015-05-25","tvName":"湛江电视台公共频道","url":"http://m.tvsou.com/epg.asp?TVid=94&ChannelID=499","tvShortName":"湛江电视台公共频道","isSatellite":"false"},{"programType":"综艺","startTime":"10:21","programName":"快乐大魔方","date":"2015-05-26","tvName":"陕西电视台五套","url":"http://m.tvsou.com/epg.asp?TVid=18&ChannelID=357","tvShortName":"陕西电视台五套","isSatellite":"false"},{"programType":"综艺","startTime":"18:20","programName":"快乐大魔方","date":"2015-05-26","tvName":"陕西电视台五套","url":"http://m.tvsou.com/epg.asp?TVid=18&ChannelID=357","tvShortName":"陕西电视台五套","isSatellite":"false"},{"programType":"其他","startTime":"18:29","programName":"快乐大排档","date":"2015-05-26","tvName":"湛江电视台综合频道","url":"http://m.tvsou.com/epg.asp?TVid=94&ChannelID=498","tvShortName":"湛江电视台综合频道","isSatellite":"false"},{"programType":"其他","startTime":"20:48","programName":"快乐大排档","date":"2015-05-26","tvName":"湛江电视台公共频道","url":"http://m.tvsou.com/epg.asp?TVid=94&ChannelID=499","tvShortName":"湛江电视台公共频道","isSatellite":"false"},{"programType":"综艺","startTime":"10:21","programName":"快乐大魔方","date":"2015-05-27","tvName":"陕西电视台五套","url":"http://m.tvsou.com/epg.asp?TVid=18&ChannelID=357","tvShortName":"陕西电视台五套","isSatellite":"false"},{"programType":"其他","startTime":"12:42","programName":"快乐大排档","date":"2015-05-27","tvName":"湛江电视台综合频道","url":"http://m.tvsou.com/epg.asp?TVid=94&ChannelID=498","tvShortName":"湛江电视台综合频道","isSatellite":"false"},{"programType":"综艺","startTime":"18:20","programName":"快乐大魔方","date":"2015-05-27","tvName":"陕西电视台五套","url":"http://m.tvsou.com/epg.asp?TVid=18&ChannelID=357","tvShortName":"陕西电视台五套","isSatellite":"false"},{"programType":"其他","startTime":"18:29","programName":"快乐大排档","date":"2015-05-27","tvName":"湛江电视台综合频道","url":"http://m.tvsou.com/epg.asp?TVid=94&ChannelID=498","tvShortName":"湛江电视台综合频道","isSatellite":"false"},{"programType":"其他","startTime":"20:48","programName":"快乐大排档","date":"2015-05-27","tvName":"湛江电视台公共频道","url":"http://m.tvsou.com/epg.asp?TVid=94&ChannelID=499","tvShortName":"湛江电视台公共频道","isSatellite":"false"},{"programType":"综艺","startTime":"10:21","programName":"快乐大魔方","date":"2015-05-28","tvName":"陕西电视台五套","url":"http://m.tvsou.com/epg.asp?TVid=18&ChannelID=357","tvShortName":"陕西电视台五套","isSatellite":"false"},{"programType":"其他","startTime":"12:42","programName":"快乐大排档","date":"2015-05-28","tvName":"湛江电视台综合频道","url":"http://m.tvsou.com/epg.asp?TVid=94&ChannelID=498","tvShortName":"湛江电视台综合频道","isSatellite":"false"},{"programType":"综艺","startTime":"18:20","programName":"快乐大魔方","date":"2015-05-28","tvName":"陕西电视台五套","url":"http://m.tvsou.com/epg.asp?TVid=18&ChannelID=357","tvShortName":"陕西电视台五套","isSatellite":"false"},{"programType":"其他","startTime":"18:29","programName":"快乐大排档","date":"2015-05-28","tvName":"湛江电视台综合频道","url":"http://m.tvsou.com/epg.asp?TVid=94&ChannelID=498","tvShortName":"湛江电视台综合频道","isSatellite":"false"},{"programType":"其他","startTime":"20:48","programName":"快乐大排档","date":"2015-05-28","tvName":"湛江电视台公共频道","url":"http://m.tvsou.com/epg.asp?TVid=94&ChannelID=499","tvShortName":"湛江电视台公共频道","isSatellite":"false"},{"programType":"其他","startTime":"21:25","programName":"快乐大PK","date":"2015-05-28","tvName":"山东电视台综艺频道","url":"http://m.tvsou.com/epg.asp?TVid=19&ChannelID=485","tvShortName":"山东电视台综艺频道","isSatellite":"false"},{"programType":"体育","startTime":"10:50","programName":"快乐无敌大PK","date":"2015-05-24","tvName":"安徽电视台综艺频道","url":"http://m.tvsou.com/epg.asp?TVid=20&ChannelID=344","tvShortName":"安徽电视台综艺频道","isSatellite":"false"},{"programType":"体育","startTime":"16:40","programName":"快乐无敌大PK","date":"2015-05-24","tvName":"安徽电视台综艺频道","url":"http://m.tvsou.com/epg.asp?TVid=20&ChannelID=344","tvShortName":"安徽电视台综艺频道","isSatellite":"false"},{"programType":"体育","startTime":"21:20","programName":"快乐无敌大PK","date":"2015-05-24","tvName":"安徽电视台综艺频道","url":"http://m.tvsou.com/epg.asp?TVid=20&ChannelID=344","tvShortName":"安徽电视台综艺频道","isSatellite":"false"},{"programType":"体育","startTime":"10:50","programName":"快乐无敌大PK","date":"2015-05-25","tvName":"安徽电视台综艺频道","url":"http://m.tvsou.com/epg.asp?TVid=20&ChannelID=344","tvShortName":"安徽电视台综艺频道","isSatellite":"false"},{"programType":"体育","startTime":"16:40","programName":"快乐无敌大PK","date":"2015-05-25","tvName":"安徽电视台综艺频道","url":"http://m.tvsou.com/epg.asp?TVid=20&ChannelID=344","tvShortName":"安徽电视台综艺频道","isSatellite":"false"},{"programType":"体育","startTime":"21:20","programName":"快乐无敌大PK","date":"2015-05-25","tvName":"安徽电视台综艺频道","url":"http://m.tvsou.com/epg.asp?TVid=20&ChannelID=344","tvShortName":"安徽电视台综艺频道","isSatellite":"false"},{"programType":"体育","startTime":"10:50","programName":"快乐无敌大PK","date":"2015-05-26","tvName":"安徽电视台综艺频道","url":"http://m.tvsou.com/epg.asp?TVid=20&ChannelID=344","tvShortName":"安徽电视台综艺频道","isSatellite":"false"},{"programType":"体育","startTime":"16:40","programName":"快乐无敌大PK","date":"2015-05-26","tvName":"安徽电视台综艺频道","url":"http://m.tvsou.com/epg.asp?TVid=20&ChannelID=344","tvShortName":"安徽电视台综艺频道","isSatellite":"false"},{"programType":"体育","startTime":"21:20","programName":"快乐无敌大PK","date":"2015-05-26","tvName":"安徽电视台综艺频道","url":"http://m.tvsou.com/epg.asp?TVid=20&ChannelID=344","tvShortName":"安徽电视台综艺频道","isSatellite":"false"},{"programType":"体育","startTime":"10:50","programName":"快乐无敌大PK","date":"2015-05-27","tvName":"安徽电视台综艺频道","url":"http://m.tvsou.com/epg.asp?TVid=20&ChannelID=344","tvShortName":"安徽电视台综艺频道","isSatellite":"false"},{"programType":"体育","startTime":"16:40","programName":"快乐无敌大PK","date":"2015-05-27","tvName":"安徽电视台综艺频道","url":"http://m.tvsou.com/epg.asp?TVid=20&ChannelID=344","tvShortName":"安徽电视台综艺频道","isSatellite":"false"},{"programType":"体育","startTime":"21:20","programName":"快乐无敌大PK","date":"2015-05-27","tvName":"安徽电视台综艺频道","url":"http://m.tvsou.com/epg.asp?TVid=20&ChannelID=344","tvShortName":"安徽电视台综艺频道","isSatellite":"false"},{"programType":"其他","startTime":"10:40","programName":"快乐无敌大PK","date":"2015-05-28","tvName":"安徽电视台综艺频道","url":"http://m.tvsou.com/epg.asp?TVid=20&ChannelID=344","tvShortName":"安徽电视台综艺频道","isSatellite":"false"}]}
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
         * header : 为您找到下面的结果
         * url : http://kcbj.openspeech.cn/service/iss?wuuid=65a591557906745a8b4c7d9ed37ae705&ver=2.0&method=webPage&uuid=60f9e8ed34db06dc0f800ffb2c1f915bquery
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
         * slots : {"programName":"快乐大本营"}
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
             * programName : 快乐大本营
             * tvName : 电视台名称
             * programType : 节目类型
             */

            private String programName;
            private String startTime;
            private String tvName;
            private String programType;

            public String getStartTime() {
                return startTime;
            }

            public void setStartTime(String startTime) {
                this.startTime = startTime;
            }

            public String getTvName() {
                return tvName;
            }

            public void setTvName(String tvName) {
                this.tvName = tvName;
            }

            public String getProgramType() {
                return programType;
            }

            public void setProgramType(String programType) {
                this.programType = programType;
            }

            public String getProgramName() {
                return programName;
            }

            public void setProgramName(String programName) {
                this.programName = programName;
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
             * programType : 综艺
             * startTime : 05:00
             * programName : 	快乐大本营
             * date : 2015-05-24
             * tvName : 湖南电视台国际频道(亚洲)
             * url : http://m.tvsou.com/epg.asp?TVid=24&ChannelID=1544
             * tvShortName : 湖南电视台国际频道(亚洲)
             * isSatellite : 是否是卫视台 true|false
             */

            private String programType;
            private String startTime;
            private String programName;
            private String date;
            private String tvName;
            private String url;
            private String tvShortName;
            private String isSatellite;

            public String getProgramType() {
                return programType;
            }

            public void setProgramType(String programType) {
                this.programType = programType;
            }

            public String getStartTime() {
                return startTime;
            }

            public void setStartTime(String startTime) {
                this.startTime = startTime;
            }

            public String getProgramName() {
                return programName;
            }

            public void setProgramName(String programName) {
                this.programName = programName;
            }

            public String getDate() {
                return date;
            }

            public void setDate(String date) {
                this.date = date;
            }

            public String getTvName() {
                return tvName;
            }

            public void setTvName(String tvName) {
                this.tvName = tvName;
            }

            public String getUrl() {
                return url;
            }

            public void setUrl(String url) {
                this.url = url;
            }

            public String getTvShortName() {
                return tvShortName;
            }

            public void setTvShortName(String tvShortName) {
                this.tvShortName = tvShortName;
            }

            public String getIsSatellite() {
                return isSatellite;
            }

            public void setIsSatellite(String isSatellite) {
                this.isSatellite = isSatellite;
            }
        }
    }
}
