package Java_code;

public class Book {
int id;
int age;
String name;
double salary;
private Book() {
	super();
	// TODO Auto-generated constructor stub
}
Book(int id, int age, String name, double salary) {
	super();
	this.id = id;
	this.age = age;
	this.name = name;
	this.salary = salary;
}
public int getId() {
	return id;
}
public void setId(int id) {
	this.id = id;
}
public int getAge() {
	return age;
}
public void setAge(int age) {
	this.age = age;
}
public String getName() {
	return name;
}
public void setName(String name) {
	this.name = name;
}
public double getSalary() {
	return salary;
}
public void setSalary(double salary) {
	this.salary = salary;
}
@Override
public String toString() {
	return "Book [id=" + id + ", age=" + age + ", name=" + name + ", salary=" + salary + "]";
}

}
