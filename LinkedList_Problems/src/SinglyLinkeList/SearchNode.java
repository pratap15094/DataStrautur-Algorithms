package SinglyLinkeList;

import java.util.Scanner;

public class SearchNode {
	public static void main(String args[]) {
		Scanner scan = new Scanner(System.in);
		System.out.print("Enter Size of LinkedList: ");
		int n = scan.nextInt();
		LinkedList list = new LinkedList();
		for(int i=1; i<=n; i++) {
			
			int data=scan.nextInt();
			list.addLast(data);
		}
	System.out.print("Enter key: ");
	int key = scan.nextInt();
    System.out.println(search(list.head, key));
	}
	
	public static boolean search(Node head, int key) {
		
		if(head==null) 
			return false;
		if(head.data==key)
			return true;
		Node currNode = head;
		while(currNode.next!=null) {
			 if(currNode.data==key)
				 return true;
		  currNode=currNode.next;
		}
	return false;
	}
}
