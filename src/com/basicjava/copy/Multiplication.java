package com.basicjava.copy;
import java.io.*;

public class Multiplication {
public static void main(String[] args) throws IOException{
	int a,b,obaid=0;
	BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
	System.out.println("Enter two number");
	a=Integer.parseInt(br.readLine());
	b=Integer.parseInt(br.readLine());
	for(int i=1;i<=b;i++) {
		obaid+=a;
	}
	System.out.println("the multiplication of two number :"+ obaid);
 }
}
