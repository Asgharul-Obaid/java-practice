package com.basicjava.copy;

public class Obaid1 {
	
	private int id;
	private String name;
	
	
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
	
	public static void main(String[] args) {
		Obaid1 obaid1=new Obaid1();
		       obaid1.setId(121);
		       System.out.println(obaid1.getId());
		       obaid1.setName("Ibraheem");
		       System.out.println(obaid1.getName());
	}

}
