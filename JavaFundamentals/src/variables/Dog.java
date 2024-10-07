package variables;

public class Dog extends Animal {
	
	private int legs=4;
	private String name="Dog";
	private int span=15;
	public void walk() {
		System.out.println("Dog can Walk");
	}
	public void eat() {
		System.out.println("Dog can eat");
	}
	public void bark()
	{
		System.out.println("Dog can bark");
	}

}
