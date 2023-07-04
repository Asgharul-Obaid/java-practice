package com.basicjava;
import java.io.*;
public class ExceptionDemo {
    public static void main(String args[])throws IOException
     {
         BufferedReader br =new BufferedReader(new InputStreamReader(System.in));
         System.out.println("Enter the two Number");
         int a=Integer.parseInt(br.readLine());
         int b=Integer.parseInt(br.readLine());
        	
        try
           {
            System.out.println("Division="+(a/b));        
           }
        catch(ArithmeticException e)
           {      
            e.printStackTrace();
            System.out.println("you can not devide by zero");
        }
    }
}
