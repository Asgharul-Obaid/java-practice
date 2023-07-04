package multi_threading;
public class DaemonSetThread extends Thread {
		public void run() {
			if (Thread.currentThread().isDaemon()) {
				System.out.println("daemon thread");
			}else {
				System.out.println("not daemon thread");
			}
		}
		public static void main(String[] args) {
			System.out.println("main thread");
			DaemonSetThread setThread = new DaemonSetThread();
			setThread.setDaemon(true);
			setThread.start();
		}
}
