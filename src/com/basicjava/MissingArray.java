package com.basicjava;

public class MissingArray {

	public static void main(String[] args) {
		int temp=0;
		
		
		//Array should not have duplicates
		//Array not need to be sorted order
		//value should be in rang
		
		int a[]= {1,2,3,4,5,8,9,10};
		
		//1+2+4+5=12 sum1
		//1+2+3+4+5=15 sum2
		//sum2-sum1=15 15-12=3 missing number
		
		int sum1=0;
		for (int i = 0; i < a.length; i++) {
			sum1=sum1+a[i];
		}
		System.out.println("sum of element in array:"+sum1);
		
		int sum2=0;
		for (int i = 1; i <=5; i++) {
			sum2=sum2+i;
		}
		System.out.println("sum of rang of element in array:"+sum2);
		
		
		temp=sum2-sum1;
		System.out.println(temp);
	}
	
	

}