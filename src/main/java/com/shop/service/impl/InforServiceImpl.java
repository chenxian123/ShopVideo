package com.shop.service.impl;

import com.shop.entity.Infor;
import com.shop.mapper.InforMapper;
import com.shop.service.InforService;
import com.shop.vo.InforMessage;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service("inforService")
public class InforServiceImpl implements InforService {
    @Autowired
    private InforMapper inforMapper;
    @Autowired
    private Infor infor;

    public int insInfor(Infor infor) {
        try {
            inforMapper.insertInfor(infor);
            System.out.println("发送信息");
        } catch (Exception e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
            return -1;
        }
        return 0;
    }

    public List<InforMessage> selAllInfor() {
        List<InforMessage> inforsmsg = new ArrayList<InforMessage>();
        try {
            inforsmsg = inforMapper.selectAllInfor();
            System.out.println("查询所有用户收发信息");
        } catch (Exception e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
        return inforsmsg;
    }

    public int delInfor(int id){
        try {
            inforMapper.delInfor(id);
            System.out.println("删除信息");
        } catch (Exception e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
            return -1;
        }
        return 0;
    }

    public List<InforMessage> selSenderInfor(int sender) {
        List<InforMessage> inforsmsg = new ArrayList<InforMessage>();
        try {
            inforsmsg = inforMapper.selectSenderInfor(sender);
            System.out.println("查询发送的信息");
        } catch (Exception e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
        return inforsmsg;
    }

    public List<InforMessage>selReceiverInfor(int receiver) {
        List<InforMessage> inforsmsg = new ArrayList<InforMessage>();
        try {
            inforsmsg = inforMapper.selectReceiverInfor(receiver);
            System.out.println("查询收到的信息");
        } catch (Exception e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
        return inforsmsg;
    }

    public List<InforMessage> selInforById(int id){
        List<InforMessage> informsg=new ArrayList<>();
        try {
            informsg = inforMapper.selectInforById(id);
            System.out.println("查询收到的信息");
        } catch (Exception e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
        return informsg;
    }

    public List<InforMessage> selIsdeleteInfor(){
        List<InforMessage> informsg=new ArrayList<>();
        try {
            informsg = inforMapper.selectIsdeleteInfor();
            System.out.println("查询垃圾箱");
        } catch (Exception e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
        return informsg;
    }
}
