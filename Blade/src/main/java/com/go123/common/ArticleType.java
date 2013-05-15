package com.go123.common;

/**
 * Created with IntelliJ IDEA.
 * User: wzhonggo
 * Date: 12-12-10
 * Time: 下午8:02
 * To change this template use File | Settings | File Templates.
 */
public enum ArticleType {
    video("视频"),
    event("赛事"),
    //    event2("复盘"),
    br_news("文章"),
    //    br_news2("快讯"),
    br_docu("采访");


    private String type;

    ArticleType(String type) {
        this.type = type;
    }

    public void setType(String type) {
        this.type = type;
    }
}
