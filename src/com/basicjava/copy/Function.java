package com.basicjava.copy;
import java.io.*;
public class Function {
	public static void printMyName(String name) {
		System.out.println(name);
		//return;
	}
public static void main(String args[]) throws IOException {
	BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
	String name=br.readLine();
	printMyName(name);
}
}
