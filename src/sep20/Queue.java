package sep20;

public class Queue {

	private int maxQueueSize, front, rear, currentSize;
	private int[] queue;

	public Queue(int maxQueueSize) {
		if (maxQueueSize <= 0)
			System.out.println("Queue size should be a positive integer.");
		else {
			this.maxQueueSize = maxQueueSize;
			front = rear = 0;
			currentSize = 0;
			queue = new int[maxQueueSize];
		}
	}

	public void enqueue(int val) { // complete this function
		// check queue is full or not
		if (rear==maxQueueSize) {
			System.out.printf("\nQueue is full\n");
			return;
		}

		// insert element at the rear
		else {
			queue[rear] = val;
			rear++;
		}
	}

	public int dequeue() { // complete this function
		// check for queue underflow
		if (front == rear) {
			System.out.println("UnderFlow\nProgram Terminated");
			System.exit(1);
		}

		int res = queue[front];

		front = (front + 1) % maxQueueSize;
		currentSize--;
		return res;
	}

	public int getSize() {// complete this function
		return rear;
	}

	public String toString() {
		if (getSize() == 0)
			return "[]";
		else {
			String output = "[";
			if (rear > front) {
				for (int i = front; i < rear - 1; i++)
					output += queue[i] + ", ";
				output += queue[rear - 1] + "]";
			} else {
				for (int i = front; i < maxQueueSize - 1; i++)
					output += queue[i] + ", ";
				output += queue[maxQueueSize - 1];

				for (int i = 0; i < rear; i++)
					output += ", " + queue[i];
				output += "]";
			}
			return output;
		}
	}
	public static void main(String[] args) {
		Queue q = new Queue(10);
		q.enqueue(10);
		q.enqueue(20);
		q.enqueue(30);
		q.enqueue(40);
		System.out.println(q);
		q.dequeue();
		System.out.println(q);
		
	}
}