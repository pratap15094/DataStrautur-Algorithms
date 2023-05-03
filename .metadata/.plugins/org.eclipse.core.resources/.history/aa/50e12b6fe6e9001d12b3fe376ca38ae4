package SingleLikedList;

import java.util.Scanner;

public class SLL {
	public static void main(String args[]) {
		Scanner scan = new Scanner(System.in);
		int n = scan.nextInt();
		LinkedList list = new LinkedList();
		for (int i = 0; i < n; i++) {
			//list.addFirst(i);
			list.addLast(i);
		}
		list.display();
		System.out.println();
//		list.addBefor(9,3);
//		list.display();
//		System.out.println();
//		list.addAfter(9,3);
//		list.display();
//		System.out.println();
		list.delete(3);
		list.display();
		System.out.println();
		list.search(17);
		System.out.println();
		System.out.println(list.sizeOfLinkedList());
	}
}

class LinkedList {
	Node head;

	void addFirst(int data) {

		Node newNode = new Node(data);
		if (head == null) {
			head = newNode;
			return;
		}
		newNode.next = head;
		head = newNode;
	}

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
	void addBefor(int data, int key) {
		Node newNode = new Node(data);
		if (head == null) {
			head = newNode;
			return;
		}
		Node currNode= head;
		while(currNode.next.data!=key) {
			currNode=currNode.next;
		}
		newNode.next=currNode.next;
		currNode.next=newNode;
	}
	void addAfter(int data, int key) {
		Node newNode = new Node(data);
		if (head == null) {
			head = newNode;
			return;
		}
		Node currNode= head;
		while(currNode.data!=key) {
			currNode=currNode.next;
		}
		newNode.next=currNode.next;
		currNode.next=newNode;
	}
	
	void delete(int key) {
		
		Node currNode = head;
		Node prevNode= null;
		if(currNode==null) {
			return;
		}
		
		if(currNode!=null && currNode.data==key ) {
			head=currNode.next;
			return;
		}
		
		while(currNode!=null && currNode.data!=key) {
			prevNode=currNode;
			currNode=currNode.next;
		}
		prevNode.next=currNode.next;
	}

	void display() {
		if (head == null)
			return;
		Node currNode = head;
		while (currNode != null) {
			System.out.print(currNode.data + " ");
			currNode = currNode.next;
		}
	}
	void search(int key) {
		Node currNode=head;
		if(currNode==null) {
			System.out.println("Not found");
		}
		while(currNode!=null) {
			if(currNode.data==key) {
				System.out.println("Node Found");
				return;
			}
		currNode=currNode.next;
		}
	System.out.println("Not found");
	}
	int sizeOfLinkedList(){
		if(head==null) return 0;
		Node currNode=head;
		int size=0;
		while(currNode!=null) {
			size++;
		currNode=currNode.next;
		}
	return size;
	}
    void deleteLinkedList() {
    	head=null;
    	return;
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