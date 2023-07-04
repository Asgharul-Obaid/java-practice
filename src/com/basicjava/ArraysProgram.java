package com.basicjava;

public class ArraysProgram {
	public static void main(String[] args) {
		int arr[] = { 5, 4, 3, 6, 1 };
		for (int i = 0; i < arr.length; i++) {
			for (int j = 0; j < arr.length - 1 - i; j++) {
				if (arr[j] > arr[j + 1]) {
					int ok = arr[j];
					arr[j] = arr[j + 1];
					arr[j + 1] = ok;
				}
			}

		}
		for (int i = 0; i < arr.length; i++) {
			System.out.print(arr[i]+" ");
		}
	}
}
