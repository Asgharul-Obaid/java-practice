package com.basicjava;

class Abcd {
private int empid;
public void setEmpid(int eid) {
	empid=eid;
}
public int getEmpid() {
	return empid;
}
}
public class EncapsulationProgram{
	public static void main(String arg[]) {
	    Abcd e=new Abcd();
		e.setEmpid(100);
		System.out.println(e.getEmpid());
	}
}
