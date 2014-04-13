package com.xrem.core;

import com.googlecode.objectify.Objectify;
import com.googlecode.objectify.ObjectifyFactory;
import com.googlecode.objectify.ObjectifyService;
import com.xrem.example.GreetingModel;

public class DefaultOfyService {
	static{
		factory().register(GreetingModel.class);
	}
	public static Objectify ofy(){
		return ObjectifyService.ofy();
	}
	
	public static ObjectifyFactory factory(){
		return ObjectifyService.factory();
	}
}
