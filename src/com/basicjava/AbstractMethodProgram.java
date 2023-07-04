package com.basicjava;
abstract class Bank{
	abstract void saving();
	abstract void current();
	abstract void salary();
	abstract void joint();
	public void branchDetails() {
		System.out.println("Basti");
	}
}
public class AbstractMethodProgram extends Bank{
    public void saving() {
	    System.out.println("regular");
}
	public void current() {
		System.out.println("current");
	}
	public void salary() {
		System.out.println("salary");
	}
	public void joint() {
		System.out.println("joint");
	}
    public  static void main(String arg[]) {
    	AbstractMethodProgram info=new AbstractMethodProgram();
    	info.branchDetails();
    	info.salary();
    	info.saving();
    }
}
