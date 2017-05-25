package com.jokerpeng.demo.seven.bean;

import com.jokerpeng.demo.seven.base.BaseBean;

/**
 * Created by PengXiaoJie on 2017/5/24.09 36..
 */

public class VideoBean extends BaseBean {

    /**
     * semantic : {"slots":{"keywords":"中国合伙人","queryField":"VIDEO_NAME"}}
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
         * slots : {"keywords":"中国合伙人","queryField":"VIDEO_NAME"}
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
             * keywords : 中国合伙人
             * queryField : 被查询字段VIDEO_NAME
             * channel ; 渠道
             * actor ; 演员名
             * director ; 导演名
             * country ; 发行地区
             * videoCategory ; 视频分类 电影|电视剧|节目
             * videoTag ; 视频内容分类 情感|青春偶像|古装|犯罪|剧情|经典|武侠|警匪|军事等
             * season ; 电视剧的“部”
             * episode ; 电视剧的“集”
             * datetime ; 时间
             * tvchannel ; 频道
             * popularity ; 评价
             */

            private String keywords;
            private String queryField;
            private String channel;
            private String actor;
            private String director;
            private String country;
            private String videoCategory;
            private String videoTag;
            private String season;
            private String episode;
            private String datetime;
            private String tvchannel;
            private String popularity;

            public String getChannel() {
                return channel;
            }

            public void setChannel(String channel) {
                this.channel = channel;
            }

            public String getActor() {
                return actor;
            }

            public void setActor(String actor) {
                this.actor = actor;
            }

            public String getDirector() {
                return director;
            }

            public void setDirector(String director) {
                this.director = director;
            }

            public String getCountry() {
                return country;
            }

            public void setCountry(String country) {
                this.country = country;
            }

            public String getVideoCategory() {
                return videoCategory;
            }

            public void setVideoCategory(String videoCategory) {
                this.videoCategory = videoCategory;
            }

            public String getVideoTag() {
                return videoTag;
            }

            public void setVideoTag(String videoTag) {
                this.videoTag = videoTag;
            }

            public String getSeason() {
                return season;
            }

            public void setSeason(String season) {
                this.season = season;
            }

            public String getEpisode() {
                return episode;
            }

            public void setEpisode(String episode) {
                this.episode = episode;
            }

            public String getDatetime() {
                return datetime;
            }

            public void setDatetime(String datetime) {
                this.datetime = datetime;
            }

            public String getTvchannel() {
                return tvchannel;
            }

            public void setTvchannel(String tvchannel) {
                this.tvchannel = tvchannel;
            }

            public String getPopularity() {
                return popularity;
            }

            public void setPopularity(String popularity) {
                this.popularity = popularity;
            }

            public String getKeywords() {
                return keywords;
            }

            public void setKeywords(String keywords) {
                this.keywords = keywords;
            }

            public String getQueryField() {
                return queryField;
            }

            public void setQueryField(String queryField) {
                this.queryField = queryField;
            }
        }
    }
}
