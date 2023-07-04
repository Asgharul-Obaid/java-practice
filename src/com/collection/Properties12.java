package com.collection;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.util.Properties;



public class Properties12 {
	public static void main(String[] args) throws FileNotFoundException {
		
	
	Properties p=new Properties();
	p.put("id", "12445");
	p.put("pass", "sabbu@123");
	FileOutputStream file=new FileOutputStream(System.getProperty("user.dir")+""+"ayaz.properties");
        p.get(file);
	}
}
