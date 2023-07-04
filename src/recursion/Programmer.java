package recursion;

class Xyz {
	int a;
	String name;
	public Xyz(int a,String name) {
	this.a=a;
	this.name=name;
	System.out.println(a+":"+name);
	}
}
public class Programmer extends Xyz{
public Programmer(int a, String name) {
		super(a, name);	
	}
public static void main(String[] args) {
	Programmer programmer = new Programmer(10, "Ibrahim");
}
}
