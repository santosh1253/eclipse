package variables;

public interface Factory {
	void factory();
	default void display()
	{
		System.out.println("Default method");
	}
	public static void myfunc()
	{
		System.out.println("From static method");
	}

}
