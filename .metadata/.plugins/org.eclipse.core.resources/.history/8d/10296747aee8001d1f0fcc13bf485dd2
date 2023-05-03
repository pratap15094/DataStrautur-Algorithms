package SinglyLinkeList;

import java.util.Scanner;

public class SingalLinkedList {

	public static void main(String args[]) {
		Scanner scan = new Scanner(System.in);
		System.out.print("Enter Size of LinkedList: ");
		int n = scan.nextInt();
		LinkedList list = new LinkedList();
		for(int i=1; i<=n; i++) {
			
			int data=scan.nextInt();
			list.addLast(data);
		}
		list.display();
	}
}

class LinkedList {
	Node head;

	void addLast(int data) {
		Node newNode = new Node(data);
		if (head == null) {
			head = newNode;
			return;
		}
		Node currNode = head;
		while (currNode.next != null) {
			currNode = currNode.next;
		}
		currNode.next = newNode;
	}
	void display() {
		if(head==null) {
			return;
		}
		Node currNode = head;
		while(currNode!=null) {
			System.out.print(currNode.data+" ");
			currNode=currNode.next;
		}
	}
}

class Node {
	int data;
	Node next;

	Node(int data) {
		this.data = data;
		this.next = null;
	}
}
