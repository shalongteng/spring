package com.slt.spring.SpEL;

import org.junit.Before;
import org.junit.Test;
import org.springframework.expression.Expression;
import org.springframework.expression.ExpressionParser;
import org.springframework.expression.spel.standard.SpelExpressionParser;
import org.springframework.expression.spel.support.StandardEvaluationContext;

import static org.junit.Assert.assertThat;

public class HelloWorldTest {
	ExpressionParser parser;

	@Before
	public void setup() {
		//初始化创建SpEL表达式解析器
		parser = new SpelExpressionParser();
	}
	/**
	　* @Description: todo 在SpEL表达式中，默认情况下，表达式前缀为 ' # ' ，而后缀为 ' } '   在xml中是这样
	　* @Description: 如果表达式中没有前缀和后缀，那么表达式字符串就被当作纯文本。
	　* @author shalongteng
	　* @date 2020/7/10 15:11
	　*/
	@Test
	public void test() {
		//使用解析器解析出表达式exp
		Expression exp = parser.parseExpression("'Hello World'");
		//在表达式中获取指定类型的值
		String value = exp.getValue(String.class);
		System.out.println(value);
	}
	/**
	　* @Description: 使用SpEL调用静态方法
	　* @author shalongteng
	　* @date 2020/7/10 15:16
	　*/
	@Test
	public void testStatic() {
		//使用解析器解析出表达式exp
		Expression exp = parser.parseExpression("T(java.lang.Math).abs(-1)");
		//在表达式中获取指定类型的值
		System.out.println(exp.getValue());
	}
	/**
	　* @Description: 使用SpEL表达式调用变量和函数
	　* @author shalongteng
	　* @date 2020/7/10 15:18
	　*/
	@Test
	public void testFunction() {
		ExpressionParser parser = new SpelExpressionParser();
		StandardEvaluationContext context = new StandardEvaluationContext();
		context.setVariable("message", "Hello World");
		//从容器中 取值  id 为message
		String value = parser.parseExpression("#message").getValue(context, String.class);
		System.out.println(value);

	}

	/**
	　* @Description: #root表达式的使用 SpEL 中访问 root 对象的 性时，可以省略root对象前缀， 例如如下代码：
	　* @author shalongteng
	　* @date 2020/7/10 15:22
	　*/
	@Test
	public void testRoot() {
		ExpressionParser parser = new SpelExpressionParser();
		StandardEvaluationContext context = new StandardEvaluationContext();
		context.setRootObject("new Var()");
		System.out.println(parser.parseExpression("#root").getValue(context));
	}

	@Test
	public void testSystem() {
		ExpressionParser parser = new SpelExpressionParser();
		StandardEvaluationContext context = new StandardEvaluationContext();
		System.out.println(parser.parseExpression("@systemProperties['java.version']").getValue(context));
	}
	/**
	　* @Description: 正则表达式运算符matches
	　* @author shalongteng
	　* @date 2020/7/10 15:26
	　*/
	@Test
	public void testMatchs(){
		ExpressionParser parser =new SpelExpressionParser();

		System.out.println(parser.parseExpression("35 matches '[0-9]+'").getValue(Boolean.class));
	}

}
