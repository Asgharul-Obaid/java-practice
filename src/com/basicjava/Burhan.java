package com.basicjava;

class Arhan{
	void showA()
	{
		System.out.println("i am iliyas");
		
	}
}
public class Burhan extends Arhan
{
	void showB()
	{
		//super.showB();
		System.out.println("khan");	
		}
	public static void main(String[]args)
	{
		Burhan obj1=new Burhan();
		obj1.showB();
		Arhan obj2=new Arhan();
		obj2.showA();
		
	}
	}

