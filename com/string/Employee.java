package com.string;

public class Employee extends Salary{
 private void empId() {
	 System.out.println("Employee Id is 12345");
 }
 public static void main(String[] args) {
	 Employee e = new Employee();
	 e.empId();
	 Salary s = new Salary();
	 s.salaryDetails();
	 s.salaryAccount();
	 Empdetail e1=new Empdetail();
	 e1.empAge();
	 e1.empAddress();
    }
}

