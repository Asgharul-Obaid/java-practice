package com.basicjava.copy;
class Enc{
	private int a;
	
	public int getA() {
		return a;
	}
		public void setA(int v) {
			a=v;
		}
}
public class EncapsulationWithoutThis {
public static void main(String[] args) {
	Enc k=new Enc();
	k.setA(10);
	System.out.println(k.getA());
}
}
