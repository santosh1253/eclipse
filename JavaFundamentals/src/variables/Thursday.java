package variables;

public class Thursday {
	
	public int add(int a,int b)
	{
		return a+b;
	}
	public float add(float a,int b)
	{
		return a+b;
	}
	public double add(double a ,double b,double c)
	{
		return a+b+c;
	}
	public static void main(String[] args) {
		Thursday obj=new Thursday();
		System.out.println(obj.add(5, 6));
		System.out.println(obj.add(5.7f, 6));
		System.out.println(obj.add(5.6, 6.5,7.9));
		
		
	}

}
