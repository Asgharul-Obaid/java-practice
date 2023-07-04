package multi_threading;

public class Demo extends Thread {

	public void run() {
		System.out.println("thread task");
	}
	public static void main(String[] args) {
		Demo demo = new Demo();
		demo.start();
		
	}
}
