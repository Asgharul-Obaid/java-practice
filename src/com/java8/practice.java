package com.java8;

public class practice {
	public static void main(String[] args) {
		try {
			
				throw new Exception("custome exception");
			
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
	}

}
