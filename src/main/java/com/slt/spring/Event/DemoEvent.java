package com.slt.spring.Event;

import org.springframework.context.ApplicationEvent;
/**
　* @Description: 只要一个Java 类继承了 ApplicationEvent 基类，那该对象就可作为 Spring 容器的  容器事件。
　* @author shalongteng
　* @date 2020/7/8 18:00
　*/
public class DemoEvent extends ApplicationEvent {
    private String message;

    public DemoEvent(Object source, String message) {
        super(source);
        this.message = message;
    }
    public String getMessage() {
        return message;
    }
}
