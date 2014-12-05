package tests;

import centalSystem.Queue;

public class QueueTest {

	public static void main(String[] args) {

		Queue queue = new Queue();

		queue.addClient();
		queue.addClient();
		queue.addClient();
		queue.addClient();
		queue.addClient();
		System.out.println(queue.getTotalClient());

		queue.clientServed();
		System.out.println(queue.getNextClient());

		queue.clientServed();
		queue.clientServed();
		queue.clientServed();
		queue.clientServed();
		queue.clientServed();
		queue.clientServed();

		System.out.println(queue.getNextClient());

	}
}
