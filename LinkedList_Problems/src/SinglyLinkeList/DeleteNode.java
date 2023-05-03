package SinglyLinkeList;

import java.util.Scanner;

public class DeleteNode {

	public static void main(String args[]) {
		Scanner scan = new Scanner(System.in);
		System.out.print("Enter Size of LinkedList: ");
		int n = scan.nextInt();
		LinkedList list = new LinkedList();
		for (int i = 1; i <= n; i++) {

			int data = scan.nextInt();
			list.addLast(data);
		}
		list.display();
		System.out.println();
        System.out.println("Enter the Node which wnats to delete: ");
        int key = scan.nextInt();
		deleteNode(list.head, key);
		list.display();
	}
	
	public static void deleteNode(Node head, int key) {
		
		Node currNode= head;
		Node prevNode = null;
		if(currNode==null) {
			return;
		}
		if(currNode!=null &&currNode.data==key) {
			head=currNode.next;
			return;
		}
		
	
		while(currNode!=null && currNode.data!=key) {
			prevNode=currNode;
			currNode=currNode.next;
		}
		prevNode.next=currNode.next;
	}

}
