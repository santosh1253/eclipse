package variables;

public class Student {

	 private int id;
	 private String name;
	 public void setId(int id)
	 {
		 this.id=id;
	 }
	 public int getId()
	 {
		 return id;
	 }
	 public void setName(String name)
	 {
		 this.name=name;
	 }
	 public String getName()
	 {
		 return name;
	 }
	
}
class MyClass
{
	public static void main(String[] args) {
		Student s=new Student();
		s.setId(5);
		s.setName("Santosh");
		System.out.println(s.getId()+" "+s.getName());
	}
}
