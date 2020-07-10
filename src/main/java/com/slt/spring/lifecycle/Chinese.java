package com.slt.spring.lifecycle;

import org.springframework.beans.BeansException;
import org.springframework.beans.factory.BeanNameAware;
import org.springframework.beans.factory.InitializingBean;
import org.springframework.beans.factory.config.BeanPostProcessor;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ApplicationContextAware;
/**
 * spring 管理 Bean 生命周期行为主要有如下两个时机
　* @Description: 〉注入依赖关系之后
　* @Description: 〉即将销毁 Bean 之前
　* @author shalongteng
　* @date 2020/7/10 10:56
　*/
public class Chinese implements InitializingBean , BeanNameAware, ApplicationContextAware , BeanPostProcessor {
    @Override
    public void setBeanName(String s) {
        System.out.println ("===setBeanName===") ;
    }

    @Override
    public void afterPropertiesSet() throws Exception {
        System.out.println("正在执行afterPropertiesSet ");

    }

    @Override
    public void setApplicationContext(ApplicationContext applicationContext) throws BeansException {
        System.out.println("setApplicationContext");
    }
    public Chinese(){
        System.out.println("Spring 实例化主调 bean Chinese 实例 ．．");
    }

    public void init(){
        System.out.println("制作执行初始化方法 init");
    }
}
