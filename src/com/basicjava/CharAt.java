package com.basicjava;

public class CharAt {  
    public static void main(String[] args) {  
    String s = "Welcome to mumbai";      
    int strLength = s.length();      
  
    System.out.println("Character at 0 index is: "+ s.charAt(0));      
    //The last Character is present at the string length-1 index  
    System.out.println("Character at last index is: "+ s.charAt(strLength-1));      
    }  
}  