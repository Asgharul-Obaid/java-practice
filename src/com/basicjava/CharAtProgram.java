package com.basicjava;

    public class CharAtProgram {
	public static void main(String arg[]) {
    String name ="Shabbu";
    for(int i=0;i<=name.length()-1;i++) {
	if(i%2!=0) {
		System.out.println("char at "+i+" place"+name.charAt(i));	
	}
}
}
}