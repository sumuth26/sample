
	package com.wipro;

	import java.util.Scanner;

	public class Scan {
		public static void main(String[] args)
		{
			Scanner s = new Scanner(System.in);
			System.out.println("Enter your age");
			byte age = s.nextByte();
			System.out.println("Age is --"+age);
			System.out.println("Enter your id");
			int id = s.nextInt();
			System.out.println("Id is---"+id);
			System.out.println("Enter your name");
			String name = s.next();
			System.out.println("Name is---"+ name);
		}

	}



