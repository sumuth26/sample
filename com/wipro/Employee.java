
	package com.wipro;
	import com.test.*;
	//Inheritance --reduce memory wastage reduce object creation achieved using extend keyword
	public class Employee extends Client{
	private void employeeId() {
		
	System.out.println("Employee Id is 333");
	}
	private void employeeName() {
		
		System.out.println("Employee Name is Arjun");
	}
	public static void main(String[] args) {
		Employee e = new Employee();
		e.employeeId();
		e.employeeName();
		e.clientId();
		e.clientName();
		//Client cli = new Client();
		//cli.clientId();
		//cli.clientName();
		//ctrl+shift+s-to save all class
	}
	}


