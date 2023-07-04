package Test;

import java.util.Scanner;

public class Main {
	public static String[] units= {"","one","two","thre","four","five","six","seven","eight","nine",
			"ten","eleven","twelve","thirteen","fourteen","fifteen","sixteen","seventeen",
			"eighteen","nineteen"};

	public static String[] tens= {"","","twenty","thirty","fourty","fifty","sixty","seventy","eighty","ninty"};

	public static String wordFormat(int num) {
		if (num==0) {
		return"zero";	
		}
		if (num<0) {
			return "minus" + wordFormat(Math.abs(num));
		}
		if (num<20) {
			return units[num];
		}
		if (num<100) {
			return tens[num/10]+((num%10==0)?"":" ") + units[num%10];
		}
		if (num<1000) {
			return units[num/100]+ "hunderd"+((num%100==0)?" ":" ")+ wordFormat(num%100);
		}
		if (num<100000) {
			return wordFormat(num/1000)+ "thousand"+ ((num%1000==0)?" ":" ")+wordFormat(num%1000);
		}
		if(num<1000000) {
		return wordFormat(num/10000)+ "lakh"+ ((num%10000==0)?"":" ")+wordFormat(num%10000);
		}
		return wordFormat(num/1000000)+"crore"+ ((num%1000000==0)?"":" ")+wordFormat(num%1000000);
	}
	
	public static void main(String[] args) {
	   Scanner sc=new Scanner(System.in);
	   System.out.println("enter Number");
	   int num=sc.nextInt();
	   String inword=wordFormat(num);
	   System.out.println("in words format:"+ inword);
	}
	


}
