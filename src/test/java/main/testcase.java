package main;

import com.shop.entity.Users;
import com.shop.service.UsersService;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.util.List;

public class testcase {
	@Test
	public void testService123(){
		ApplicationContext tx=new ClassPathXmlApplicationContext("spring-config.xml");
		UsersService service=(UsersService)tx.getBean("usersService");
		List<Users> user=service.selUsersAll();
		System.out.println(user);
	}
}
