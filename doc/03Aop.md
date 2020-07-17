#1、AOP概念（Aspect Oriented Programming）
        (1)Aspect(切面):通常是一个类，里面可以定义 切入点和 增强处理
        (2)JointPoint(连接点):程序执行过程中明确的点，一般是方法的调用.aspectj 还支持属性和构造器
        (3)Advice(增强处理):AOP在特定的切入点上执行的增强处理，有before,after,afterReturning,afterThrowing,around
        (4)Pointcut(切入点):就是带有增强处理的连接点，在程序中主要体现为书写切入点表达式
        (5)AOP代理：AOP框架创建的对象，代理就是目标对象的加强。
            Spring中的AOP代理可以使JDK动态代理，
            也可以是CGLIB代理，前者基于接口，后者基于子类
        (6)weave(织入)：将切面应用到目标对象并导致代理对象创建的过程
            
        增强处理方法:
        1、前置增强处理:在我们执行目标方法之前运行(@Before)
        2、后置增强处理:在我们目标方法运行结束之后 ,不管有没有异常(@After)
        3、返回增强处理:在我们的目标方法正常返回值后运行(@AfterReturning)
        4、异常增强处理:在我们的目标方法出现异常后运行(@AfterThrowing)
        5、环绕增强处理:需要手动执行joinPoint.procced()(其实就是执行我们的目标方法执行之前相当于前置增强处理,
            执行之后就相当于我们后置增强处理
    
#2、AOP实现方案
    静态代理
    动态代理
        jdk动态代理
        cglib动态代理
#3、springAOP
    编程式
    声明式
        手动代理
        自动代理
            扫描bean的名称
            扫描切面配置
            
#4、spring AspectJ
    基于注解 @Aspect
    基于配置 <aop:config>
    
#5、AOP使用场景：
    Authentication 权限
    Caching 缓存
    Context passing 内容传递
    Error handling 错误处理
    Lazy loading　懒加载
    Debugging　　调试
    logging, tracing, profiling and monitoring　记录跟踪　优化　校准
    Performance optimization　性能优化
    Persistence　　持久化
    Resource pooling　资源池
    Synchronization　同步
    Transactions 事务
   


https://www.jianshu.com/p/9e55174d4d27
https://developer.ibm.com/zh/articles/j-lo-springaopcglib/
