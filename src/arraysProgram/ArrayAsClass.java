package arraysProgram;

import java.util.Scanner;

class ArraySubClass {
	private int id;
	private String name;

	public ArraySubClass() {
	}

	public ArraySubClass(int id, String name) {
		super();
		this.id = id;
		this.name = name;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	@Override
	public String toString() {
		return "[id=" + id + ", name=" + name + "]";
	}
}

public class ArrayAsClass {
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		ArraySubClass[] arraySubClass = new ArraySubClass[3];
		for (int i = 0; i < arraySubClass.length; i++) {
			arraySubClass[i] = new ArraySubClass(s.nextInt(), s.next());
			s.nextLine();
		}
		for (int i = 0; i < arraySubClass.length; i++) {
			System.out.print(arraySubClass[i].toString());
		}
	}
}