package com.basicjava.copy;

public class DuplicateElementinArray {

	public static void main(String[] args) {
		
		String arr[]= {"java","c","c","c++","Python","java"};

		
		for (int i = 0; i < arr.length; i++) {
			
			for (int j = i+1; j < arr.length; j++) {
				
				if (arr[i]==arr[j]) {
					
					System.out.println("Found Duplicate Element:"+arr[i]);
				}
			}
		}
	}

}