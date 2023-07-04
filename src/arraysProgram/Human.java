package arraysProgram;

class Finger{
	
	void finger() {
		   
		System.out.println("finger ");
	}
}
class Heart{
	public Heart() {
		new Finger().finger();
		
		System.out.println("heart..");
	}
}
class Hand{
	void hand() {
		System.out.println("hand");
	}	
}
class Brain{
	public Brain() {
		new Hand().hand();
		  System.out.println("Brain");
	}
}
public class Human {
	public Human() {
		Heart heart= new Heart();
		Brain brain= new Brain();
		Hand hand= new Hand();
		Finger finger= new Finger();
	}
	public static void main(String[] args) {
		Human o=new Human();
		
		
		
	}

}