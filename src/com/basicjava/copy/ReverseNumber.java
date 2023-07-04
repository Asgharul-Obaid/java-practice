package com.basicjava.copy;
import java.io.*;
public class ReverseNumber {
public static void main(String args[])throws IOException {
	int no;
	BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
	System.out.println("Enter number");
	no=Integer.parseInt(br.readLine());
	int reminder; int reverse=0;
	while(no!=0) {
		reminder = no%10;
		reverse=reverse*10+reminder;
		no=no/10;
	}
	System.out.print(reverse);
}
}
