package com.datastructures.Linear;

public class QueueImpl {

	private ListNode rear;
	private ListNode front;
	private int length;

	class ListNode {

		private int data;
		private ListNode next;

		public ListNode(int data) {
			this.data = data;
			this.next = null;
		}
	}

	public QueueImpl() {
		rear = null;
		front = null;
		length = 0;

	}

	public int length() {
		return length;

	}

	public boolean isEmpty() {
		return length == 0;
	}

	public void enqueue(int data) {
		ListNode temp = new ListNode(data);

		if (isEmpty()) {
			front = temp;
		} else {
			rear.next = temp;
		}
		rear = temp;
		length++;
	}

	public int dequeue() {
		if (isEmpty()) {
			throw new RuntimeException();
		}
		int result = front.data;
		front = front.next;
		if (front == rear) {
			rear = null;
		}
		length--;
		return result;
	}

	public void display() {
		if (isEmpty())
			return;
		ListNode current = front;
		while (current != null) {
			System.out.print(current.data + "----->");
			current = current.next;
		}
		System.out.println("null");
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		QueueImpl queue = new QueueImpl();
		queue.enqueue(10);
		queue.enqueue(20);
		queue.enqueue(30);
		queue.enqueue(40);
		queue.display();

		System.out.println(queue.dequeue());

		queue.display();
	}

}
