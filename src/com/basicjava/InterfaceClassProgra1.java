package com.basicjava; 
interface String{
	void show();
}
interface StringBuffer{
	void buffer();
}
public class InterfaceClassProgra1 implements String,StringBuffer{
	
	
	@Override
	public void buffer() {
		System.out.println("buffer");
		
	}

	@Override
	public void show() {
		System.out.println("show");
		
	}
	public static void main(String[] args) {
		
	
	  InterfaceClassProgra1 a=new InterfaceClassProgra1();
	    a.buffer();
	    a.show();
	    System.exit(0);
  }
}