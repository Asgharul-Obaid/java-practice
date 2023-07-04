package multi_threading;

public class SleepMethodProgram {
public static void main(String[] args) throws InterruptedException {
	
	try {
		for(int i =1 ; i<=5;i++) {
			Thread.sleep(2000);
			System.out.println(i);
		}
	} catch (Exception e) {
		System.out.println(e);
	}
}
}
