package multi_threading;
//perform multiple task from multiple thrEAD
class Music extends Thread{
	public void run() {
		System.out.println("Playing Music");
		
	}
}
class Video extends Thread{
	public void run() {
		System.out.println("Watching video");
	}
}
class TimerProgram extends Thread{
	public void run() {
		System.out.println("Stop the music and video");
	}
}
public class PerformingMultipleTask {
public static void main(String[] args) {
	Music m=new Music();
	m.start();
	
	Video v=new Video();
	v.start();
	
	TimerProgram tp=new TimerProgram();
	tp.start();
}
}
