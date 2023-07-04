package com.collection;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class Hashset {
public static void main(String[] args) {
	HashSet<Integer> set = new HashSet<>();
    set.add(1);
    set.add(2);
    set.add(3);
    set.add(1); 
    //size
    System.out.println("size of set is :"+ set.size());
    
    
    //search contains
//    if(set.contains(1)) {
//    	System.out.println("set contains 1");
//    }
//    if (!set.contains(6)) {
//    	System.out.println("does not contains");	
//	}
//    //delete
//    set.remove(1);
//    if(!set.remove(1)) {
//    	System.out.println("does not contain 1 - we deleted 1");
//    }
    
    //Itereator
    Iterator itr=set.iterator();
    while (itr.hasNext()){
    System.out.println(itr.next());
    
   }  
}
}
