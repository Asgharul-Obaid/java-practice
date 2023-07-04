package com.basicjava;

abstract class AB
{
	abstract void hi();
	abstract void hii();
	abstract void hiii();
	abstract void hiiii();
}
abstract class BC extends AB{
	abstract void get();
	
	void show() {
		hi();
		hii();
		hiii();
		hiiii();
		System.out.println("welcome");
		
	}
	@Override
	void hi() {
		// TODO Auto-generated method stub
		System.out.println("ok");
	}



	@Override
	void hii() {
		// TODO Auto-generated method stub
		System.out.println("no");
	}



	@Override
	void hiii() {
		// TODO Auto-generated method stub
		System.out.println("yes");
	}



	@Override
	void hiiii() {
		// TODO Auto-generated method stub
		System.out.println("okey");
	}
	
}
public class PracticeDemo extends BC {

	void get() {
		System.out.println("get");
		
	}

	

	public static void main(String[] args) {
		PracticeDemo p=new PracticeDemo ();
		p.show();
	}



	
}
