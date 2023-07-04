package com.basicjava.copy;
import java.util.Arrays;
import java.util.List;

public class ContainsMethod {
public static void main(String args[]) {
	String userName="Obaid";
	
	List<String>names=Arrays.asList("Obaid");
	if(names.contains(userName)) {
		System.out.println("user name available");
	}
	else {
		System.out.println("username is not available");
	}
}
}
