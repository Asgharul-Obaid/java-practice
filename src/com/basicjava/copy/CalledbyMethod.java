package com.basicjava.copy;

class Shabbu {
	int price;
	String color;
	
		void input(int p,String c) {
		    p=price;
			c="color";
		}
		void Display() {
			System.out.println(price+" "+color);
		}
}
		public class CalledbyMethod{
		public static void main(String[] args) {
			Shabbu s = new Shabbu();
			s.input(12,"Black");
			s.Display();
		}	
	
	}

