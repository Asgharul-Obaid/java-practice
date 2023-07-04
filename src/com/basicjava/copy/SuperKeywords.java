package com.basicjava.copy;

public class SuperKeywords {
int i=10;
}
class SuperKeywords2 extends SuperKeywords{
	int i=20;
	void show(int i) {
		System.out.println(this.i);
	}
	public static void main(String args[]) {
		SuperKeywords2	sk=new SuperKeywords2();
		sk.show(30);
	}
}