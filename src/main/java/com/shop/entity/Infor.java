package com.shop.entity;

import org.springframework.stereotype.Component;


@Component("infor")
public class Infor {
  private int id;
  private String content;
  private int sender;
  private int receiver;
  private int isdelete;

  public Infor() {
    super();
  }

  public Infor(String content, int sender, int receiver) {
    this.content = content;
    this.sender = sender;
    this.receiver = receiver;
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

  public int getSender() {
    return sender;
  }

  public void setSender(int sender) {
    this.sender = sender;
  }

  public int getReceiver() {
    return receiver;
  }

  public void setReceiver(int receiver) {
    this.receiver = receiver;
  }

  public int getIsdelete() {
    return isdelete;
  }

  public void setIsdelete(int isdelete) {
    this.isdelete = isdelete;
  }
}
