package variables;

public class Car implements Vehicle,Factory {

	@Override
	public void price() {
		System.out.println("5,00,000");
		
	}
	@Override
	public void engine() {
		System.out.println("Petrol Engine");
		
	}
	@Override
	public void model() {
		System.out.println("Suzuki-dzire");	
	}

	@Override
	public void name() {
		System.out.println("Suziki car");	
	}
	public static void main(String[] args) {
		Vehicle v=new Car();
		v.price();
		v.name();
		v.model();
		System.out.println(v.toString());
		System.out.println(v.hashCode());
		
	}
	@Override
	public void factory() {
		System.out.println("it is originated from car factory");
		
	}
	public String toString()
	{
		return "Hello";
	}
	
}
