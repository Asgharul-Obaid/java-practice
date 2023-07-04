package com.basicjava;

public class practiceProgram {
    int id;
    String name;
    
    practiceProgram(int id,String name){
    	this.id=id;
    	this.name=name;
    }
    void Dispaly() {
    	System.out.println(this.id +" "+this.name);
    }
    public static void main(String[] args) {
		practiceProgram practiceProgram = new practiceProgram(12, "OK");
	    practiceProgram.Dispaly();
    }
}
