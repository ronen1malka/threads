public class Queue {

	final int MAX_SIZE = 5;
	int[] arr = new int[MAX_SIZE];
	int counter = 0;
	int head = -1;
	int tail = -1;

	void enQueue(int x) throws Exception {
		System.out.println("Try to enqueue: " + x);
		if (counter == arr.length)
			throw new Exception("Queue is full");
		head++;
		head = head % MAX_SIZE;
		arr[head] = x;
		counter++;
		if (tail == -1) {
			tail = head;
		}
	}

	int deQueue() throws Exception {
		System.out.print("Try to dequeue ->");
		if (counter == 0) {
			throw new Exception("Queue is empty");
		}

		int rv = arr[tail];
		counter--;
		tail++;
		tail = tail % MAX_SIZE;

		if (counter == 0) {
			head = -1;
			tail = -1;
		}
		return rv;
	}

	public static void main(String[] args) {
		Queue q = new Queue();
		try {
			q.enQueue(60);
			q.enQueue(50);
			q.enQueue(40);
			q.enQueue(30);
			q.enQueue(20);
			q.enQueue(10); // Exception - Queue is full

		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
		try {
			System.out.println(q.deQueue());
			System.out.println(q.deQueue());
			System.out.println(q.deQueue());
			System.out.println(q.deQueue());
			System.out.println(q.deQueue());
			System.out.println(q.deQueue()); // Exception array is empty.
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
	}
}