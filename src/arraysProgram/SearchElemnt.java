package arraysProgram;

import java.util.Scanner;

public class SearchElemnt {

public static void main(String[] args) {
int n[]= {1,2,3,4,5,6,7,8,9,10};
Scanner s=new Scanner(System.in);
System.out.println("Put elemnt");
int a=s.nextInt();
	for (int i = 0; i < n.length; i++) {
			if (a!=n[i]) {
				
				System.out.println("available");
		}else {
			System.out.println("not available");
		break;}
			
	}

	}
}

