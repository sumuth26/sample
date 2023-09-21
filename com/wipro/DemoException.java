package com.wipro;

public class DemoException {
	public static void main(String[] args) {
		System.out.println(0);
		System.out.println(1);
		System.out.println(2);
		try {
			System.out.println(3/0);
		}catch(Exception e) {
			System.out.println("Exception handled");
		}finally {
			System.out.println("Success");
		}
		System.out.println(4);
}
}
