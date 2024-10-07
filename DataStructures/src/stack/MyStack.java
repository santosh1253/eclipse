package stack;

public class MyStack {
    // Stack impl using arrays
	int arr[]=new int[20];
	int idx=-1;
	public void push(int element)
	{
		arr[++idx]=element;
	}
	public int pop()
	{
		if(idx==-1)
		{
			System.out.println("Underflow");
			return -1;
		}
		return arr[idx--];
	}
	public int peek()
	{
		if(idx==-1)
		{
			System.out.println("Stack is Empty");
			return -1;
		}
		return arr[idx];
	}
	public  void print(MyStack stack)
	{
		while(idx>=0)
		{
			System.out.println(stack.pop());
		}
	}
	public static void main(String[] args) {
		MyStack stack=new MyStack();
		stack.push(5);
		stack.push(4);
		stack.push(6);
		stack.push(9);
		stack.print(stack);
	}
}
