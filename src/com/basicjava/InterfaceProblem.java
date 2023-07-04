package com.basicjava;

interface Obaid{
	 void home();
	 void village();
	 void city();
	
}
public class InterfaceProblem implements Obaid{

	@Override
	public void home() {
		System.out.println("101");
		
	}
class xyz extends InterfaceProblem{
	
}
	public static void main(String[] args) {
		Obaid obaid=new InterfaceProblem();
		obaid.village();
		obaid.city();
	}
	@Override
	public void village() {
		System.out.println("Bhatpara");
		
	}
	@Override
	public void city() {
		System.out.println("Sant kabir nagar");
		
	}
}
