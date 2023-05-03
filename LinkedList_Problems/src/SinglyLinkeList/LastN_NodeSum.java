package SinglyLinkeList;

import java.util.Scanner;

public class LastN_NodeSum {
	public static void main(String args[]) {
		Scanner scan = new Scanner(System.in);
		System.out.print("Enter Size of LinkedList: ");
		int n = scan.nextInt();
		LinkedList list = new LinkedList();
		for (int i = 1; i <= n; i++) {
			int data = scan.nextInt();
			list.addLast(data);
		}
		System.out.print("Value of K: ");
		int k = scan.nextInt();
		System.out.println("Sum :"+ sumOfLastN_Nodes(list.head, k));
	}

	// Return the sum of last k nodes
	public static int sumOfLastN_Nodes(Node head, int k){
      
      int len=sizeOfLinkedList(head);
      int ptr=(len-k);
      Node newptr=head;
      for(int i=0;i<ptr;i++){
         newptr=newptr.next;
      }
      
      int sum=0;
      while(newptr!=null){
          sum+=newptr.data;
          newptr=newptr.next;
      }
    return sum;  
    }

	public static int sizeOfLinkedList(Node head) {

		int len = 0;
		Node currNode = head;

		while (currNode != null) {
			len++;
			currNode = currNode.next;
		}
		return len;
	}
}
