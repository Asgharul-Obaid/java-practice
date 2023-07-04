package com.collection;

import java.util.HashMap;

//given an integer array of size n,find all elements that appear more than [n/3]times?
public class MejorityElement {
	public static void mejorityElement(int nums[]) {
		HashMap<Integer, Integer> map=new HashMap<>();
		int n=nums.length;
		for(int i=0;i<n;i++) {
			if(map.containsKey(nums[i])) {
				map.put(nums[i], map.get(nums[i]) +1);
				
			}else {
				map.put(nums[i], 1);
			}
		}
		for(int key : map.keySet()) {
			if(map.get(key) > n/3) {
				System.out.println(key);
			}
		}
	}
	
	
public static void main(String[] args) {
	int nums[]= {1,3,2,5,4,7,1,1,6,1};
	mejorityElement(nums);
}
}
