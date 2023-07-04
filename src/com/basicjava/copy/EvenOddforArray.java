package com.basicjava.copy;

public class EvenOddforArray {

	public static void main(String[] args) {
		int arr[]= {1,2,3,4,5,6,7,9,22};
		
		System.out.println("even numbers in array....");
		//for (int i = 0; i < arr.length; i++)
		/*
		 * for(int k:arr) { if (arr[k]%2==0) System.out.println(arr[k]); }
		 * System.out.println("Odd numbers in array..");
		 */
			for (int j = 0; j < arr.length; j++) 
			//for(int n:arr)
			{
				if (arr[j]%2!=0) 
					System.out.println(arr[j]);
				}
			}
		}
