package com.jokerpeng.demo.seven.bean;

import com.jokerpeng.demo.seven.base.BaseBean;

/**
 * Created by PengXiaoJie on 2017/5/22.20 21..
 */

public class CalcBean extends BaseBean {
    private BaikeBean.Answer answer;

    public BaikeBean.Answer getAnswer() {
        return answer;
    }

    public void setAnswer(BaikeBean.Answer answer) {
        this.answer = answer;
    }

    class Answer{
        private String text;
        private String type;

        public String getText() {
            return text;
        }

        public void setText(String text) {
            this.text = text;
        }

        public String getType() {
            return type;
        }

        public void setType(String type) {
            this.type = type;
        }

        @Override
        public String toString() {
            return "Answer{" +
                    "text='" + text + '\'' +
                    ", type='" + type + '\'' +
                    '}';
        }
    }

    @Override
    public String toString() {
        return getAnswer().toString();
    }
}
