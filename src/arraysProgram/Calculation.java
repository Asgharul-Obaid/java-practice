package arraysProgram;

public class Calculation {
	public int add(int a, int b) {
		return a + b;
	}

	public static int add(int a, int b, int c) {
		return a + b + c;
	}

	public static void main(String[] args) {
		Calculation calc = new Calculation();
		int add = calc.add(1, 2);
		int addStatic = Calculation.add(1, 2, 3);
		System.out.println("Non Static"+" "+ add);
		System.out.println("Static Method"+" "+addStatic);
	}
}