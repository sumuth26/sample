
	package com.wipro;

	public class Demoarray {
		public static void main(String[] args) {
			int a[]=new int[7];
			a[0]=1;
			a[1]=2;
			a[2]=3;
			a[4]=4;
			a[5]=5;
			a[6]=6;
			for(int i=0;i<a.length;i++) {
				System.out.println("Index of array is---"+i);
			}
			for(int i: a)
			{
				System.out.println(i);
			}
		}

	}



