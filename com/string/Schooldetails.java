package com.string;

public class Schooldetails extends Studentdetails {
	@Override
public void studentName() {
	System.out.println("Student Name-Muthu");
}
public void schoolStaff() {
	System.out.println("staff details");
}
public void schoolworkers() {
	System.out.println("workers");
}
public static void main(String[] args) {
	Schooldetails s =new Schooldetails();
	s.studentName();
	s.schoolStaff();
	s.schoolworkers();
	
}
}
