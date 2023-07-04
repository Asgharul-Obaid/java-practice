package com.java8;
interface Main2{
	int sum(int a,int b);
}
public class Addition {
public static void main(String[] args) {
	Main2 main2=(a,b)->{
		return a+b;
	};
	System.out.println(main2.sum(10, 12));
}
}
