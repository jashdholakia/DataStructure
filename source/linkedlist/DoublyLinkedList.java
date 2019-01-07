package linkedlist;

/**
 * @author jash
 * This class provide the basic structure and operations for Doubly Linked list.
 * Only difference between SLL and DLL is , In DLL we can traverse both ways.
 * In case of remove operations , no need of previous node address to set the links.
 * 
 * Extra pointer (Tail) causes the space-complexity. O(2)
 * 
 * Basic operations:
 *   - Insertion (At Begin, At end, At given position)
 *   - Deletion (")
 *   - Search node
 *   	- Find node position by data.
 *   	- By given Position,
 */
public class DoublyLinkedList 
{
	private ListNode head, tail;
	private int length;
	
	public ListNode getHead()
	{
		return head;
	}
	
	public ListNode getTail()
	{
		return tail;
	}
	
	public void DoublyLinked() {
			length=0;
	}
	
	public int getLength()
	{
		return length;
	}
	
	/**============================================Insertion=================================**/
	
	/**
	 * Insertion at the first position i.e. Head
	 */
	public synchronized void insertAtBegin (ListNode node)
	{
		if(head==null)
		{
			head=node;
			tail=node;
			node.setPrev(null);
		}
		else
		{
			node.setNext(head);
			head.setPrev(node);
			tail=node.getNext();
		}	
			head=node;
		   length++;
	}
	
	/**
	 * Insert new node at the end of doublyLinkedList
	 * @param node
	 */
	public synchronized void insertAtLast(ListNode node)
	{
		// No need of traversing a list as DLL is having extra pointer at last. to traverse in a reverse.
		if(head==null)
			head=node;

		ListNode lastNode= tail;
		lastNode.setNext(node);
		node.setPrev(lastNode);
		node.setNext(null);
		tail=node;
		length++;
	/*	while(lastNode.getNext()!=null)
		{
			lastNode=lastNode.getNext();
		}
		lastNode.setNext(node);
		node.setPrev(lastNode);
		node.setNext(null);
		length++;*/
	}
	
	/**
	 * Insert a new node at given position.
	 * @param position
	 * @param newNode
	 */
	public synchronized void insertAtGivenPosition(int position, ListNode newNode)
	{
		ListNode p = head;
		if(position<0)
				position=0;
		if(position>length)
			position=length;
	
		if(position==0)
			insertAtBegin(newNode);
		else if(position==length)
			insertAtLast(newNode);
		else 
		{
			for(int i=1;i<position;i++)
			{
				p=p.getNext();
			}
			ListNode currentNodeAtSamePosition = p.getNext();
			newNode.setNext(currentNodeAtSamePosition);
			currentNodeAtSamePosition.setPrev(newNode);
			p.setNext(newNode);
			newNode.setPrev(p);
			length++;	
		}
	}

	/**========================================= Deletion ========================================*/
	
	/**
	 * Remove a node from beginning of Doubly LinkedList.
	 * @return
	 */
	public synchronized ListNode removeNodeAtBegin()
	{
		ListNode nodeToBeRemoved =head;
		if(length >=0)
		{
			if(nodeToBeRemoved.getNext()!=null)
			{
				ListNode nextNode= nodeToBeRemoved.getNext();
				nextNode.setPrev(null);
				head=nextNode;
				
			}
			nodeToBeRemoved.setNext(null);
			length--;
		}
		return nodeToBeRemoved;
	}
	
	/**
	 * Remove last node from doubly linked list.
	 * @return
	 */
	public synchronized ListNode removeNodeFromLast()
	{
		ListNode node= tail;
	    // as doubly linked list  is having address of previous node , no need of previous node to set the address.
		// No need of traverse a list as we have tail pointer at the end.
	    node.getPrev().setNext(null);
	    tail=node.getPrev();
	    node.setPrev(null);
	    length--;
	    return node;
	}
	
	/**
	 * Remove a node from given position.
	 * @param position
	 * @return
	 */
	public synchronized ListNode removeNodeFromGivenPosition(int position)
	{
		ListNode node =head;
		if(position<0)
			position=0;
		if(position>length)
			position=length;
	
		if(position>=0)
			removeNodeAtBegin();
		if(position==length)
			removeNodeFromLast();
		else
		{
			
			for(int i=1;i<position;i++)
				node=node.getNext();
			node.getPrev().setNext(node.getNext());
			node.getNext().setPrev(node.getPrev());
			length--;
		}
		return node;
	}
	
	/**
	 * Remove matched Data node.
	 * @param data
	 * @return
	 */
	public synchronized void removeMatchedNode(int data)
	{
		ListNode node=head;
		for(int i=1;i<=length+1;i++)
		{
			if(data==node.getData())
			{
				if(node==head)
					removeNodeAtBegin();
				else if(node==tail)
					removeNodeFromLast();
				else
				{
				 node.getPrev().setNext(node.getNext());
				 node.getNext().setPrev(node.getPrev());
				 length--;
				}
			}
			node=node.getNext();
		}
	}
	
	/**
	 * If data matched then return the position of node.
	 * @param data
	 * @return
	 */
	public synchronized int getPosition(int data)
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
		while(temp!=null)
		{
			result=result+" , "+temp.getData();
			temp=temp.getNext();
		}
		return result+" ] ";
	}
	
}
