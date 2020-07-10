package com.slt.spring.javaeeBook.model;

import org.springframework.beans.BeansException;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ApplicationContextAware;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
　* @Description: 实现ApplicationContextAware 接口 可以拿到 spring容器
　* @Description: 也可以直接注解方式 注入容器
　* @author shalongteng
　* @date 2020/7/9 11:30
　*/
@Configuration
public class Person2 {
    @Value("123")
    private String name;
    @Value("666")
    private String sex;

    private Axe axe;
    public Person2() {

    }
    public Person2(String name, String sex) {
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


}
