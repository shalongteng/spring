package com.slt.spring.javaeeBook;

import com.slt.spring.javaeeBook.config.AppConfig;
import com.slt.spring.javaeeBook.model.Person;
import org.junit.Test;
import org.springframework.beans.factory.support.DefaultListableBeanFactory;
import org.springframework.beans.factory.xml.XmlBeanDefinitionReader;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.core.io.ClassPathResource;
import org.springframework.core.io.Resource;

import java.lang.annotation.Annotation;

public class BeanTest {
    @Test
    public void testContainer() {
        //创建 Spring 容器
        ApplicationContext applicationContext = new ClassPathXmlApplicationContext("beans.xml");
        //获取id为person 的bean
        Person person = applicationContext.getBean("person", Person.class);

//        System.out.println(person.getSex());
    }
    @Test
    public void testContainer2() {
        //创建 Spring 容器
        Resource resource = new ClassPathResource("beans.xml");
        DefaultListableBeanFactory beanFactory = new DefaultListableBeanFactory();
        new XmlBeanDefinitionReader(beanFactory).loadBeanDefinitions(resource);
        //获取id为person 的bean
        Person person = beanFactory.getBean("person", Person.class);

        System.out.println(person.getSex());
    }
    @Test
    public void testContainer3() {
        AnnotationConfigApplicationContext applicationContext = new AnnotationConfigApplicationContext(AppConfig.class);
        //获取id为person 的bean
        Person person = applicationContext.getBean("person", Person.class);

        System.out.println(person.getSex());
    }
}
