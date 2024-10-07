package queue;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;

public class Queues {
	
	public static void main(String[] args) {
		Queue<Integer> res=new LinkedList<>();
		Stack<Integer> s=new Stack<>();
		Queue<Integer> flag=new LinkedList<>();
		int k=3;
		res.add(1);
		res.add(2);
		res.add(3);
		res.add(4);
		res.add(5);
		int n=res.size();
		for(int i=0;i<k;i++)
		{
			s.add(res.poll());
		}
		while(s.size()!=0)
		{
			flag.add(s.pop());
		}
		while(!res.isEmpty())
		{
			flag.add(res.poll());
		}
		System.out.println(flag);
	}

}
