package com.jokerpeng.demo.seven.bean;

import com.jokerpeng.demo.seven.base.BaseBean;

/**
 * Created by PengXiaoJie on 2017/5/23.20 29..
 */

public class RadioBean extends BaseBean {

    /**
     * semantic : {"slots":{"waveband":"fm","code":"90.8"}}
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
         * slots : {"waveband":"fm","code":"90.8"}
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
             * waveband : fm
             * code : 90.8
             */

            private String waveband;
            private String code;
            private String name;

            public String getName() {
                return name;
            }

            public void setName(String name) {
                this.name = name;
            }

            public String getWaveband() {
                return waveband;
            }

            public void setWaveband(String waveband) {
                this.waveband = waveband;
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
