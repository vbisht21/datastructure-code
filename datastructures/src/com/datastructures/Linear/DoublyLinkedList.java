package com.datastructures.Linear;

import java.util.NoSuchElementException;

public class DoublyLinkedList {

	private ListNode head;
	private ListNode tail;
	// to find length of linked list
	private int length;

	public DoublyLinkedList() {

		this.head = null;
		this.tail = null;
		this.length = 0;
	}

	class ListNode {
		private int data;
		private ListNode next;
		private ListNode previous;

		public ListNode(int data) {
			this.data = data;
		}
	}

	public boolean isEmpty() {
		return length == 0; // or head == null
	}

	public int length() {
		return length;
	}

	public void displayForward() {
		if (head == null) {
			return;
		}
		ListNode current = head;
		while (current != null) {
			System.out.print(current.data + "--->");
			current = current.next;
		}
		System.out.println("null");
	}

	public void displayBackward() {
		if (tail == null) {
			return;
		}
		ListNode current = tail;
		while (current != null) {
			System.out.print(current.data + "--->");
			current = current.previous;
		}
		System.out.println("null");
	}

	public void inserLast(int value) {
		ListNode newNode = new ListNode(value);
		if (isEmpty()) {
			head = newNode;

		} else {
			tail.next = newNode;
			newNode.previous = tail;
		}

		tail = newNode;
		length++;
	}

	public void insertFirst(int key) {
		ListNode newNode = new ListNode(key);
		if (head == null && tail == null) {
			tail = newNode;
		} else {
			head.previous = newNode;
			newNode.next = head;
		}
		newNode.next = head;
		head = newNode;
	}

	public ListNode deleteFirst() {
		if (isEmpty()) {
			throw new NoSuchElementException();
		}
		ListNode temp = head;
		if (head == tail) {
			tail = null;
		} else {
			head.next.previous = null;
		}
		head = head.next;
		temp.next = null;
		return temp;
	}

	public ListNode deleteLast() {

		if (isEmpty()) {
			throw new NoSuchElementException();
		}
		ListNode temp = tail;
		if (head == tail) {
			head = null;
		} else {
			temp.previous.next = null;
		}

		tail = tail.previous;
		temp.previous = null;
		return temp;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		DoublyLinkedList doub = new DoublyLinkedList();
		doub.inserLast(1);
		doub.inserLast(10);
		doub.inserLast(15);
		doub.inserLast(25);

		/*
		 * doub.insertFirst(1); doub.insertFirst(10); doub.insertFirst(15);
		 * doub.insertFirst(25);
		 */

		/*doub.displayForward();
		doub.deleteFirst();
		doub.displayForward();
		doub.deleteFirst();
		doub.displayForward();*/
		/* doub.displayBackward(); */
		doub.displayForward();
		doub.deleteLast();
		doub.displayForward();
		doub.deleteLast();
		doub.displayForward();
		
		
	}

}
