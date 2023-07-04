package multi_threading;

public class ThreadPriortiesProgram extends Thread{
	public void run() {
		System.out.println("Child periority");
		System.out.println(Thread.currentThread().getPriority());
	}
public static void main(String[] args) {
	
	System.out.println(Thread.currentThread().getPriority());
	
	Thread.currentThread().setPriority(7);
	System.out.println("new priorties"+Thread.currentThread().getPriority());
	ThreadPriortiesProgram program = new ThreadPriortiesProgram();
	program.start();
}
}
