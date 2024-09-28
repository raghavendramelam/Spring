package com.raghava.factory;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
import java.util.Properties;

import com.raghava.comps.EngineModelAssembler;
import com.raghava.comps.Vehicle;

public class FactoryforStratergy {
	
	
	private static Properties props;
	static {
	
	try {
		
		InputStream ir = new  FileInputStream("src/main/java/com/raghava/commons/Info.Properties");
		
		props = new Properties();
		
		props.load(ir);
		
	} catch (IOException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
	
	}
	
	
	public static  Vehicle enginetype() {
		
  Vehicle vehicle =null;
		
		String veh =props.getProperty("key");
		
		try {
			Class<?> c = Class.forName(veh);
			
	//	Object o =	c.newInstance();  
			/* Here  c.newInstance() is deprecated method from java 9 onwards so we are using another way to crate instance  */
		
	Constructor<?> [] c1 = 		c.getDeclaredConstructors();
	
	 Object o =c1[0].newInstance();
		 vehicle = (Vehicle)o;
		
		} catch (ClassNotFoundException | InstantiationException | IllegalAccessException | IllegalArgumentException | InvocationTargetException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		EngineModelAssembler eg = new EngineModelAssembler();
		
		eg.EngineAssemble(vehicle);
		return vehicle;
		

	}

}
