package com.shop.controller.impl;

import com.shop.controller.InforController;
import com.shop.entity.Infor;
import com.shop.entity.Users;
import com.shop.service.InforService;
import com.shop.service.UsersService;
import com.shop.vo.InforMessage;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import java.util.ArrayList;
import java.util.List;

@Controller
public class InforControllerImpl implements InforController {
    @Autowired
    private InforService inforService;
    @Autowired
    private UsersService usersService;
    @Autowired
    private Infor infor;
    private int i;
    private String msg;

    @Override
    @RequestMapping("/inbox.do")
    public ModelAndView inbox(int receiver) throws Exception {
        ModelAndView movw=new ModelAndView();
        List<InforMessage> listinfor=inforService.selReceiverInfor(receiver);
        movw.addObject("listinfor",listinfor);
        movw.setViewName("inbox");
        return movw;
    }
    @Override
    @RequestMapping("/outbox.do")
    public ModelAndView outbox(int sender) throws Exception {
        ModelAndView movw=new ModelAndView();
        List<InforMessage> listinfor=inforService.selSenderInfor(sender);
        movw.addObject("listinfor",listinfor);
        movw.setViewName("outbox");
        return movw;
    }
    @Override
    @RequestMapping("/sendmsg.do")
    public ModelAndView sendmsg(String content,int sender,int receiver) throws Exception {
        ModelAndView movw=new ModelAndView();
        infor.setContent(content);
        infor.setSender(sender);
        infor.setReceiver(receiver);
        i=inforService.insInfor(infor);
        if(i == 0){
            msg="发送成功";
        }else{
            msg="发送失败";
        }
        movw.addObject("msg",msg);
        movw.setViewName("msg");
        return movw;
    }
    @Override
    @RequestMapping("/delmsg.do")
    public String delmsg(int id) throws  Exception{
        i=inforService.delInfor(id);
        if(i == 0){
            msg="删除成功";
        }else{
            msg="删除失败";
        }
        return "msg";
    }
    @Override
    @RequestMapping("/dustbin.do")
    public ModelAndView dustbin(int id){
        ModelAndView movw=new ModelAndView();
        movw.addObject("msg",msg);
        movw.setViewName("dustbin");
        return movw;
    }

    @Override
    @RequestMapping("/infor")
    public String inforpage() throws Exception {
        return "infor";
    }
    @Override
    @RequestMapping("/sendmsg")
    public ModelAndView sendmsgpage() throws Exception {
        ModelAndView movw=new ModelAndView();
        List<Users> listuser=new ArrayList<>();
        listuser=usersService.selUsersAll();
        movw.addObject("listuser",listuser);
        movw.setViewName("sendmsg");
        return movw;
    }
}
