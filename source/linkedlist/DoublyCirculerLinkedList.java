package linkedlist;

public class DoublyCirculerLinkedList 
{
	private ListNode head;
	private int length;
	private ListNode tail;
	
	public DoublyCirculerLinkedList() 
	{
		length=0;
	}
	
	public ListNode getHead()
	{
		return head;
	}
	
	public ListNode getTail()
	{
		return tail;
	}
	
	
	public int getLength() 
	{
		return length;
	}
	//================================================ Insertion =================================================//

	/**
	 * Insert at begin 
	 * @param node
	 */
	public synchronized void insertAtBegin(ListNode node)
	{
	   // List is empty condition
		if(head==null)
		{
			//*****self-linked. In case of SLL & DLL it would be null but incase of CLL every node is connected to any other node.  
			node.setNext(node);
			node.setPrev(node);
			head=node;
			tail=node;
		}
		else
		{
			node.setNext(head);
			node.getNext().setPrev(node);
			tail.setPrev(node);
			node.setPrev(tail);
			head=node;
		}
		length++;
	}
	
	/**
	 * Insert a node at the end.
	 * @param node
	 */
	public synchronized void insertAtTheEnd(ListNode node)
	{
		//List is empty.
		if(tail==null)
		{
			node.setNext(node);
			node.setPrev(node);
			head=node;
			tail=node;
		}
		else
		{
			ListNode tailNode= tail;
			//as next value never be the null value, below line will execute and not throw the NPE.
			tailNode.getNext().setPrev(node);
			node.setNext(tailNode.getNext());
			tail.setNext(node);
			node.setPrev(tail);
			tail=node;
		}
		length++;	
	}
	
	/**
	 * Insert a node at given position.
	 * @param position
	 */
	public synchronized void insertAtGivenPosition(int position, ListNode newNode)
	{
		ListNode node= head;
		if(position<0)
			position=0;
		if(position >length)
			position=length;
		if(position==0)
			insertAtBegin(newNode);
		if(position==length)
			insertAtTheEnd(newNode);
		else
		{
			for(int i=1;i<position;i++)
				node=node.getNext();
			node.getNext().setPrev(newNode);
			newNode.setNext(node.getNext());
			newNode.setPrev(node);
			node.setNext(newNode);
			length++;
		}
		
	}
	
	//=============================================== Deletion ==========================================================================//
	
	public synchronized ListNode removeNodeFromBegin()
	{
		ListNode node =head;
		if(length>=0)
		{
			if(head!=tail) // below code execute if CLL is having more than one node.
			{
				node.getNext().setPrev(node.getPrev());
				node.getPrev().setNext(node.getNext());
				head=node.getNext();
			}
			node.setNext(null);
			node.setPrev(null);
			length--;
			
		}
		return node;
	}
	
	/**
	 * Remove an element from last position.
	 * @return
	 */
	public synchronized ListNode removeNodeFromEnd()
	{
		ListNode tailNode= tail;
		if(head!=tail)
		{
			tailNode.getPrev().setNext(tailNode.getNext());
			tailNode.getNext().setPrev(tailNode.getPrev());
			tail=tailNode.getPrev();
		}
	    tailNode.setNext(null);
	    tailNode.setPrev(null);
	    length--;
	    return tailNode;
	}
	
	/**
	 * Remove node from given position.
	 * @param position
	 * @return
	 */
	public synchronized ListNode removeNodeFromGivenPosition(int position)
	{
		ListNode node= head;
		if(position<0)
			position=0;
		if (position>length)
			position=length;
		if(position==0)
			removeNodeFromBegin();
		if(position==length)
			removeNodeFromEnd();
		else 
		{
			for(int i=0;i<position;i++)
				node=node.getNext();
			node.getNext().setPrev(node.getPrev());
			node.getPrev().setNext(node.getNext());
			node.setNext(null);
			node.setPrev(null);
			length--;
		}
		return node;
	}
	
	/**
	 * Get the node position of the data
	 * @param data
	 * @return
	 */
	public synchronized int  getPosition(int data)
	{
		ListNode node=head;
		int counter=0;
		for(int i=1;i<=length+1;i++)
		{
			if(data==node.getData())
				return counter;
			node=node.getNext();
			counter++;
			
		}
		return counter;
	}

	/**
	 * toString
	 * return string.
	 */
	public String toString()
	{
		String result="[ ";
		if(head==null)
			return result+=" | ";
		result=result+head.getData();
		ListNode temp= head.getNext();
		//**No node is having next value as null so we need to check temp with head. if we compare will tail it will do while operation till length-1 (tail-1) node.
		while(temp!=head )
		{
			result=result+" , "+temp.getData();
			temp=temp.getNext();
		}
		return result+" ] ";
	}
}
