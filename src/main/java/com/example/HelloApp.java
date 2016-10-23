package com.example;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import com.example.config.AnotherConfig;
import com.example.service.Greeting;

public class HelloApp {
	public static void main(String[] args) {
		AnnotationConfigApplicationContext context1 = new AnnotationConfigApplicationContext(AnotherConfig.class);
		Greeting obj3 = (Greeting)context1.getBean("greeting");
		System.out.println("obj3 ("+obj3+")");
		System.out.println(obj3.getMessage());
	}
}

//ApplicationContext context = new AnnotationConfigApplicationContext(HelloConfig.class);
//HelloWorld obj1 = (HelloWorld)context.getBean("helloWorld1");
//HelloWorld obj2 = (HelloWorld)context.getBean("someName");
//System.out.println(obj1.printHelloWorld("JavaConfig - using the default method name"));
//System.out.println(obj2.printHelloWorld("JavaConfig- Using the Bean Name @Bean(name='')"));

