package com.jokerpeng.demo.seven.bean;

import com.jokerpeng.demo.seven.base.BaseBean;

/**
 * Created by PengXiaoJie on 2017/5/24.09 17..
 */

public class ScheduleBean extends BaseBean {

    /**
     * semantic : {"slots":{"datetime":{"dateOrig":"明天","type":"DT_BASIC","time":"06:00:00","timeOrig":"六点钟","date":"2017-05-25"},"name":"clock","content":"设置一个明天六点钟的闹钟"}}
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
         * slots : {"datetime":{"dateOrig":"明天","type":"DT_BASIC","time":"06:00:00","timeOrig":"六点钟","date":"2017-05-25"},"name":"clock","content":"设置一个明天六点钟的闹钟"}
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
             * datetime : {"dateOrig":"明天","type":"DT_BASIC","time":"06:00:00","timeOrig":"六点钟","date":"2017-05-25"}
             * name : clock
             * content : 设置一个明天六点钟的闹钟
             */

            private DatetimeBean datetime;
            private String name;
            private String content;
            private String repeat;

            public String getRepeat() {
                return repeat;
            }

            public void setRepeat(String repeat) {
                this.repeat = repeat;
            }

            public DatetimeBean getDatetime() {
                return datetime;
            }

            public void setDatetime(DatetimeBean datetime) {
                this.datetime = datetime;
            }

            public String getName() {
                return name;
            }

            public void setName(String name) {
                this.name = name;
            }

            public String getContent() {
                return content;
            }

            public void setContent(String content) {
                this.content = content;
            }

            public static class DatetimeBean {
                /**
                 * dateOrig : 明天
                 * type : DT_BASIC
                 * time : 06:00:00
                 * timeOrig : 六点钟
                 * date : 2017-05-25
                 */

                private String dateOrig;
                private String type;
                private String time;
                private String timeOrig;
                private String date;

                public String getDateOrig() {
                    return dateOrig;
                }

                public void setDateOrig(String dateOrig) {
                    this.dateOrig = dateOrig;
                }

                public String getType() {
                    return type;
                }

                public void setType(String type) {
                    this.type = type;
                }

                public String getTime() {
                    return time;
                }

                public void setTime(String time) {
                    this.time = time;
                }

                public String getTimeOrig() {
                    return timeOrig;
                }

                public void setTimeOrig(String timeOrig) {
                    this.timeOrig = timeOrig;
                }

                public String getDate() {
                    return date;
                }

                public void setDate(String date) {
                    this.date = date;
                }
            }
        }
    }
}
