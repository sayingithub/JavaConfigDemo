package com.example.config;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

import com.example.service.Greeting;

@Configuration
@ComponentScan("com.example.service")
public class AnotherConfig {
	

	//@Bean
	public Greeting getGreet(Greeting greeting){
		return greeting;
	}
}	
