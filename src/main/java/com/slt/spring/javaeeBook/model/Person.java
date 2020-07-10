package com.slt.spring.javaeeBook.model;

import org.springframework.beans.BeansException;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ApplicationContextAware;
/**
　* @Description: 实现ApplicationContextAware 接口 可以拿到 spring容器
　* @Description: 也可以直接注解方式 注入容器
　* @author shalongteng
　* @date 2020/7/9 11:30
　*/
public class Person implements ApplicationContextAware {
    private String name;
    private String sex;
    private ApplicationContext applicationContext;

    public Person() {

    }
    public Person(String name, String sex) {
        this.name = name;
        this.sex = sex;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        System.out.println("set 方法被调用");
        this.name = name;
    }

    public String getSex() {
        return sex;
    }

    public void setSex(String sex) {
        this.sex = sex;
    }

    @Override
    public void setApplicationContext(ApplicationContext applicationContext) throws BeansException {
        this.applicationContext = applicationContext;
    }
}
