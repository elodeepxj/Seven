package com.jokerpeng.demo.seven.bean;

import com.jokerpeng.demo.seven.base.BaseBean;

/**
 * Created by PengXiaoJie on 2017/5/23.20 36..
 */

public class TelephoneBean extends BaseBean {

    /**
     * semantic : {"slots":{"name":"张三"}}
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
         * slots : {"name":"张三"}
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
             * name : 张三
             */

            private String name;
            private String code;
            private String teleOperator;
            private String category;

            public String getCode() {
                return code;
            }

            public void setCode(String code) {
                this.code = code;
            }

            public String getTeleOperator() {
                return teleOperator;
            }

            public void setTeleOperator(String teleOperator) {
                this.teleOperator = teleOperator;
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
        }
    }
}
