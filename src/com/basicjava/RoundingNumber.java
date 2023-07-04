package com.basicjava;
import java.io.*;
public class RoundingNumber {
public static void main(String arg[])throws IOException{
	
	BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
	System.out.println("Enter number");
	double a=Double.parseDouble(br.readLine());
	double mult = a * 100.50;
	double add = mult + 0.5;
	int results = (int) add;
	double result = results / 100;
	System.out.println("the output of given number------>"+result);	
}
}