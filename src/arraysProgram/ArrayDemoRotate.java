package arraysProgram;

import java.util.Arrays;

public class ArrayDemoRotate {
	
	public static void printArray(int[] array) {
		for (int i = 0; i < array.length; i++) {
			System.out.println(array[i]);
		}
	}
	public static void main(String[] args) {
		int[] array = { 1, 3, 9, 3, 5, 5, 6, 2 };
		//Arrays.sort(array);
		for (int i = 0; i < array.length; i++) {
			for (int j = 0; j < array.length-1-i; j++) {
				if (array[j]>array[j+1]) {
					int temp=array[j];
					array[j]=array[j+1];
					array[j+1]=temp;
				}
			}
		}
		
		printArray(array);
	
}}
