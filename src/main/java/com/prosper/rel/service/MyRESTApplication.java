package com.prosper.rel.service;
import java.util.HashSet;
import java.util.Set;
import javax.ws.rs.core.Application;
 

public class MyRESTApplication  extends Application {
	
	private Set<Object> singletons = new HashSet<Object>();
	 
	public MyRESTApplication() {
		singletons.add(new ProsperRELService());
	}
 
	@Override
	public Set<Object> getSingletons() {
		return singletons;
	}

}
