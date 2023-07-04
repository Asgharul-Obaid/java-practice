package multi_threading;

public class YeildMethodDemo extends Thread{
	public void run() {
		Thread.yield();
		for(int i =1;i<=5;i++) {
			System.out.println(Thread.currentThread().getName()+" : "+i);
		}
	}
	public static void main(String[] args) {
		YeildMethodDemo demo = new YeildMethodDemo();	
		demo.start();
		Thread.yield();
		for (int i = 0; i <=5; i++) {		
			System.out.println(Thread.currentThread().getName()+" : "+i);
		}
	}
}
