package multi_threading;

public class IntreptedMethodDemo extends Thread{
	
	public void run() {
		try {
			for(int i=1;i<=5;i++) {
				System.out.println(i);
				Thread.sleep(1000);
			}
		} catch (Exception e) {
			System.out.println("Thread Interupted :"+ e);
		}
	}
	public static void main(String[] args) {
		IntreptedMethodDemo demo = new IntreptedMethodDemo();
		demo.start();
		demo.interrupt();
	}	
}
