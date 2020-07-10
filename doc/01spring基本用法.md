#1、Spring 框架的组成结构图
    当使用 Spring 框架时，必须使用 Spring Core Container Spring 容器，它代表了 Spring 框架的核心机制， 
    Spring Core Container 组成
        org.spring amework.core
        org.springframework.beans 
        org. springframework.context 
        org.springframework.expression   spEL

    主要提供 Spring IoC 容器支持。其 org.springframework.expression 及其子包是 Spring 3.0增的，它提供了 
    Spring Expression Language 支持
#2、使用 Spring 管理 Bean
    Spring 容器就是一个bean工厂，所有的 Java 对象都交给 Spring容器管理一一这些 Java 对象被统称为 pring 容器中 Bean
    
    Spring 使用 XML 配置文件来管理容器中的 Bean

    Spring 框架解析该＜bean .. .／＞元素：
        String idStr = ... ;  解析＜bean ... 元素的 id 属性得到该字符串值为”person
        ／／解析＜bea口．．．／〉元素的 class 属性’ 生得 该字符串值为 org crazyit app service Person
        String classStr = 
        Class clazz = Class.forName (classStr); 
        Object obj = clazz . new!nstance (); 
        II container 代表 Spring 容器
        container.put(idStr , obj) ;
    Spring 框架解析＜property/> 
        1 元素的 name 属性决定调用哪个 setter 方法，
        2 并根据 valu ref 决定调用 setter 方法的传入参数
#3、依赖注入
    在A对象需要调用B对象方法的情形，这种情形被 Spring 称为依赖，即A对象依赖B对象
    依赖注入让 Spring的Bean以配置文件组织在 起，而不是以硬编码的方式祸合在一起。
        如果想要替换某个类，只需要修改配置文件即可。不用修改源码。解耦。
#4、使用spring容器
    Spring 有两个核心接口
        BeanFactory
        ApplicationContext 
            ApplicationContext 是BeanFactory子接口。它们都可代表 Spring 容器，Spring 容器是生成 Bean 实例的工厂
            
    Spring 容器也称为 Spring 上下文。
    applicationContext除了提供 BeanFactory 支持的全部功能外，还有如下额外的功能。
        ApplicationConte 默认会预初始化所有的 singleton bean ，也可通过配置取消预初始化。
        ~ ApplicationContext 继承 Message Source 接口，因此提供国际化支持。
        〉资源访比如访问 URL 和文件。
        》事件机制。
        〉同时加载多个配置文件。
        》以声明式方式启动并创建 Spring 容器。
    
#5。
    Spring 可以管理 singleton 作用域的 Bean 的生命周期， Spring 可以精确地知道该 Bean 何时被创建、
    何时被初始化完成、容器何时准备销毁该 Bean 实例。
    对于 prototype 作用域的 Bean, Spring 容器仅仅负责创建，当容器创建了 Bean 实例之后， Bean 完全交给客户端代码管理，容器不再跟踪其生命周期
    
        实例化 Instantiation
        属性赋值 Populate
        初始化 Initialization
        销毁 Destruction
