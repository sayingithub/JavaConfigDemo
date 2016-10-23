package com.example.all;

import org.springframework.stereotype.Component;

@Component
public class Dog {

	public Dog(){
		System.out.println("In DOG's constructor");
	}
	
	public String bark(){
		System.out.println("Woof woof....");
		return "Woof Woof...";
	}
}
