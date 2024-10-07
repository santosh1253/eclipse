package stack;

import java.util.Scanner;

public class PostfixExp {

	public static int eval(String exp) {
		MyStack stack = new MyStack();
		for (int i = 0; i < exp.length(); i++) {
			if (Character.isDigit(exp.charAt(i)))
			{
				stack.push(Character.getNumericValue(exp.charAt(i)));
				System.out.println(stack.peek());
			}
			else if(exp.charAt(i)==' ')
			{
				continue;
			}
				
			else {
				int op1 = stack.pop();
				int op2 = stack.pop();
				if (exp.charAt(i) == '+')
				{
					stack.push(op2 + op1);
					System.out.println("Add "+(op2+op1));
				}
				else if (exp.charAt(i) == '-')
				{
					stack.push(op2 - op1);
					System.out.println("Sub "+(op2-op1));
				}
				else if (exp.charAt(i) == '*')
				{
					stack.push(op2* op1);
					System.out.println("Mul"+(op2*op1));
				}
				else if (exp.charAt(i) == '/')
					stack.push(op2 / op1);
				else if (exp.charAt(i) == '%')
					stack.push(op2 % op1);
				else {
					System.out.println("Error");
					return 0;
				}

			}
		}

		return stack.peek();
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the expression");
		String exp = sc.nextLine();
		System.out.println(PostfixExp.eval(exp));
        sc.close();
	}

}
