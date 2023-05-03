package SinglyLinkeList;

public class RemoveLoop {

	public static void main(String[] args) {
		
		
		
	}
	//Function to remove a loop in the linked list.
    public static void removeLoop(Node head){
     if(head.next==null||head.next.data==-1){
        head.next=null;
        return;
     }
    head.data=-1;
    removeLoop(head.next);
    }

}
