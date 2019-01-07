package linkedlist;

/**
 * @author jash
 * This class provide the basic structure and operations for Doubly Linked list.
 *   - Insertion (At Begin, At end, At given position)
 *   - Deletion (")
 *   - Search node
 *   	- Find node position by data.
 *   	- By given Position,
 */
public class DoublyLinkedList 
{
	private ListNode head;
	private int length;
	
	public ListNode getHead()
	{
		return head;
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
	public synchronized void InsertAtBegin (ListNode node)
	{
		if(head==null)
		{
			head=node;
			node.setPrev(null);
		}
		else
			node.setNext(head);
			head.setPrev(node);
			
			head=node;
		   length++;
	}
	
	/**
	 * Insert new node at the end of doublyLinkedList
	 * @param node
	 */
	public synchronized void InsertAtLast(ListNode node)
	{
		if(head==null)
			head=node;
		ListNode lastNode= head;
		while(lastNode.getNext()!=null)
		{
			lastNode=lastNode.getNext();
		}
		lastNode.setNext(node);
		node.setPrev(lastNode);
		node.setNext(null);
		length++;
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
			InsertAtBegin(newNode);
		else if(position==length)
			InsertAtLast(newNode);
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
		}
		return nodeToBeRemoved;
	}
	
	/**
	 * Remove last node from doubly linked list.
	 * @return
	 */
	public synchronized ListNode removeNodeFromLast()
	{
		ListNode node= head;
		ListNode prevNode=null;
	    while(node.getNext()!=null)
	    {
	    	prevNode=node;
	    	node= node.getNext();
	    }
	    node.setPrev(null);
	    prevNode.setNext(null);
	    length--;
	    return node;
	}
	
	
	/**
	 * toString
	 */
	/**
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
