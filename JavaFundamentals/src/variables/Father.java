package variables;

public class Father {
	 String name="rao";
	 int age=23;
	 String prop1="car";
	String prop2="House";
	public void display()
	{
		System.out.println(name+" "+age);
	}
	
}
class Son extends Father
{
	private String name="Guru";
	private int age=24;
	private String prop="lands";
	public void display()
	{
		System.out.println(name+" "+age);
	}
	public static void main(String[] args) {
	//	Father f=new Son(); //upcasting  or Dynamic Binding
		Son s=new Son();  // static binding
		s.display();
	}	
}

