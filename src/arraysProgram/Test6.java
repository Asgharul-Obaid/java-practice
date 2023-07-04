package arraysProgram;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Test6 {
	public static void main(String args[]) throws NumberFormatException, IOException {

		BufferedReader br =new BufferedReader(new InputStreamReader(System.in));
		int n=Integer.parseInt(br.readLine());
		int a = 0;

		int b = 1;
		if (n < 0) {
			System.out.println("N cannot be negative");
			return;
		}
		if (n == 0)
			System.out.println(a);
		else if (n == 1)
			System.out.println(b);
		else {
			int c = 0;
			for (int i = 2; i <= n; i++) {
				c = a + b;
				a = b;
				b = c;
			}
			System.out.println(c);
		}
	}
}
