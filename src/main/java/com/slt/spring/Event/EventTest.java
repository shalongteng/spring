package com.slt.spring.Event;

import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
/**
　* @Description: spring 事件 三要素
    1、applicationContext 触发事件
    2、事件实体类
    3、监听器

    监听器 两种实现方式
　* @author shalongteng
　* @date 2020/7/9 9:18
　*/
@RestController
public class EventTest {
    @Autowired
    private ApplicationContext applicationContext;
    /**
    　* @Description: 这种方式 容器
    　* @author shalongteng
    　* @date 2020/7/9 9:17
    　*/
    @Test
    public void TestEvent(){
        //创建 Spring 容器
        ApplicationContext applicationContext = new ClassPathXmlApplicationContext("beans.xml");
        //发布事件
        DemoEvent demoEvent = new DemoEvent(this,"发布了一条消息");

        applicationContext.publishEvent(demoEvent);
    }
    /**
    　* @Description: 从web 测试两个 lister 都可以触发
    　* @author shalongteng
    　* @date 2020/7/9 9:16
    　*/
    @RequestMapping(value = "webTest")
    public void TestWeb(){
        //发布事件
        DemoEvent demoEvent = new DemoEvent(this,"webTest发布了一条消息");

        applicationContext.publishEvent(demoEvent);
    }
    /**
    　* @Description: 测试带条件的 事件
    　* @author shalongteng
    　* @date 2020/7/9 9:16
    　*/
    @RequestMapping(value = "TestCondition")
    public void TestCondition(){
        //发布事件

        BlogModifiedEvent blogModifiedEvent = new BlogModifiedEvent();
        applicationContext.publishEvent(blogModifiedEvent);
    }
}
