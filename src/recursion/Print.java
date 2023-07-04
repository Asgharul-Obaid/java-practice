package recursion;

public class Print {
public static void printNumber(int n) {
	if (n==1) {
		return;
	}
	System.out.println(n);
	printNumber(n-1);
}
public static void main(String[] args) {
	int n=5;
	printNumber(n);
}
}
