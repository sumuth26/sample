package com.string;

public class Sample implements Emp {

	@Override
	public void id() {
		
		System.out.println("id is 12345");
	}

	@Override
	public void name() {
		
		System.out.println("name is guna");
	}
	public static void main(String[] args) {
		Sample s= new Sample();
		s.id();
		s.name();
	}
	

}
