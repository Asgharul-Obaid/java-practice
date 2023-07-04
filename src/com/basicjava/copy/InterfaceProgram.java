package com.basicjava.copy;
    interface StateBank{
	abstract void saving();
	abstract void sallary();
	abstract void joint();
	abstract void current();
	abstract void branchDetails();
}
public class InterfaceProgram implements StateBank {
	
   public void saving() {
	   System.out.println("regular");
   }
   public void sallary() {
	   System.out.println("salary");
   }
   public void joint() {
	   System.out.println("joint");
   }
   public void current() {
	   System.out.println("current");
   }
   public void branchDetails() {
	   System.out.println("Baghnagar");     
   }
   public static void main(String args[]) {
	   InterfaceProgram info=new InterfaceProgram();
	   info.branchDetails();
	   info.joint();
	   info.sallary();
   }
}
