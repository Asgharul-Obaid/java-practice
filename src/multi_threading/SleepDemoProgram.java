package multi_threading;

public class SleepDemoProgram extends Thread{

	public void run() {
		for(int i=1;i<=5;i++) {
			try {
				Thread.sleep(1000);
				System.out.println(i+ currentThread().getName());
			} catch (Exception e) {
				System.out.println(e);
			}
		}
	}
	public static void main(String[] args) {
		SleepDemoProgram program = new SleepDemoProgram ();
		program.start();
		SleepDemoProgram sleepDemoProgram = new SleepDemoProgram();
		sleepDemoProgram.start();
	}
}
