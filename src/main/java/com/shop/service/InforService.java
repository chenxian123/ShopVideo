package com.shop.service;

import com.shop.entity.Infor;
import com.shop.mapper.InforMapper;
import com.shop.vo.InforMessage;

import java.util.List;

public interface InforService {
    /*发送邮件*/
    int insInfor(Infor infor);
    /*查询所有信件*/
    List<InforMessage> selAllInfor();
    /*删除信件(标记数据库isdelete字段值为1)*/
    int delInfor(int id);
    /*根据收件人查询所有收件信息*/
    List<InforMessage> selReceiverInfor(int receiver);
    /*根据发件人查询所有发件信息*/
    List<InforMessage> selSenderInfor(int sender);
    /*垃圾箱*/
    List<InforMessage> selIsdeleteInfor();
    /*根据id查询信息*/
    List<InforMessage> selInforById(int id);
}
