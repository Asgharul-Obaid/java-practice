package com.basicjava;

import org.apache.commons.compress.harmony.unpack200.bytecode.forms.ThisFieldRefForm;

public class useOfThiskeyword {
 int id;
 String name;
 
 public useOfThiskeyword(int id,String name) {
	this.id=id;
	this.name=name;
	
 }
 void show() {
	 System.out.println(id+"....."+name);
 }
 public static void main(String[] args) {
	useOfThiskeyword s=new useOfThiskeyword(101,"Shoyeb");
	s.show();
 }
}
