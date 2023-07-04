package multi_threading;

public class IntruptedDemo extends Thread {
	public void run() {
		System.out.println(Thread.interrupted());
		System.out.println(Thread.currentThread().isInterrupted());
		try {
			for (int i = 1; i <= 5; i++) {
				System.out.println(i);
				Thread.sleep(1000);
			}
		} catch (Exception e) {
			System.out.println("Thread interepted :" + e);
		}
	}

	public static void main(String[] args) {
		IntruptedDemo demo = new IntruptedDemo();
		demo.start();
		demo.interrupt();
	}
}
