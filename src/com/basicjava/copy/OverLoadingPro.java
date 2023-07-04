package com.basicjava.copy;

public class OverLoadingPro {
public static void main(String[] args) {
	OverLoadingPro o=new OverLoadingPro();
	o.main(10);
	o.main("Obaid");
	System.out.println("i am in main mathod");
}
public static void main(int a) {
	System.out.println("i am in sub int main method");
}
 static public void main(String a) {
	System.out.println("i am in String main method");
}
}
