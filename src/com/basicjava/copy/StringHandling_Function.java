package com.basicjava.copy;

//import java.io.*;
public class StringHandling_Function {
    public static void main(String arg[])//throws IOException
    {
      /*BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Enter Your Message?");
        String n;
        n=br.readLine();
        System.out.println("Your name is:-"+n);
        System.out.println("Name in Uppercase:-"+n.toUpperCase());
        System.out.println("Length of given strip="+n.length());
        String a="Hareem";
        String b="Shabbu";
       System.out.println("Compare Function"+a.compareTo(b));
       
       System.out.println("Compare Function"+a.compareToIgnoreCase(b));
       
       System.out.println("Concate Function="+n.concat(" Welcome to java prog..."));
       
       System.out.println("End with Function="+n.endsWith("Ey")); 
       
       System.out.println(a+(200-100));  -   
        System.out.println(n.charAt(1));
        
        //String Return Method
    	String s1="Obaid";
    	String s2="hareem";
    	String s3="Iqra";
    	String StringjoinReturn=String.join("/",s1,s2,s3);
    	System.out.println(StringjoinReturn); 
    	//Contains Method Examkple */
    	/*
    	String s1="tauqir";
    	String s2="ashraf";
    	System.out.println(s1+" / "+s2);
    	System.out.println(String.join("/", s1,s2)); 
    	
    	String s1="this is demo";
    	System.out.println(s1.subSequence(1, 9));
    	System.out.println(s1.substring(3, 11));
    	System.out.println(s1.substring(3));  
    	//empty method
    	String name="abc";
    	int i=name.length();
    	if(i==0) {
    		System.out.println("Name is empty");
    	}else {
    		System.out.println("valid name");}
    	
    	
    	String name="Obaid";
    	if(name.isEmpty()) {
    		System.out.println("name is empty");
    	}else {
    		System.out.println("valid name");
    	}*/
    	/*Trim method
    	String name="    Obaid ";
    	System.out.println(name);
    	System.out.println(name.trim());    */
    	/* String name="     ";
    	if(name.trim().length()==0) {
    		System.out.println("name is empty");
    	}else {
    		System.out.println("valid name");
    	}
    	
    	//string buffer
    	StringBuffer sb=new StringBuffer();
    	System.out.println(sb.capacity());
    	sb.append("hello");
    	System.out.println(sb.capacity());
    	sb.append("Obaid   java");
    	sb.append(1);
    	System.out.println(sb.capacity());    
    	//delete
    	StringBuffer sb=new StringBuffer("obaid java");
    	System.out.println(sb.delete(2, 6));
    	System.out.println(sb.deleteCharAt(2));
    	//equal method
    	StringBuffer sb1=new StringBuffer("Obaid java");
    	StringBuffer sb2=new StringBuffer("Obaid java");
    	System.out.println(sb1.equals(sb2)); */
    	/*StringBuffer sb1=new StringBuffer("Obaid java");
    	StringBuffer sb2=sb1.append("hi");
    	System.out.println(sb1.equals(sb2));*/
    	
    //index of value
    	StringBuffer sb1=new StringBuffer("Obaid java");
    	System.out.println(sb1.indexOf("j"));
    	//insert method, replace method and reverse method
    	StringBuffer sb=new StringBuffer("Obaid java");
    	System.out.println(sb.insert(3, "kkk"));
    	System.out.println(sb.replace(2, 6, "zzzz"));
    	System.out.println(sb.reverse());
    	System.out.println(sb.subSequence(3, 9));  
    	/*
    	StringBuffer sb=new StringBuffer("hareem");
    	System.out.println(sb.capacity());
    	sb.ensureCapacity(100);
    	System.out.println(sb.capacity());   */
   //seCharAt methos
    	/*StringBuffer sb=new StringBuffer("obaid");
        sb.setCharAt(2, 'k');
    	//sb.setLength(3);
    	System.out.println(sb);  
    	StringBuffer sb=new StringBuffer();
    	sb.ensureCapacity(100);
    	sb.append("hello");
    	sb.trimToSize();
    	System.out.println(sb.capacity());*/
    	
    	//string plit method
    /*	String name="Asgharul  # Obaid # Shabbu";
    	String value=name.split("#")[2];
    	System.out.println(value);
    	String[] split=name.split("#");
    	System.out.println(split[2]);
    	for(String itr : split) {
    		System.out.println(itr.trim());
    	} 
    	*/
    	/*String name="java session now started";
    	if(name.startsWith("ja")) {
    		ifBlock(name);
    	}
    	else {
    	elseBlock(name);
    		
    	}
    }
	private static void elseBlock(String name) {
		int length=name.length();
		System.out.println("else block method called"+ length);	
	}

	private static void ifBlock(String name) {
		String[]split=name.split("\\s");
		System.out.println("if block called");
		for(String itr : split) {
			System.out.println(itr);
		}*/
	}
}
  