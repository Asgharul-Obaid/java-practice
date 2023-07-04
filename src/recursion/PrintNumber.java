package recursion;
public class PrintNumber {
public static void printNo(int n) {
	if (n==6) {
		return;
	}
	System.out.println(n);
	printNo(n+1);
}
public static void main(String[] args) {
	int n = 1;
	printNo(5);
}
}
