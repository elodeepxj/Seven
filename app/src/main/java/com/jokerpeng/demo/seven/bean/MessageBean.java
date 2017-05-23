package com.jokerpeng.demo.seven.bean;

import com.jokerpeng.demo.seven.base.BaseBean;

/**
 * Created by PengXiaoJie on 2017/5/23.20 07..
 */

public class MessageBean extends BaseBean {

    /**
     * semantic : {"slots":{"content":"我明天去找你","name":"张三","messageType":"voice_message"}}
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
         * slots : {"content":"我明天去找你","name":"张三","messageType":"voice_message"}
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
             * content : 我明天去找你
             * name : 张三
             * messageType : voice_message
             */

            private String content;
            private String name;
            private String messageType;
            private String location;
            private String code;
            private String category;
            private String teleOperator;
            private String headNum;
            private String tailNum;

            public String getLocation() {
                return location;
            }

            public void setLocation(String location) {
                this.location = location;
            }

            public String getCode() {
                return code;
            }

            public void setCode(String code) {
                this.code = code;
            }

            public String getCategory() {
                return category;
            }

            public void setCategory(String category) {
                this.category = category;
            }

            public String getTeleOperator() {
                return teleOperator;
            }

            public void setTeleOperator(String teleOperator) {
                this.teleOperator = teleOperator;
            }

            public String getHeadNum() {
                return headNum;
            }

            public void setHeadNum(String headNum) {
                this.headNum = headNum;
            }

            public String getTailNum() {
                return tailNum;
            }

            public void setTailNum(String tailNum) {
                this.tailNum = tailNum;
            }

            public String getContentType() {
                return contentType;
            }

            public void setContentType(String contentType) {
                this.contentType = contentType;
            }

            private String contentType
                    ;

            public String getContent() {
                return content;
            }

            public void setContent(String content) {
                this.content = content;
            }

            public String getName() {
                return name;
            }

            public void setName(String name) {
                this.name = name;
            }

            public String getMessageType() {
                return messageType;
            }

            public void setMessageType(String messageType) {
                this.messageType = messageType;
            }
        }
    }
}
