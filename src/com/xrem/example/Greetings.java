package com.xrem.example;

import java.util.ArrayList;

import javax.inject.Named;

import com.google.api.server.spi.config.Api;
import com.google.api.server.spi.config.ApiMethod;

@Api(name="greetings", version="1")
public class Greetings {
	public static ArrayList<Greeting> greetings = new ArrayList<Greeting>();
	static {
		greetings.add(new Greeting("Hello world!"));
	}
	
	public Greeting getGreeting(@Named("id") int id){
		return greetings.get(id);
	}
	
	@ApiMethod(name="greetings.insert")
	public Greeting insertGreeting(Greeting greeting){
		return greeting;
	}
}
