#1、SpEL（Spring Expression Language）  https://www.jianshu.com/p/e0b50053b5d3
        Spring表达式语言，是比JSP的EL更强大的一种表达式语言。它可以在运行时查询和操作数据，
    尤其是数组列表型数据，因此可以缩减代码量，优化代码结构。个人认为很有用。
    
#2、SpEL三种用法
    一种是在注解@Value中
        //@Value能修饰成员变量和方法形参
        //#{}内就是表达式的内容
        @Value("#{表达式}")
        public String arg;
    一种是XML配置；
        <bean id="xxx" class="com.java.XXXXX.xx">
            <!-- 同@Value,#{}内是表达式的值，可放在property或constructor-arg内 -->
            <property name="arg" value="#{表达式}">
        </bean>
    最后一种是在代码块中使用Expression。
        
