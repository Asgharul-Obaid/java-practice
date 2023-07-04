package com.collection;

import java.util.LinkedList;

public class LinkedListProgram {
	   public static void main(String args[]) {
	      LinkedList<String> list = new LinkedList<String>();
	 
	      list.addFirst("Obaid");
	      list.addFirst("name");
	      list.addFirst("my");
	      System.out.println(list);
	     
	      list.add(2, "is");
	      System.out.println(list);
	   }
	}

