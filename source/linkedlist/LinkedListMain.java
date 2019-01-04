package linkedlist;

public class LinkedListMain {

	public static void main(String[] args) 
	{
		SinglyLinkedList sll= new SinglyLinkedList();
		ListNode removedNode=null;
		
		System.out.println("before inserting a data LL : "+sll.toString());
		System.out.println("before inserting a data LL Head: "+sll.getHead());
		System.out.println("before inserting a data LL Length: "+sll.getLength());
		
		System.out.println("=========================================================");
		sll.insertAtBegin(new ListNode(1));
		System.out.println("Insert At Begin a data LL : "+sll.toString());
		System.out.println("Insert At Begin LL Head Position: "+sll.getPostion(1));
		System.out.println("Insert At Begin LL Length: "+sll.getLength());
		
		System.out.println("=========================================================");
		sll.insertAtGivenPosition(2, 2);
		System.out.println("Insert Data At Given position LL : "+sll.toString());
		System.out.println("Insert Data At Given position LL Length: "+sll.getLength());
		
		System.out.println("=========================================================");
		sll.insertAtGivenPosition(new ListNode(3), 3);
		System.out.println("Insert Node At Given position LL : "+sll.toString());
		System.out.println("Insert Node At Given position LL Length: "+sll.getLength());
		
		System.out.println("=========================================================");
		sll.insertAtGivenPosition(new ListNode(4), 6);
		System.out.println("Insert Node At Given wrong position : "+sll.toString());
		System.out.println("Insert Node At Given wrong position LL Length: "+sll.getLength());
		
		System.out.println("Position of given data (4) : "+sll.getPostion(4));
		sll.insertAtGivenPosition(5, 8);
		sll.insertAtGivenPosition(6, 9);
		System.out.println("=========================================================");
		System.out.println("Final LinkedList: "+sll.toString());
		
		System.out.println("=========================================================");
	    removedNode= sll.removeElementFromBegin();
		System.out.println("Removed node is: "+removedNode.getData());
		System.out.println("head of the linked list: "+sll.getHead().getData());
		System.out.println("LinkedList after removing first element: "+sll.toString());
		
		System.out.println("=========================================================");
	    removedNode= sll.removeElementFromEnd();
		System.out.println("Removed node is: "+removedNode.getData());
		System.out.println("length of the linked list: "+sll.getLength());
		System.out.println("LinkedList after removing last element: "+sll.toString());
		
		System.out.println("=========================================================");
	    removedNode= sll.removeElementAtGivenPosition(3);
		System.out.println("Removed node is: "+removedNode.getData());
		System.out.println("length of the linked list: "+sll.getLength());
		System.out.println("LinkedList after removing element from given position: "+sll.toString());
		
		System.out.println("=========================================================");
	    removedNode= sll.removeElementAtGivenPosition(7);
		System.out.println("Removed node is: "+removedNode.getData());
		System.out.println("length of the linked list: "+sll.getLength());
		System.out.println("LinkedList after removing element from given wrong position: "+sll.toString());
		
		System.out.println("=========================================================");
	    sll.removeMatchedNode(6);
		System.out.println("Removed node is: "+removedNode.getData());
		System.out.println("length of the linked list: "+sll.getLength());
		System.out.println("LinkedList after removing element by given data : "+sll.toString());
		
	/*	System.out.println("=========================================================");
	   sll.removeMatchedNode();
		System.out.println("length of the linked list: "+sll.getLength());
		System.out.println("LinkedList after removing element from given node: "+sll.toString());*/
		
		
		
		
	}

}