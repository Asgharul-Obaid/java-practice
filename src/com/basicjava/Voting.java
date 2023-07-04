package com.basicjava;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
class YoungerAgeException extends RuntimeException{
	YoungerAgeException(String msg){
		super(msg);
	}
}
public class Voting {
	public static void main(String arg[]) throws IOException {
    BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
    System.out.println("Enter your age :");
    int age=Integer.parseInt(br.readLine());
    try {
    	if(age<18) {
    		throw new YoungerAgeException("u r not aligible for vote");
    	}
    	else {
    		System.out.println("u can vote succesfully");
    	}
   }
         catch(YoungerAgeException e) {
	       e.printStackTrace();
}
    System.out.println("hello");
}
}
