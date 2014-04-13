package com.xrem.example;

import com.googlecode.objectify.annotation.Entity;
import com.googlecode.objectify.annotation.Id;

@Entity
public class GreetingModel {
	@Id long id;
	String message;
	
	public GreetingModel(Greeting greeting){
		this.message = greeting.message;
	}
}
