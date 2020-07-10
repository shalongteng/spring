package com.slt.spring.Event;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.context.ApplicationEvent;
import org.springframework.context.ApplicationListener;
import org.springframework.context.event.EventListener;
import org.springframework.stereotype.Component;

/**
　* @Description: 通过配置文件拿到的容器，注解方式不生效。
　* @author shalongteng
　* @date 2020/7/8 18:02
　*/
@Component
public class DemoEventListener2{

    private static final Logger LOGGER = LoggerFactory.getLogger(DemoEventListener2.class);

    @EventListener
    public void register(ApplicationEvent demoEvent) {
        if(demoEvent instanceof DemoEvent){
            System.out.println("DemoEventListener2");
        }

    }
}
