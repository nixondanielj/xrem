package com.xrem.example;

import java.util.ArrayList;
import java.util.List;

import javax.inject.Named;

import com.google.api.server.spi.config.Api;
import com.google.api.server.spi.config.ApiMethod;

@Api(name="greetings", version="1")
public class Greetings {
	GreetingDAO data = new GreetingDAO();
	
	@ApiMethod(name="greetings.get")
	public Greeting getGreeting(@Named("id") int id){
		for(GreetingModel g : data.getGreetings()){
			if(g.id == id){
				return new Greeting(g);
			}
		}
		return null;
	}
	
	@ApiMethod(name="greetings.query")
	public List<Greeting> queryGreetings(){
		List<Greeting> results = new ArrayList<Greeting>();
		for(GreetingModel greeting : data.getGreetings()){
			results.add(new Greeting(greeting));
		}
		return results;
	}
	
	@ApiMethod(name="greetings.insert")
	public Greeting insertGreeting(Greeting greeting){
		return greeting;
	}
}
