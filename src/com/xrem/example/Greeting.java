package com.xrem.example;

public class Greeting {
	public String message;
	public String getMessage() {
		return message;
	}
	public void setMessage(String message) {
		this.message = message;
	}
	public Greeting(String message){
		this.message = message;
	}
	public Greeting(){}
	public Greeting(GreetingModel g) {
		this.message = g.message;
	}
	
}
