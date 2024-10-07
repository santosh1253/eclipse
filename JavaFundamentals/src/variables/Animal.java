package variables;

public class Animal {

	String name;
	int legs;
	int span;
	 public Animal()
	 {
		 System.out.println("Default constructor");
	 }
	 public Animal(String name,int legs)
	 {
		 this.name=name;
		 this.legs=legs;
	 }
	public void walk() {
		System.out.println("Animal can Walk");
	}

	public void eat() {
		System.out.println("Animal can eat");
	}
}
