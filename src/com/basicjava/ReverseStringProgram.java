package com.basicjava;
import java.io.*;
public class ReverseStringProgram {
	public static void main(String arg[]) throws IOException {
	BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
    String n;
    String reverse="ok";
    System.out.println("Enter your message?");
    n=br.readLine();
    for(int i=n.length()-1; i>=0; i--) {
    	reverse=reverse+n.charAt(i);
    }
    if(n.equals(reverse))
    System.out.println(reverse);
}
}