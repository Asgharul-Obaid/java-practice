package multi_threading;
interface A{
void show();	
}
interface B{
	void run();
}

public class MainClass implements A,B {

	@Override
	public void run() {
		System.out.println("hi");
		
	}

	@Override
	public void show() {
		System.out.println("By");
		
	}
	public static void main(String[] args) {
		MainClass ms=new MainClass();
		ms.run();
		ms.show();
	}

}
