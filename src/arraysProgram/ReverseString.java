package arraysProgram;

public class ReverseString {
public static void main(String[] args) {
	String string="Obaid";
	int length=string.length();
	String revString="";
	for(int i=length-1;i>=0;i--) {
		revString=revString+string.charAt(i);
	}
	System.out.println(revString);
}
}
