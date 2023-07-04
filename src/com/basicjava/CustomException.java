package com.basicjava;
import java.io.*;
class ExceptionProgram extends Exception {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	ExceptionProgram(java.lang.String string) {
		super(string);
	}
}
public class CustomException {
	public static void main(String args[]) throws IOException, ExceptionProgram {
		final Integer PIN_NUMBER = 7860;
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		System.out.println("enter number");
		Integer pin = Integer.valueOf(br.readLine());
		if (pin.equals(PIN_NUMBER)) {
			System.out.println("please take cash from bank");
		} else {
			throw new ExceptionProgram("wrong pin");
		}
		System.out.println("thank you!");
	}
}
