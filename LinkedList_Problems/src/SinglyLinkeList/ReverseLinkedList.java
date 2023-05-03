package SinglyLinkeList;

import java.util.Scanner;

public class ReverseLinkedList {
	
	public static void main(String args[]) {
		Scanner scan = new Scanner(System.in);
		System.out.print("Enter Size of LinkedList: ");
		int n = scan.nextInt();
		LinkedList list = new LinkedList();
		for(int i=1; i<=n; i++) {
			
			int data=scan.nextInt();
			list.addLast(data);
		}
		
		printList(reverseList(list.head));
	}
	
	static Node reverseList(Node head) {
        if(head == null || head.next == null)
            return head; 
        
        Node prev = null;
        Node temp = null;
        while(head!=null) {
            temp = head.next;
            head.next = prev;
            prev = head;
            head = temp;
        }
        return prev;
    }
	//print the all node
	static void printList(Node head) {
		Node currNode = head;
		while (currNode != null) {
			System.out.print(currNode.data + " ");
			currNode = currNode.next;
		}
		System.out.println();
	}
}
