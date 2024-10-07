package queue;

public class MyQueue {

	public int[] arr = new int[20];
	public int front = -1;
	public int rear = -1;

	public void enqueue(int element) {
		if (front == -1 && rear == -1) {
			arr[++front] = element;
			++rear;
		} else if (rear == arr.length - 1) {
			System.out.println("Queue is Full");
			return;
		} else
			arr[++rear] = element;
	}

	public int dequeue() {
		if (front == -1) {
			System.out.println("Queue is Empty");
			return 0;
		}
		int res = arr[front];
		++front;
		if (front > rear) {
			front = -1;
			rear = -1;
		}
		return res;
	}

	public void print() {
		if (rear == -1) {
			System.out.println("Queue is empty");
			return;
		}
		for (int i = front; i <= rear; i++) {
			System.out.print(arr[i] + " ");
		}
	}

	public boolean isEmpty() {
		return front == -1 && rear == -1;
	}

	public int size() {
		if (rear != -1)
			return rear - 1;
		else
			return -1;
	}

	public static void main(String[] args) {
		MyQueue queue = new MyQueue();
		queue.enqueue(10);
		queue.enqueue(25);
		queue.enqueue(70);
		queue.enqueue(90);
		queue.enqueue(200);
		queue.enqueue(300);
		queue.dequeue();
		queue.dequeue();
		queue.print();

	}

}
