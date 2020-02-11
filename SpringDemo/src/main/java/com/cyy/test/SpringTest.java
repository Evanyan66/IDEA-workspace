package main.java.com.cyy.test;

import main.java.com.cyy.pojo.UserService;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;


/**
 * Created by 12576 on 2020/2/10.
 */
public class SpringTest {

    @Test
    public void HelloSpring(){

        ApplicationContext ctx=new ClassPathXmlApplicationContext("applicationContext.xml");

        //User user= (User) ctx.getBean("User");

        UserService out= (UserService) ctx.getBean("print");

        System.out.println("===================================================");

        out.print();


    }

}
