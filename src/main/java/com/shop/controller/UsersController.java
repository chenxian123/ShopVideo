package com.shop.controller;

import org.springframework.web.servlet.ModelAndView;

import javax.servlet.http.HttpSession;

public interface UsersController {
    /*用户登录，跳转主页*/
    ModelAndView login(String name, String password,String automatic,HttpSession session) throws Exception;
    /*用户退出*/
    String userExit(HttpSession session) throws Exception;
    /*注册用户*/
    ModelAndView insuser(String name,String gender,String phone,String password) throws Exception;
    /*根据id查询用户信息*/
    ModelAndView seluser(int id) throws Exception;
    /*修改用户信息*/
    ModelAndView upduser(String name,String phone,String password,int id) throws Exception;
    /*删除用户*/
    ModelAndView deluser(int id) throws Exception;
    /*查询所有用户信息*/
    ModelAndView selAll() throws Exception;

    /*返回首页*/
    String indexpage() throws Exception;
    /*跳转登录页面*/
    String loginpage() throws Exception;
    /*跳转注册页面*/
    String insuserpage() throws Exception;
}
