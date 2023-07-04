package arraysProgram;

import java.util.Arrays;
import java.util.Scanner;

public class SubtractArray {
 public static void main(String args[]) {
		   int[] arr = {3,5,6,9,8,7,2,3};
		   Scanner s=new Scanner(System.in);
			 int n=s.nextInt();
			 int[] a=new int[n];
			  for(int i=0;i<a.length;i++)
			  {
			  a[i]=s.nextInt();	
			  }
         		 Arrays.sort(a);	
			 int sub=0;
	 
			  for(int i=a.length-1;i>=0;i--)
			  {
			  sub=sub-a[i];
			   if(i==(a.length-1))
			   sub=-1*sub;

			  System.out.println("array "+a[i]);
			  }
			  System.out.println("Difference of all elements in array in decreasing order "+sub);
		 }


}