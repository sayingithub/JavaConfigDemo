package com.example.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import com.example.service.HelloWorld;
import com.example.service.HelloWorldImpl;

@Configuration
public class HelloConfig {
	
	@Bean(name="someName")
	public HelloWorld helloWorld1(){
		return new HelloWorldImpl();
	}
	
	
	

}
