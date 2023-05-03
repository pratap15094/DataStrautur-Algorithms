package SingleLikedList;

import java.util.Scanner;

public class SCLL {
	public static void main(String[] args) {
		CircularList cl = new CircularList();
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		for (int i = 1; i <= n; i++) {
			cl.addFirst(i);
		}
		cl.display();
	}
}

class CircularList {
	Node head;
	Node tail;

	void addFirst(int data) {
		Node newNode = new Node(data);
		if (head == null) {
			head = newNode;
			tail = newNode;
			newNode.next = head;
		}
		newNode.next = head;
		head = newNode;
		tail.next = head;
	}

	void addLast(int data) {
		Node newNode = new Node(data);
		if (head == null) {
			head = newNode;
			tail = newNode;
			newNode.next = head;
		}
		tail.next = newNode;
		tail = newNode;
		tail.next = head;
	}

	void addBetween(int data, int key) {

	}

	void delete(int key) {

	}

	void search(int key) {

	}

	void display() {
		if (head == null)
			return;
		else {
			Node currNode = head;
			do {
				System.out.print(currNode.data + " ");
				currNode = currNode.next;
			} while (currNode != head);
		}

	}
}

class Node {
	int data;
	Node next;

	Node(int data) {
		this.data = data;
	}
}
