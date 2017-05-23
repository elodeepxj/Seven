package com.jokerpeng.demo.seven.bean;

import com.jokerpeng.demo.seven.base.BaseBean;

import java.util.List;

/**
 * Created by PengXiaoJie on 2017/5/23.20 20..
 */

public class MusicBean extends BaseBean {

    /**
     * webPage : {"header":"","url":"http://kcbj.openspeech.cn/service/iss?wuuid=1d32a1b3b1ae9e0cf93a956a6e20f80e&ver=2.0&method=webPage&uuid=4221cb30982cbc9b41d880529725e28bquery"}
     * semantic : {"slots":{"song":"青花瓷"}}
     * rc : 0
     * data : {"result":[{"singer":"龚玥","sourceName":"自产音乐","name":"青花瓷","downloadUrl":"http://file.kuyinyun.com/group1/M00/92/D7/rBBGdFPXqZuAVx5lABeMEjdKw_Q400.mp3"},{"singer":"周杰伦","sourceName":"自产音乐","name":"青花瓷","downloadUrl":"http://file.diyring.cc/UserRingWorksFile/0/50284096.mp3"},{"singer":"常静+杜冲+罗慧芳","sourceName":"自产音乐","name":"青花瓷","downloadUrl":"http://file.kuyinyun.com/group1/M00/E6/52/rBBGdFQUQpmARRRdAAvA-U7IH5E664.mp3"},{"singer":"常静+罗慧芳+杜冲","sourceName":"自产音乐","name":"青花瓷","downloadUrl":"http://file.kuyinyun.com/group2/M00/1F/EF/rBBGelR2SHeAadUaAAOrCcQQS2I254.mp3"},{"singer":"李行亮","sourceName":"自产音乐","name":"青花瓷","downloadUrl":"http://file.kuyinyun.com/group1/M00/86/62/rBBGdFPUQMyAOpaVABePVoT1gQE756.mp3"},{"singer":"李行亮","sourceName":"自产音乐","name":"青花瓷","downloadUrl":"http://file.kuyinyun.com/group1/M00/57/35/rBBGdFO21tWAFzRiABeMcCnRsCY994.mp3"},{"singer":"名乐心","sourceName":"自产音乐","name":"青花瓷","downloadUrl":"http://file.kuyinyun.com/group1/M00/3A/4E/rBBGdVPUcVmAc6t5ABd7zHTSN4Q538.mp3"},{"singer":"周杰伦","sourceName":"自产音乐","name":"青花瓷","downloadUrl":"http://file.kuyinyun.com/group1/M00/3A/4E/rBBGdVPUcWOAWNr_ABePVrJEUNU634.mp3"},{"singer":"大男孩","sourceName":"自产音乐","name":"青花瓷","downloadUrl":"http://file.kuyinyun.com/group1/M00/EA/00/rBBGdVRK4rSACnT2AAOqGQ6gfX4556.mp3"},{"singer":"阳泽","sourceName":"自产音乐","name":"青花瓷","downloadUrl":"http://file.kuyinyun.com/group1/M00/36/F1/rBBGdFRK4riAfYUAAAOqGZl8550372.mp3"}]}
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
         * url : http://kcbj.openspeech.cn/service/iss?wuuid=1d32a1b3b1ae9e0cf93a956a6e20f80e&ver=2.0&method=webPage&uuid=4221cb30982cbc9b41d880529725e28bquery
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
         * slots : {"song":"青花瓷"}
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
             * song : 青花瓷
             */

            private String song;

            public String getSong() {
                return song;
            }

            public void setSong(String song) {
                this.song = song;
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
             * singer : 龚玥
             * sourceName : 自产音乐
             * name : 青花瓷
             * downloadUrl : http://file.kuyinyun.com/group1/M00/92/D7/rBBGdFPXqZuAVx5lABeMEjdKw_Q400.mp3
             */

            private String singer;
            private String sourceName;
            private String name;
            private String downloadUrl;

            public String getSinger() {
                return singer;
            }

            public void setSinger(String singer) {
                this.singer = singer;
            }

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

            public String getDownloadUrl() {
                return downloadUrl;
            }

            public void setDownloadUrl(String downloadUrl) {
                this.downloadUrl = downloadUrl;
            }
        }
    }
}
