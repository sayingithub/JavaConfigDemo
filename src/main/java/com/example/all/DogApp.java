package com.example.all;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan
public class DogApp {
	public static void main(String[] args) {
		AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(DogApp.class);
		Dog d = (Dog)context.getBean("dog");
		System.out.println("DOGAPP OUTPUT ["+d.bark()+"]");
	}
}
