package variables;

public class UtilityClass {
	
	public static  void printAnimal(Animal animal)
	{
		animal.walk();
		animal.eat();
	}
	public static void printAnimal(Cat c)
	{
		System.out.println(c.legs+" "+c.name+" "+c.span);
		c.jump();
	}

}
