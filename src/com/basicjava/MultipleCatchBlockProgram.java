package com.basicjava;

//Multiple catch block
import java.io.*;
class MultipleCatchBlockProgram
{
public static void main(String arg[])
{
try
{
int a=Integer.parseInt(arg[0]);
int b=Integer.parseInt(arg[1]);
System.out.println("Division="+a/b);
}
catch(ArithmeticException e)
{
System.out.println("Error in program because number is divided by 0");
}
catch(ArrayIndexOutOfBoundsException e)
{
System.out.println("Error in progam because we are not passing argument");
}
}
}