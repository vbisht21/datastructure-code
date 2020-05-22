package com.datastructures.Linear;

public class SingleLinkedList {

	private ListNode head;

	static class ListNode {
		private int data;
		private ListNode next;

		public ListNode(int data) {
			this.data = data;
			this.next = null;
		}

	}

	public void display() {
		ListNode current = head;
		while (current != null) {
			System.out.print(current.data + "------>");
			current = current.next;
		}
		System.out.println("null");

	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		SingleLinkedList single = new SingleLinkedList();
		ListNode first = new ListNode(10);
		ListNode second = new ListNode(20);
		ListNode third = new ListNode(30);
		ListNode fourth = new ListNode(40);
		ListNode fifth = new ListNode(50);

		single.head = first;
		first.next = second;
		second.next = third;
		third.next = fourth;
		fourth.next = fifth;
		single.display();
	}

}
