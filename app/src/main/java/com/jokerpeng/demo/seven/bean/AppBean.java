package com.jokerpeng.demo.seven.bean;

import com.jokerpeng.demo.seven.base.BaseBean;

/**
 * Created by PengXiaoJie on 2017/5/22.19 32..
 */

public class AppBean extends BaseBean {
    private Semantic semantic;

    public Semantic getSemantic() {
        return semantic;
    }

    public void setSemantic(Semantic semantic) {
        this.semantic = semantic;
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

            private String name;
            private String category;
            private String keyword;

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

            public String getKeyword() {
                return keyword;
            }

            public void setKeyword(String keyword) {
                this.keyword = keyword;
            }
        }
    }
}
