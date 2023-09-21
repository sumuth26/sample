package com.test;

public class Employee1 extends Sample{
	private void employeeid() {

System.out.println("Employee id is 2345");
	}
	public static void main(String[] args) {
		Employee1 e = new Employee1();
		e.employeeid();
		//normal method
		//no need to create object for staic method
		//Sample s = new Sample();
		sampleId();
	}
}



