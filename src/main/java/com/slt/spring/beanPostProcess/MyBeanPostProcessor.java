package com.slt.spring.beanPostProcess;

import org.springframework.beans.BeansException;
import org.springframework.beans.factory.config.BeanPostProcessor;
import org.springframework.stereotype.Component;

/**
 * 后置处理器：这种后处理器会对容器中的 Bean 进行后处理，对 Bean 进行额外加强
 * 运行顺序：
 * 实例化bean对象
 * 设置对象属性
 * 检查Aware相关接口，设置相关依赖
 * BeanPostProcessor 前置处理
 * 检查是否是InitializingBean，决定是否调用afterPropertiesSet
 * 检查是否有配置init-method
 * BeanPostProcessor 后置处理
 * 使用对象
 * 是否实现DisposableBean
 * 是否配置自定义的 destory方法
 */
@Component
public class MyBeanPostProcessor implements BeanPostProcessor {
    /**
     ＊对容器中的 Bean 实例进行后处理
     * @param bean 需要进行后处理的原 Bean 实例
      ＠ param beanName 需要进行后处理的 Bean 的配置 id
     * @return 返回后处理完成后的 Bean
     */
    @Override
    public Object postProcessBeforeInitialization(Object bean, String beanName) throws BeansException {
        // TODO Auto-generated method stub
        System.out.println("postProcessBeforeInitialization..."+beanName+"=>"+bean);
        return bean;
    }

    @Override
    public Object postProcessAfterInitialization(Object bean, String beanName) throws BeansException {
        // TODO Auto-generated method stub
        System.out.println("postProcessAfterInitialization..."+beanName+"=>"+bean);
        return bean;
    }

}
