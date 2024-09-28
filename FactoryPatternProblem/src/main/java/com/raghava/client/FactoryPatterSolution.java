package com.raghava.client;

import com.raghava.comps.Person;
import com.raghava.test.PersonFactory;

public class FactoryPatterSolution {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
	Person per =	PersonFactory.getInstance("emp");
	System.out.println(per);
			}

}
