package problem_solving;

public class PrintNumberViaRecursion {
	public static void printNumber(int n) {
		if (n==11) {
			return;
		}
		System.out.println(n);
		printNumber(n+1);
	}
	public static void main(String[] args) {
		printNumber(1);
	}
}
