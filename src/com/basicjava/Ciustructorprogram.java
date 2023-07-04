package com.basicjava;
class Employe{
	String name;
	int emp_id;
	
	Employe(String name,int emp_id){
		this.name=name;
		this.emp_id=emp_id;
	}
}
public class Ciustructorprogram {
public static void main(String arg[]) {
	Employe e=new Employe("Rehan",20);
	Employe e1=new Employe("hareem",1);
	Employe e2=new Employe("Izhar",23);
	System.out.println("Employe:" +  e.name +" " + e.emp_id );
	System.out.println("Employe :" + e1.name+" "+e1.emp_id);
	System.out.println("e2 :"+ e2.emp_id + " " + e2.name);
}
}


