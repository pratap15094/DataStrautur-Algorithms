package SinglyLinkeList;

import java.util.Scanner;

public class OccurenceOfValue {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		System.out.print("Enter Size of LinkedList: ");
		int n = scan.nextInt();
		LinkedList list = new LinkedList();
		for (int i = 1; i <= n; i++) {

			int data = scan.nextInt();
			list.addLast(data);
		}
		System.out.print("Enter key: ");
		int key = scan.nextInt();
		System.out.println(Occourence(list.head, key));
	}
	
	public static int Occourence(Node head, int key) {
		
	    Node currNode = head;
	    int n=0;
	    while(currNode!=null) {
	    	if(currNode.data==key) {
	    		n++;
	    	}
	    currNode=currNode.next;
	    }
	return n;	
	}
}
