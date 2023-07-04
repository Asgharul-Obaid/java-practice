package com.basicjava;
public class TryCatchProgram
{
 public static void main(String args[]) 
{
try
{
int a=Integer.parseInt(args[0]);
int b=Integer.parseInt(args[1]);
System.out.println("Division="+(a/b));
}
catch(Exception e)
{
System.out.println("Error in program"+" " +e);
}
}
}
