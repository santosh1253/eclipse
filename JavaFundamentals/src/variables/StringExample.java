package variables;

public class StringExample {
	public static void main(String[] args) {
		String name = "Hello";
		StringBuffer sb=new StringBuffer(name);
		sb.deleteCharAt(sb.length()-1);
		System.out.println(sb);
		String res=String.valueOf(sb);
		System.out.println(res);
		
	}
}
