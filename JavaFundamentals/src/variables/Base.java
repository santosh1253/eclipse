package variables;

public class Base {

	public static void main(String[] args) {
		Animal a = new Animal();
		Animal obj1 = new Cat();
		Animal obj2 = new Dog();
		Animal obj3 = new Owl();
		
		UtilityClass u = new UtilityClass();
		Cat c=new Cat();
		u.printAnimal(c);
	}
}
