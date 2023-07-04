package com.basicjava;
 interface AxisBank {
	void test();
}
 interface HDFC{
	 void dispaly();
 }
public class InterfaceProgramExample implements AxisBank,HDFC {
	
public void test() {
	System.out.println("i am from AxisBank");
	}

@Override
public void dispaly() {
	System.out.println("i am in hdfc bank");
	
}
public static void main(String args[]) {
	InterfaceProgramExample info=new InterfaceProgramExample();
	info.test();
	info.dispaly();
}
	
}
