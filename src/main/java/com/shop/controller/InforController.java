package com.shop.controller;

import org.springframework.web.servlet.ModelAndView;

public interface InforController {
    /*收件箱*/
    ModelAndView inbox(int receiver) throws Exception;
    /*已发信息*/
    ModelAndView outbox(int sender) throws Exception;
    /*发送信件*/
    ModelAndView sendmsg(String conter,int sender,int receiver) throws Exception;
    /*删除消息*/
    String delmsg(int id) throws Exception;
    /*垃圾箱*/
    ModelAndView dustbin(int id) throws Exception;
    /*彻底删除*/

    /*跳转信件页面*/
    String inforpage() throws Exception;
    /*跳转发件箱页面*/
    ModelAndView sendmsgpage() throws Exception;
}
