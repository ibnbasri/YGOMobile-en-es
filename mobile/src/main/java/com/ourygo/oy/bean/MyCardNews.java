package com.ourygo.oy.bean;

import com.ourygo.oy.util.Record;
import com.stx.xhb.xbanner.entity.SimpleBannerInfo;

public class MyCardNews extends SimpleBannerInfo {

    private String id;
    private String title;

    private String news_url;
    private String image_url;
    private int type;
    private String create_time;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
        setNews_url(Record.getMycardPostUrl(id));
    }

    public String getCreate_time() {
        return create_time;
    }

    public void setCreate_time(String create_time) {
        this.create_time = create_time;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getNews_url() {
        return news_url;
    }

    public void setNews_url(String news_url) {
        this.news_url = news_url;
    }

    public String getImage_url() {
        return image_url;
    }

    public void setImage_url(String image_url) {
        this.image_url = image_url;
    }

    public int getType() {
        return type;
    }

    public void setType(int type) {
        this.type = type;
    }

    @Override
    public Object getXBannerUrl() {
        return null;
    }
}
