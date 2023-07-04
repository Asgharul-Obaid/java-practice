package Test;
 import java.lang.System.*;
public class StringReverse {
	 static  void print(Object s) {
		   System.out.println(s);
	   }
	  public static void main(String[] args) {
	String str="Obaid";
	String str1="Chaudhary";
	str=str+str1;
	str1=str.substring(0,str.length()-str1.length());
	str=str.substring(str1.length());
   print(str+""+str1);
	
	String str3="main";
	for(int i=str3.length()-1;i>=0;i--) {
		print(str3.charAt(i));
	}
}
}
