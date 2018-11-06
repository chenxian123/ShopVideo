package main;

import com.shop.entity.Infor;
import com.shop.service.InforService;
import com.shop.vo.InforMessage;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.util.List;

public class TestCase2 {

    @Test
    public void inforService() {
        ApplicationContext tx = new ClassPathXmlApplicationContext("spring-config.xml");
        InforService service = (InforService) tx.getBean("inforService");
        /*List<Infor> infors=service.selAllInfor();*/
        List<InforMessage> inforss = service.selReceiverInfor(2);
        /*Infor infores=new Infor();
        infores.setContent("哈哈哈哈哈哈哈哈哈");
        infores.setSender(2);
        infores.setReceiver(3);
        int a=service.insInfor(infores);*/
        /*System.out.println(infors);*/
       /* System.out.println(inforss);*/
        /*System.out.println(a);*/
        /*for (Infor infor:inforss){
            System.out.println(infor.getContenttext());
        }*/
        System.out.println(inforss);
    }
}
