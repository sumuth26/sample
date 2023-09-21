package com.wipro;

	public class Bye implements AbstractDemo1 {
	public void bye() {
		System.out.println("bye");
	}
	@Override
	public void hi() {
		System.out.println("Abstract");
	}
	@Override
		public void getTitle() {
			System.out.println("My url");
			
		}
	@Override
		public void get() {
			System.out.println("Lanuch the browser");
			
		}
	@Override
	public void manage() {
		// TODO Auto-generated method stub
		
	}
	@Override
	public void getCurrentUrl() {
		// TODO Auto-generated method stub
		
	}
	@Override
	public void quit() {
		// TODO Auto-generated method stub
		
	}
	@Override
	public void close() {
		// TODO Auto-generated method stub
		
	}
	public static void main(String[] args) 
	{
		Bye b = new Bye();
		b.bye();
		b.hi();
		b.getTitle();
		b.get();
	}
	}



