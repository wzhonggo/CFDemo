package com.go123.persistence.domain;

/**
 * Created with IntelliJ IDEA.
 * User: wzhonggo
 * Date: 12-12-3
 * Time: 下午8:24
 * To change this template use File | Settings | File Templates.
 */

import org.springframework.data.jpa.domain.AbstractPersistable;

import javax.persistence.Entity;

/**
 * 文章
 */
@Entity
public class Article extends AbstractPersistable<Long> {

    //    标题
    private String title;
    //    内容
    private String content;
    //    类型
    private String type;
    //    日期
    private String date;
    //   网址
    private String url;

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }
}
