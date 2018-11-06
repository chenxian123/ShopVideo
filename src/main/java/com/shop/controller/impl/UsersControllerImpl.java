package com.shop.controller.impl;

import com.shop.controller.UsersController;
import com.shop.entity.Users;
import com.shop.service.UsersService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

@Controller
public class UsersControllerImpl implements UsersController {
    @Autowired
    private UsersService usersService;
    @Autowired
    private Users users;
    /*@Autowired
    private HttpServletRequest request;*/
    private int i;
    private String msg;

    @Override
    @RequestMapping("/login.do")
    public ModelAndView login(String name, String password, String automatic, HttpSession session) throws Exception {
        ModelAndView movw = new ModelAndView();
        users = usersService.snpUsers(name, password);
        System.out.println(name + "," + password + "," + automatic);
        System.out.println(users);
        if (users != null) {
            session.setAttribute("userSession", users);
            msg = "登录成功";
            movw.addObject("msg", msg);
            movw.setViewName("index");
            if (automatic != null) {
                System.out.println("保存用户名密码");
            } else {
                System.out.println("不保存用户名密码");
            }
            return movw;
        } else {
            msg = "登陆失败";
            movw.setViewName("msg");
            movw.addObject("msg", msg);
            return movw;
        }
    }

    @Override
    @RequestMapping("/userExit.do")
    public String userExit(HttpSession session) throws Exception {
        session.invalidate();
        return "index";
    }

    @Override
    @RequestMapping("/insuser.do")
    public ModelAndView insuser(String name, String gender, String phone, String password) throws Exception {
        ModelAndView movw = new ModelAndView();
        int dom = (int) (1000000 * Math.random());
        /*String regip = request.getRemoteAddr();*/
        users.setName(name);
        users.setGender(gender);
        users.setPhone(phone);
        users.setPassword(password);
        /*users.setRegip(regip);*/
        users.setJoindate(new Date());
        users.setUsernum(dom);
        i = usersService.insUsers(users);
        if (i == 0) {
            msg = "注册成功";
        } else {
            msg = "注册失败";
        }
        System.out.printf(name, password, phone, /*regip,*/ new Date(), dom, users);
        movw.setViewName("msg");
        movw.addObject("msg", msg);
        return movw;
    }

    @Override
    @RequestMapping("/seluser.do")
    public ModelAndView seluser(int id) throws Exception {
        ModelAndView movw = new ModelAndView();
        users = usersService.selUsers(id);
        movw.setViewName("seluser");
        movw.addObject("users", users);
        return movw;
    }

    @Override
    @RequestMapping("/upduser.do")
    public ModelAndView upduser(String name,String phone,String password,int id) throws Exception {
        ModelAndView movw = new ModelAndView();
        users = usersService.selUsers(id);
        users.setName(name);
        users.setPhone(phone);
        users.setPassword(password);
        i = usersService.updUsers(users,id);
        if(i ==0){
            msg="用户信息更新成功";
        }else {
            msg="用户信息更新失败";
        }
        movw.setViewName("msg");
        movw.addObject("msg", msg);
        return movw;
    }

    @Override
    @RequestMapping("/deluser.do")
    public ModelAndView deluser(int id) throws Exception {
        ModelAndView movw = new ModelAndView();
        i = usersService.delUsers(id);
        if(i == 0){
            msg="用户删除成功";
        }else {
            msg="用户删除失败";
        }
        movw.setViewName("msg");
        movw.addObject("msg", msg);
        return movw;
    }

    @Override
    @RequestMapping("/selAll.do")
    public ModelAndView selAll() throws Exception {
        ModelAndView movw = new ModelAndView();
        List<Users> listuser = new ArrayList<>();
        listuser = usersService.selUsersAll();
        movw.addObject("listuser", listuser);
        movw.setViewName("selall");
        return movw;
    }

    @Override
    @RequestMapping("/index")
    public String indexpage() throws Exception {
        return "index";
    }

    @Override
    @RequestMapping("/login")
    public String loginpage() throws Exception {
        return "login";
    }

    @Override
    @RequestMapping("/insuser")
    public String insuserpage() throws Exception {
        return "insuser";
    }
}
