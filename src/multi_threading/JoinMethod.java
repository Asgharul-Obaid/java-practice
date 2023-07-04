package multi_threading;

class Medical extends Thread {
	public void run() {
		try {
			System.out.println("Going for medical");
			Thread.sleep(3000);
			System.out.println("medical completed");
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}
}

class TestDrive extends Thread {
	public void run() {
		
		try {
			System.out.println("Test drive start");
			Thread.sleep(3000);
			System.out.println("test completed");
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}

class OfficerSign extends Thread {
	public void run() {
		try {
			System.out.println("Officer take File ");
			Thread.sleep(3000);
			System.out.println("Sign Completed");
		} catch (InterruptedException e) {
			
			e.printStackTrace();
		}
	}
}

public class JoinMethod {
	public static void main(String[] args) throws InterruptedException {
		Medical medical = new Medical();
		medical.start();
		medical.join();
		
		TestDrive testDrive = new TestDrive();
		testDrive.start();
		testDrive.join();
		
		OfficerSign sign = new OfficerSign();
		sign.start();
	}
}