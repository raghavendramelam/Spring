package com.raghava.comps;

public class AadharDetails {
	private long  Aadharno;
	private int age;
	private int mobileno;
	
	
	public AadharDetails(long aadharno, int age, int mobileno) {
		System.out.println("AadharDetails.AadharDetails()");
		this.Aadharno = aadharno;
		this.age = age;
		this.mobileno = mobileno;
	}


	@Override
	public String toString() {
		return "AadharDetails [Aadharno=" + Aadharno + ", age=" + age + ", mobileno=" + mobileno + "]";
	}
	
	

}
