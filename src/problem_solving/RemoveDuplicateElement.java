package problem_solving;

public class RemoveDuplicateElement {
	public static void printFeba(int n) {
		int a=0,b=1,c;
		for(int i=0;i<=n;i++) {
			c=a+b;
			System.out.println(c);
			a=b;
			b=c;
		}
	}
public static void main(String[] args) {
	printFeba(5);
}
}
