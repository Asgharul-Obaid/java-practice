package com.basicjava;

class Age {
	int i = 10;
}

public class SuperKeywordsProgram extends Age {
	int i = 20;

	void show(int i) {
		System.out.println(this.i);
	}

	public static void main(String arg) {
		SuperKeywordsProgram obj = new SuperKeywordsProgram();
		obj.show(50);
	}
}