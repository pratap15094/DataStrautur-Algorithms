package SinglyLinkeList;

import java.util.ArrayList;
import java.util.Scanner;

public class RemoveDuplicate_SortedList {
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
		removeDuplicates(list.head);
		list.display();
	}
	
	public static Node removeDuplicates(Node head) {
        ArrayList<Integer> list = new ArrayList<>();
        Node currNode = head;
        while(currNode.next!=null){
            list.add(currNode.data);
            if(list.contains(currNode.next.data)){
                currNode.next=currNode.next.next;
            }else{
                currNode=currNode.next;
            }
        }
    return head;
    }
}
