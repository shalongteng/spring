package com.slt.spring.beanPostProcess;

import org.springframework.beans.BeansException;
import org.springframework.beans.factory.config.BeanFactoryPostProcessor;
import org.springframework.beans.factory.config.ConfigurableListableBeanFactory;
import org.springframework.stereotype.Component;
import java.util.Arrays;

/**
　* @Description: Bean 后处理器负责处理容器
   中的所有 Bean 实例，而容器后处理器则负 处理容器本身
 1、 BeanFactoryPostProcessor，是针对整个工厂生产出来的BeanDefinition作出修改或者注册。
 作用于BeanDefinition时期。从名称可以看出是容器级别的
　* @author shalongteng
　* @date 2020/7/11 11:15
　*/
@Component
public class MyBeanFactoryPostProcessor implements BeanFactoryPostProcessor {
    /**
    　* @Description: 通过beanFactory可以获取bean的示例或定义等。同时可以修改bean的属性，
        这是和BeanPostProcessor最大的区别。
    　* @author shalongteng
    　* @date 2020/7/11 10:13
    　*/
    @Override
    public void postProcessBeanFactory(ConfigurableListableBeanFactory beanFactory) throws BeansException {
        System.out.println("MyBeanFactoryPostProcessor...postProcessBeanFactory...");
        int count = beanFactory.getBeanDefinitionCount();
        String[] names = beanFactory.getBeanDefinitionNames();
        System.out.println("当前BeanFactory中有"+count+" 个Bean");
        System.out.println(Arrays.asList(names));
    }

}
