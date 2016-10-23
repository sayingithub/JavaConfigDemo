package com.example.service;

import org.springframework.stereotype.Component;

@Component
public class Greeting {
   public Greeting(){
	   System.out.println("In Greeting Constructor");
   }
   
   public String getMessage(){
	   return "Hello Greeting Message";
   }
}
