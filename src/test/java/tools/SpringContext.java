package tools;

import com.shop.service.UsersService;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class SpringContext {
    //首字母大写
    public static String captureName(String services) {
        //     name = name.substring(0, 1).toUpperCase() + name.substring(1);
        //        return  name;
        char[] cs=services.toCharArray();
        cs[0]-=32;
        return String.valueOf(cs);
    }

}
