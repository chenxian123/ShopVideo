package com.shop.service;

import com.shop.entity.Users;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.util.List;

public class UsersServiceTest {
    ApplicationContext tx=new ClassPathXmlApplicationContext("spring-config.xml");
    UsersService service=(UsersService)tx.getBean("usersService");
    private Users users=new Users();

    @Test
    public void insUsers() {
        users.setName("888888");
        users.setGender("girl");
        users.setPhone("888888");
        users.setUsernum(456789);
        service.insUsers(users);
    }

    @Test
    public void selUsers() {
        users=service.selUsers(1);
        System.out.println(users);
    }

    @Test
    public void updUsers() {
        users.setName("123456");
        service.updUsers(users,12);
    }

    @Test
    public void delUsers() {
        service.delUsers(6);
    }

    @Test
    public void selUsersAll() {
        List<Users> users=service.selUsersAll();
        for(Users user:users){
            System.out.println(user);
        }
    }

    @Test
    public void snpUsers() {
        Users users=service.snpUsers("cx","123");
        System.out.println(users);
    }
}