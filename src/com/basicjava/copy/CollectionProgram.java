package com.basicjava.copy;
import java.util.*;
public class CollectionProgram {
	public static void main(String args[]) {
		
		ArrayList a1=new ArrayList<>();
		a1.add("abc");
		a1.add("abc1");
		a1.add("abc2");
		//for(String xyz:a1) {
			//System.out.println(xyz);
		
		String s1=(String)a1.get(0);
		String p=(String)a1.get(1);
		String l1=(String)a1.get(2);
		System.out.println(s1+" "+p+" "+l1);
		}
	}

//}
