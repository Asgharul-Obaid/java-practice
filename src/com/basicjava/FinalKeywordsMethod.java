package com.basicjava;
class FinalMethod{
	void show(int a) {
		System.out.println("Parents");
	}	
}

public class FinalKeywordsMethod extends FinalMethod{
    void show(int a){
	System.out.println("sub class");
}
	public static void main(String arg[]) {
		FinalKeywordsMethod fkm=new FinalKeywordsMethod();
	    fkm.show(100);
	}
}
