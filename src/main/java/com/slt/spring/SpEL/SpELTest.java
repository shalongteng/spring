package com.slt.spring.SpEL;

import org.springframework.expression.Expression;
import org.springframework.expression.ExpressionParser;
import org.springframework.expression.spel.standard.SpelExpressionParser;
import org.springframework.expression.spel.support.StandardEvaluationContext;

import javax.sound.midi.Soundbank;

public class SpELTest {

    public static void main(String[] args) {

        //创建ExpressionParser解析表达式
        ExpressionParser  parser = new SpelExpressionParser();
        //表达式放置 todo 字符串需要单引号 ，字符串拼接需要 concat
        Expression exp = parser.parseExpression("'SpEL'.concat(' thinking')");
        Expression exp2 = parser.parseExpression("T(java.lang.Math).PI");
        //执行表达式，TODO 默认容器是spring本身的容器：ApplicationContext
        System.out.println(exp.getValue(String.class));
        System.out.println(exp2.getValue());



        /**如果使用其他的容器，则用下面的方法*/
        //创建一个虚拟的容器EvaluationContext
        StandardEvaluationContext ctx = new StandardEvaluationContext();
        String result2 = parser.parseExpression("#root").getValue(ctx, String.class);
        System.out.println("result2====" + result2);
        String s = new String("abcdef");
        //将字符串 放入容器
        ctx.setVariable("abc",s);
        //取id为abc的bean，然后调用其中的substring方法
        //getValue有参数ctx，从新的容器中根据SpEL表达式获取所需的值
        String value1 = parser.parseExpression("#abc.substring(0,1)").getValue(ctx, String.class);

        System.out.println(value1);
    }
}
