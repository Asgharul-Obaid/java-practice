package com.java8;

interface Flying{
	int add(int a,int b);
}
public class lambdaPro {
public static void main(String[] args) {
	Flying f=(a,b)->{
		return a+b;
	};
	System.out.println(f.add(1, 10));
}
}
