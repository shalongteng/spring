package com.slt.spring.Event;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.context.ApplicationEvent;
import org.springframework.context.ApplicationListener;
import org.springframework.stereotype.Component;
/**
　* @Description: 容器事件的监昕器类必须实现 ApplicationListener 接口，
　* @author shalongteng
　* @date 2020/7/8 18:02
　*/
@Component
public class DemoEventListener implements ApplicationListener{

    private static final Logger LOGGER = LoggerFactory.getLogger(DemoEventListener.class);

    @Override
    public void onApplicationEvent(ApplicationEvent demoEvent) {
        if(demoEvent instanceof DemoEvent){
            System.out.println(((DemoEvent) demoEvent).getMessage());
        }

    }
}
