package com.exercise.bll;

public class TestEmployee {

	public static void main(String[] args) {
		
      SalaryEmployee salariedEmployee =new SalaryEmployee("Rahul", "Developer",20000);
		
		HourlyEmployee hourlyEmployee=new HourlyEmployee("Sunny","Data",500,24);
		
		System.out.println(salariedEmployee);
		System.out.println(hourlyEmployee);
	}

	

}
