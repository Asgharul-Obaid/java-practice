package com.java8;

public class Test {
public static void main(String[] args) {
	
	Thread thread=new Thread(new Runnable() {
		
		@Override
		public void run() {
			System.out.println("main run");
			
		}
	});
	thread.start();
}
}
