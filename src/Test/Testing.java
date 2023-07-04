package Test;

public class Testing {
	public static void main(String[] args) {
	String str="abcab";
	for(char c:str.toCharArray()) {
		if (str.indexOf(c)!=str.lastIndexOf(c)) {
			System.out.println(c);
		}
	}
	
}
}
