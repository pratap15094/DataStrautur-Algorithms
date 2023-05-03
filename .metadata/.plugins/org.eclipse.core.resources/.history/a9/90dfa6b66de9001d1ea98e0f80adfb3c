package SinglyLinkeList;

import java.util.Scanner;

public class CountNodes {

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
		System.out.println();
		int size=CountNode(list.head);
		System.out.print("size of linkedlist:"+ size);
	}
    
	public static int CountNode(Node head) {
		int size=0;
		if(head==null) {
			return 0;
		}
		Node currNode = head;
		while(currNode!=null) {
			size++;
			currNode=currNode.next;
		}
	return size;
	}
}
