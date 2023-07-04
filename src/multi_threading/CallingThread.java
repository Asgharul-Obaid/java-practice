package multi_threading;

public class CallingThread extends Thread {
	public void run() {
		System.out.println(Thread.currentThread().getName());
		System.out.println("hello");
	}
	public static void main(String[] args) {
	   System.out.println(Thread.currentThread().getName());
		CallingThread thread = new CallingThread();
		thread.start();
		
	}
}
