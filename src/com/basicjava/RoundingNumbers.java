package com.basicjava;
import java.io.*;
public class RoundingNumbers {
public static void main(String args[])throws IOException{
	double a;
	BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
	System.out.println("Enter number");
	a=Double.parseDouble(br.readLine());
	System.out.println(Math.round(a));
}
}
