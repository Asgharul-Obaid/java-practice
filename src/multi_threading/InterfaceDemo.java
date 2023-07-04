package multi_threading;

public class InterfaceDemo implements Runnable {

	@Override
	public void run() {
		System.out.println("i am in thread");
		
	}
	public static void main(String[] args) {
		InterfaceDemo i=new InterfaceDemo();
		Thread t=new Thread(i);
		t.start();
	}
}
