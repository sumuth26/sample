
	package com.test;

	public class Client {
		public void clientId() {
			System.out.println("Client Id is 12345");
		}
		public void clientName() {
			System.out.println("Client name is Wipro");

		}
		public static void main(String[] args) {
			Client c = new Client();
			c.clientId();
			c.clientName();
			//Sample sam = new Sample();
			Sample.sampleId();//classname.methodname() to access static method
			
		}

	}


