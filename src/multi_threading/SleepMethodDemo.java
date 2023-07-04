package multi_threading;

class SleepDemo extends Thread {
	public void run() {
		for (int i = 1; i <= 5; i++) {
			try {
				Thread.sleep(1000);
				System.out.println(i);
			} catch (Exception e) {
				System.out.println(e);
			}
		}
	}
}

public class SleepMethodDemo {
	public static void main(String[] args) {
		SleepDemo demo = new SleepDemo();
		demo.start();
	}
}
