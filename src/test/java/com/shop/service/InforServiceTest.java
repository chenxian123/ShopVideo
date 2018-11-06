package com.shop.service;

import com.shop.entity.Infor;
import com.shop.vo.InforMessage;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.util.ArrayList;
import java.util.List;

import static org.junit.Assert.*;

public class InforServiceTest {
    ApplicationContext tx=new ClassPathXmlApplicationContext("spring-config.xml");
    InforService service=(InforService)tx.getBean("inforService");
    private Infor infor=new Infor();

    @Test
    public void insInfor() {

    }

    @Test
    public void selAllInfor() {
        List<InforMessage> infor=new ArrayList<>();
        infor=service.selAllInfor();
        System.out.println(infor);
    }

    @Test
    public void selReceiverInfor() {
        List<InforMessage> informsg=new ArrayList<>();
        informsg=service.selReceiverInfor(9);
        System.out.println(informsg);
    }

    @Test
    public void selSenderInfor() {
        List<InforMessage> informsg=new ArrayList<>();
        informsg=service.selSenderInfor(9);
        System.out.println(informsg);
    }

    @Test
    public void selInforById(){
        List<InforMessage> informsg=new ArrayList<>();
        informsg=service.selInforById(1);
        System.out.println(informsg);
    }

    @Test
    public void selIsdeleteInfor(){
        List<InforMessage> informsg=new ArrayList<>();
        informsg=service.selIsdeleteInfor();
        System.out.println(informsg);
    }
}