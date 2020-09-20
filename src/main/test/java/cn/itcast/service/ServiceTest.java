package cn.itcast.service;

import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * @program: ssm
 * @description: Test example
 * @author: Xiaofei Wang
 * @created: 2020/09/19 22:06
 */


public class ServiceTest {
    @Test
    public void run1(){
        //创建Spring容器
        ApplicationContext applicationContext = new ClassPathXmlApplicationContext("classpath:applicationContext.xml");
        //获取AccountService对象
        AccountService accountService = (AccountService) applicationContext.getBean("accountService");
        accountService.findAll();
    }
}
