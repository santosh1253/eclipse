package queue;

public class ReverseQueue {
	
	MyQueue res=new MyQueue();
	
	public MyQueue reverse(MyQueue queue)
	{
		if(queue.isEmpty())
		{
			//System.out.println("Empty Queue");
			return res;
		}
		else
		{
			int data=queue.dequeue();
			queue=reverse(queue);
			res.enqueue(data);
		}
		return res;
			
	}
	
	public static void main(String[] args) {
		ReverseQueue rq=new ReverseQueue();
		MyQueue q=new MyQueue();
		q.enqueue(1);
		q.enqueue(2);
		q.enqueue(3);
		q.enqueue(4);
		q.enqueue(5);
		q.enqueue(200);
		MyQueue res=rq.reverse(q);
		res.print();
	}

}
