package variables;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class Saturday {
	
	//Creating ArrayList
	public static void main(String[] args) {
		ArrayList<Person> al=new ArrayList<>();
		Person p1=new Person(1,"Raju");
		Person p2=new Person(2,"Ravi");
		Person p3=new Person(3,"Ram");
		al.add(p1);
		al.add(p2);
		al.add(p3);
		al.add(new Person(4,"Sita"));
		List<Person> li=new LinkedList<>();
		for(int i=0;i<al.size();i++)
		{
			System.out.println(al.get(i).getId()+" "+al.get(i).getName());
		}
		
	}
	
	

}
