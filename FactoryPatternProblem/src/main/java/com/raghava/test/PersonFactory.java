package com.raghava.test;

import com.raghava.comps.AadharDetails;
import com.raghava.comps.Employee;
import com.raghava.comps.Person;

public class PersonFactory {
	
	public static Person  getInstance(String type) {
		Person per =null;
		AadharDetails ad= null;
		
		if(type.equalsIgnoreCase("emp")) {
		
			ad = new AadharDetails(34537474983l,78,882726);
			
			per = new Employee("raja","hyd",ad,"Hcl",89087);
			
		}else {
			throw new IllegalArgumentException("Invalid ");
		}
		
		return per;
	}

}
