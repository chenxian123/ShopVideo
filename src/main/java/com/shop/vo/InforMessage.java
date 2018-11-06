package com.shop.vo;

import org.springframework.stereotype.Component;

@Component("infroMessage")
public class InforMessage {
    private int id;
    private String content;
    private String name;
    private int isdelete;

    @Override
    public String toString() {
        return "InforMessage{" +
                "id=" + id +
                ", content='" + content + '\'' +
                ", name='" + name + '\'' +
                ", isdelete=" + isdelete +
                '}';
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getIsdelete() {
        return isdelete;
    }

    public void setIsdelete(int isdelete) {
        this.isdelete = isdelete;
    }
}
