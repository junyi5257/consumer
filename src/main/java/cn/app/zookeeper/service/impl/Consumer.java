package cn.app.zookeeper.service.impl;

import cn.app.zookeeper.service.DemoService;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * 测试客户端
 * Created by goujy on 2017/3/30.
 */
public class Consumer {

    public static void main(String[] args) {
        System.out.println("Start to load--Consumer");
        //
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext(new String[]{"application-context.xml"});
        context.start();
        //
        System.out.println("End to load--Conddddsumer");

        DemoService demoService = (DemoService) context.getBean("demoService");
        String result = demoService.sayHello("World");
        System.out.println("result of dubbo: " + result);


    }
}
