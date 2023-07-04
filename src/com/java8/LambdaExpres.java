package com.java8;
interface ABC{
	int add(int a,int b);
}
public class LambdaExpres {
public static void main(String[] args) {
	ABC abc=(a,b)->(a+b);
	System.out.println(abc.add(10, 12));
	

}
}