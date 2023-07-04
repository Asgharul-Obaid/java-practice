package com.basicjava;
import java.util.Scanner;

class AtmMachine2 {
	 private int atmPin = 2345;
	    private float accoutBalance = 57000.29f;
	 
	        public void getAccoutBalance() {
	        System.out.println("Please Enter your ATM PIN");
	        for (int i = 0; i < 3; i++) {
	            Scanner sc = new Scanner(System.in);
	            int pinNum = sc.nextInt();
	            if (pinNum == atmPin) {
	                System.out.println("Balance in your Account is : " + accoutBalance + " Rupees");
	                
	            } else {
	                if (i == 2) {
	                    System.out.println(
	                            "Card has been blocked as entered incorrect PIN 3 times, Please Contact your Bank to unlock your card");
	                   
	                }
	                System.out.println("You have entered incorrect PIN, Please Re-enter correct PIN");
	            }
	        }
	    }
	}
public class Encapsulation {
public static void main(String[] args) {
	AtmMachine2 atmMachine = new AtmMachine2();
	atmMachine.getAccoutBalance();
}
}

