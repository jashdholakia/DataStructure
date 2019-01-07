package linkedlist;

public class LinkedListMain {

	public static void main(String[] args) 
	{
		singlyLinkedList();
		doublyLinkedList();
		circulerLinkedList();
	}
	
	public static void singlyLinkedList()
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
		sll.insertAtLast(new ListNode(2));
		System.out.println("Insert At Begin a data LL : "+sll.toString());
		System.out.println("Insert At Begin LL Head Position: "+sll.getPostion(1));
		System.out.println("Insert At Begin LL Length: "+sll.getLength());
		System.out.println("=========================================================");
					
		sll.insertAtGivenPosition(3, 3);
		System.out.println("Insert Data At Given position LL : "+sll.toString());
		System.out.println("Insert Data At Given position LL Length: "+sll.getLength());
			
		System.out.println("=========================================================");
		sll.insertAtGivenPosition(new ListNode(3), 4);
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
	
	public static void doublyLinkedList()
	{
		DoublyLinkedList dll= new DoublyLinkedList();
		ListNode removeDLLNode=null;
			
		System.out.println("*********************************************::DOUBLY LINKEDLIST OPERATIONS::******************************************************");
		System.out.println("before inserting a data DLL : "+dll.toString());
		System.out.println("before inserting a data DLL Head: "+dll.getHead());
		System.out.println("before inserting a data DLL Tail: "+dll.getTail());
		System.out.println("before inserting a data DLL Length: "+dll.getLength());
		
		System.out.println("=========================================================");
		dll.insertAtBegin(new ListNode(1));
		System.out.println("Insert At Begin a data DLL : "+dll.toString());
		System.out.println("Insert At Begin a data DLL Head: "+dll.getHead().getData());
		System.out.println("Insert At Begin a data DLL Tail: "+dll.getTail().getData());
		System.out.println("Insert At Begin DLL Length: "+dll.getLength());
		System.out.println("Insert At Begin LL Head Position: "+dll.getPosition(1));
			
			
	    System.out.println("=========================================================");
		dll.insertAtLast(new ListNode(2));
		System.out.println("Insert At Last a data DLL : "+dll.toString());
		System.out.println("Insert At Last a data DLL Tail: "+dll.getTail().getData());
		System.out.println("Insert At Last LL Head Position: "+dll.getPosition(1));
		System.out.println("Insert At Last DLL Length: "+dll.getLength());
			
		System.out.println("=========================================================");
		dll.insertAtGivenPosition(2, new ListNode(3));
		System.out.println("Insert Data At Given position DLL : "+dll.toString());
		System.out.println("Insert Data At Given position DLL Length: "+dll.getLength());
					
		System.out.println("=========================================================");
		dll.insertAtGivenPosition(1, new ListNode(12));
		System.out.println("Insert Data At Given position DLL : "+dll.toString());
		System.out.println("Insert Data At Given position DLL Length: "+dll.getLength());
		
		System.out.println("=========================================================");
		dll.insertAtGivenPosition(16, new ListNode(22));
		System.out.println("Insert Data At Given wrong position DLL : "+dll.toString());
		System.out.println("Insert Data At Given wrong position DLL Length: "+dll.getLength());
		System.out.println("Insert At At Given wrong position a data DLL Tail: "+dll.getTail().getData());
			
		System.out.println("=========================================================");
		removeDLLNode= dll.removeNodeAtBegin();
		System.out.println("Removed node is: "+removeDLLNode.getData());
		System.out.println("head of the linked list: "+dll.getHead().getData());
		System.out.println("Removed a element from head, Tail: "+dll.getTail().getData());
		System.out.println("LinkedList after removing first element: "+dll.toString());
			
		System.out.println("=========================================================");
		removeDLLNode= dll.removeNodeFromLast();
		System.out.println("Removed node is: "+removeDLLNode.getData());
		System.out.println("Removed a element from tail, Tail: "+dll.getTail().getData());
		System.out.println("length of the linked list: "+dll.getLength());
		System.out.println("LinkedList after removing last element: "+dll.toString());
			
		System.out.println("=========================================================");
		dll.removeMatchedNode(3);
		System.out.println("Removed node is: "+removeDLLNode.getData());
		System.out.println("Removed a  matched data element Tail: "+dll.getTail().getData());
		System.out.println("Removed a  matched data element head: "+dll.getHead().getData());
		System.out.println("length of the linked list: "+dll.getLength());
		System.out.println("LinkedList after removing last element: "+dll.toString());
		
	}	
	
	public static void circulerLinkedList()
	{
		DoublyCirculerLinkedList dll= new DoublyCirculerLinkedList();
		ListNode removeDLLNode=null;
			
		System.out.println("*******************************************************::Circuler DOUBLY LINKEDLIST OPERATIONS::*****************************************");
		System.out.println("before inserting a data CLL : "+dll.toString());
		System.out.println("before inserting a data CLL Head: "+dll.getHead());
		System.out.println("before inserting a data CLL Tail: "+dll.getTail());
		System.out.println("before inserting a data CLL Length: "+dll.getLength());
		
		System.out.println("=========================================================");
		dll.insertAtBegin(new ListNode(1));
		System.out.println("Insert At Begin a data CLL : "+dll.toString());
		System.out.println("Insert At Begin a data CLL Head: "+dll.getHead().getData());
		System.out.println("Insert At Begin a data CLL Tail: "+dll.getTail().getData());
		System.out.println("Insert At Begin DLL Length: "+dll.getLength());
		System.out.println("Insert At Begin LL Head Position: "+dll.getPosition(1));
			
			
	    System.out.println("=========================================================");
		dll.insertAtTheEnd(new ListNode(2));
		System.out.println("Insert At Last a data CLL Tail: "+dll.getTail().getData());
		System.out.println("Insert At Last CLL Head Position: "+dll.getPosition(1));
		System.out.println("Insert At Last CLL Length: "+dll.getLength());
		System.out.println("Insert At Last a data CLL : "+dll.toString());
			
		System.out.println("=========================================================");
		dll.insertAtGivenPosition(2, new ListNode(3));
		System.out.println("Insert Data At Given position 3 CLL : "+dll.toString());
		System.out.println("Insert Data At Given position CLL Length: "+dll.getLength());
					
		System.out.println("=========================================================");
		dll.insertAtGivenPosition(1, new ListNode(12));
		System.out.println("Insert Data At Given position 12 CLL : "+dll.toString());
		System.out.println("Insert Data At Given position CLL Length: "+dll.getLength());
		
		System.out.println("=========================================================");
		dll.insertAtGivenPosition(16, new ListNode(22));
		System.out.println("Insert Data At Given wrong position CLL : "+dll.toString());
		System.out.println("Insert Data At Given wrong position CLL Length: "+dll.getLength());
		System.out.println("Insert At At Given wrong position a data CLL Tail: "+dll.getTail().getData());
		
		System.out.println("=========================================================");
		removeDLLNode= dll.removeNodeFromBegin();
		System.out.println("Removed node is: "+removeDLLNode.getData());
		System.out.println("head of the linked list: "+dll.getHead().getData());
		System.out.println("Removed a element from head, Tail: "+dll.getTail().getData());
		System.out.println("LinkedList after removing first element: "+dll.toString());
			
		System.out.println("=========================================================");
		removeDLLNode= dll.removeNodeFromEnd();
		System.out.println("Removed node is: "+removeDLLNode.getData());
		System.out.println("Removed a element from tail, Tail: "+dll.getTail().getData());
		System.out.println("length of the linked list: "+dll.getLength());
		System.out.println("LinkedList after removing last element: "+dll.toString());
			
		System.out.println("=========================================================");
		dll.removeNodeFromGivenPosition(4);
		System.out.println("Removed a  matched data element Tail: "+dll.getTail().getData());
		System.out.println("Removed a  matched data element head: "+dll.getHead().getData());
		System.out.println("length of the linked list: "+dll.getLength());
		System.out.println("LinkedList after removing last element: "+dll.toString());
	}
}
