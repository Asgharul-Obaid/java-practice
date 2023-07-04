package multi_threading;

public class JoinMethodProgram extends Thread{
	public void run() {
		try {
			for (int i = 0; i <=5; i++) {
				System.out.println("Child thread:"+i);
				Thread.sleep(1000);
			}
		} catch (Exception e) {
			System.out.println(e);
		}
	}
	public static void main(String[] args) throws InterruptedException {
		JoinMethodProgram program = new JoinMethodProgram();
		program.start();
		program.join();
		try {
			for (int i = 0; i <=5; i++) {
				System.out.println("Main thread:"+i);
				Thread.sleep(1000);
			}		
		} catch (Exception e) {
			System.out.println(e);
		}		
	}
}
