package com.jokerpeng.demo.seven.bean;

import com.jokerpeng.demo.seven.base.BaseBean;

/**
 * Created by PengXiaoJie on 2017/5/24.09 47..
 */

public class WeiboBean extends BaseBean {

    /**
     * semantic : {"slots":{"channel":"SINA","ordinal":"CURRENT_NEW"}}
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
         * slots : {"channel":"SINA","ordinal":"CURRENT_NEW"}
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
             * channel : 微博网站 SINA
             * ordinal : 条数索引 CURRENT_NEW
             * friend ; 好友名
             * content : 内容
             */

            private String channel;
            private String ordinal;
            private String friend;
            private String content;

            public String getFriend() {
                return friend;
            }

            public void setFriend(String friend) {
                this.friend = friend;
            }

            public String getContent() {
                return content;
            }

            public void setContent(String content) {
                this.content = content;
            }

            public String getChannel() {
                return channel;
            }

            public void setChannel(String channel) {
                this.channel = channel;
            }

            public String getOrdinal() {
                return ordinal;
            }

            public void setOrdinal(String ordinal) {
                this.ordinal = ordinal;
            }
        }
    }
}
