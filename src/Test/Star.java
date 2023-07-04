package Test;

public class Star {
	public static void main(String[] args) {
		int n=5;
		for(int i=1; i<=n; i++) {
			// for spaces
			for(int j=i; j>=1; j--) {
				System.out.print(" ");
			}
			//for stars
			for(int k=1; k<=n; k++) {
				System.out.print("*");
			}
			System.out.println();
		}
	}

}
