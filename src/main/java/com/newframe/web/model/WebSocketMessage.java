package com.newframe.web.model;

import java.util.Date;

/**
 * Created by xm on 2016/4/25.
 */
public class WebSocketMessage {
    private String id;
    private Date date;
    private Object data;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    public Object getData() {
        return data;
    }

    public void setData(Object data) {
        this.data = data;
    }
}
