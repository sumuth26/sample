package com.string;

public class ArrayDemo {
	public static void main(String [] args) {
	int arr[]=new int[] {1,2,3,4,5}; 
	int arr2[]=new int[arr.length];
	int rev[]=new int[arr2.length];
	System.out.println("Original Array:");
	for(int i=0;i<arr.length;i++) {
		System.out.println(arr[i]+" ");
	}
	System.out.println("Duplicate Array:");
	for(int i=0;i<arr.length;i++) {
		arr2[i]=arr[i];
		System.out.println(arr2[i]+" ");
	}
	System.out.println("Reversing of duplicate Array:");
	for(int i=arr2.length-1;i>=0;i--) {
		rev[i]=arr2[i];
		System.out.println(rev[i]+" ");
	}
	System.out.println("copying of reversing Array into original array:");
	for(int i=0;i<rev.length;i++) {
		arr[i]=rev[i];
		System.out.println(arr[i]+" ");
	}
	
}
}
