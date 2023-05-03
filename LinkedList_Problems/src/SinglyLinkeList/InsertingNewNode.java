package SinglyLinkeList;

import java.util.Scanner;

public class InsertingNewNode {

	public static void main(String args[]) {
		Scanner scan = new Scanner(System.in);
		System.out.print("Enter Size of LinkedList: ");
		int n = scan.nextInt();
		LinkedList list = new LinkedList();
		for (int i = 1; i <= n; i++) {

			int data = scan.nextInt();
			list.addLast(data);
		}
		//list.display();
		System.out.println();
		int data= scan.nextInt();
		int position= scan.nextInt();
		insertBetween(list.head, data, position);
		//list.display();
	}

	public static void insertBetween(Node head, int data, int position) {

		Node newNode = new Node(data);
		if (head == null)
			return;
		if (head.data == position) {
			head.next = newNode;
		}

		Node currNode = head;
		while (currNode != null) {
			if (currNode.data == position) {
				newNode.next=currNode.next;
                 currNode.next=newNode;
			}
			currNode = currNode.next;
		}
	}
}
