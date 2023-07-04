package com.basicjava;

class Salman {
	int roll;
	String name;
	String city;

	Salman(int roll, String name, String city) {
		this.roll = roll;
		this.name = name;
		this.city = city;
	}

	public String toString() {
		return roll + " " + name + " " + city;
	}

}

public class ToStringFunction {
	public static void main(String arg[]) {
		Salman s1 = new Salman(101, "Obaid", "Basti");
		Salman s2 = new Salman(102, "Hareem", "Basti");
		System.out.println(s1);
		System.out.println(s2);
	}
}
