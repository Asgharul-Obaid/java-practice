package com.java8;

interface Fly {
	void display();
}

public class LembdaExpression {

	public static void main(String[] args) {
		Fly fly = () -> System.out.println("flying");
		fly.display();
	}
}
