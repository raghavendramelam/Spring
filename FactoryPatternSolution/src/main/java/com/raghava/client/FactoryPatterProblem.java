package com.raghava.client;

import com.raghava.comps.AadharDetails;
import com.raghava.comps.Employee;
import com.raghava.comps.Person;
import com.raghava.comps.Student;

public class FactoryPatterProblem {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		AadharDetails ad = new AadharDetails(34572636363l,23,868896736); 
		
		Person per = new Employee("raja","Hyd",ad,"infosys",80000);
		
		System.out.println(per);
		 
		 System.out.println("====================================");
		 
		// AadharDetails details1= new AadharDetails(123198981L, 20,91949L);  //dependent class obj
		 AadharDetails ad1 = new AadharDetails(3234545l,24,6736484);
		 Person stud=new Student("ramesh", "vizag", ad1,"java",1122);
		 System.out.println(stud);
	}

}
