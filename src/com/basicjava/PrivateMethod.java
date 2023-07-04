package com.basicjava;

public interface PrivateMethod {
	 private static void no() {
		 System.out.println("no");
	 }
	 public static void main(String[] args) {
		PrivateMethod.no();

	 }
}
