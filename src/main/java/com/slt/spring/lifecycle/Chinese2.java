package com.slt.spring.lifecycle;

import org.springframework.context.annotation.Primary;
import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

/**
 * spring 管理 Bean 生命周期行为主要有如下两个时机
　* @Description: 〉注入依赖关系之后
　* @Description: 〉即将销毁 Bean 之前
　* @author shalongteng
　* @date 2020/7/10 10:56
　*/
@Primary
public class Chinese2 {

    public Chinese2(){
        System.out.println("Spring 实例化主调 bean Chinese 实例 ．．");
    }
    @PostConstruct
    public void init(){
        System.out.println("制作执行初始化方法 init");
    }
    @PreDestroy
    public void close(){
        System.out.println("销毁方法");
    }

    public static void main(String[] args) {
        String str = "consumeStatus,consumeName";
        System.out.println(str.replace("consumeStatus","0000"));
    }
}
