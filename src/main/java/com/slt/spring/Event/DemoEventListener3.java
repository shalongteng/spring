package com.slt.spring.Event;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.context.ApplicationEvent;
import org.springframework.context.event.EventListener;
import org.springframework.scheduling.annotation.Async;
import org.springframework.stereotype.Component;

/**
　* @Description: 可以使用 condition 来筛选 触发那个监听器
　* @Description: 可以使用 参数来决定触发那个监听器
　* @author shalongteng
　* @date 2020/7/8 18:02
　*/
@Component
public class DemoEventListener3 {

    private static final Logger LOGGER = LoggerFactory.getLogger(DemoEventListener3.class);
    /**
    　* @Description:为了使注释@EventListener的功能更强大，Spring 4.2支持用SpEL表达式表达事件类型的方式
    　* @author shalongteng
    　* @date 2020/7/9 9:44
    　*/
    @Async
//    @EventListener(condition = "#blogModifiedEvent.importantChange")
    @EventListener()
    public void register(BlogModifiedEvent demoEvent) {
            System.out.println("BlogModifiedEvent");
    }
}
