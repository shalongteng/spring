package com.slt.spring.aop.xml;

public class HelloWorldImpl2 implements HelloWorld {

    public void printHelloWorld() {
        System.out.println("------222222------按下HelloWorld2.printHelloWorld()------2222222------");
    }

    public void doPrint() {
        System.out.println("-------22222-----打印HelloWorldImpl2------22222-----");
        return ;
    }
}
