package com.java8;


class A extends Exception{
	  A(String s){
		  super(s);
	  }
	  
  }

class Lamda2{
	
	public static void main(String[] args) {
		
		try {
			// throw object user 
			throw new A("ayaz");
			
		} catch (Exception e) {
			System.out.println("hello");	
			 System.out.println(e.getMessage());
			
			}
		}

}