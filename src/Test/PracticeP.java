package Test;

public class PracticeP
{
	public static void feba(int n) {
		int a =0;int b=1;
		for (int i = 2; i < n; i++) {
			int res=a+b;
			System.out.println(res);
			a=b;
			b=res;
		}
	}
	public static void main(String[]args) {
	int n=10;
	feba(n);
  }
}