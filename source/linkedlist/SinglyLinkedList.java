package linkedlist;

/**
 * @author jash
 * Singly linked list with all basic operation.
 *  - Insert a node (At Beginning, At end , At given position)
 *  - Delete a node (")
 *  - Search a node
 *  - Clear  a list
 *  																									                                                                                             _    _        _    _
 *  ListNode class is only a node that we have and on the basis of that we have to create a LinkedList |_|_|->|_|_|
 *
 */
public class SinglyLinkedList 
{
	private ListNode head;
	private int length;
	
	public SinglyLinkedList()
	{
		length=0;
	}
	
	public synchronized ListNode getHead()
	{
		return head;
	}
	
	/**=================================================================== Insertion ================================================================================================ **/
	
	/**
	 * Insert a node at first place.
	 * @param node
	 */
	public synchronized void insertAtBegin(ListNode node)
	{
		/* basic idea behind setNext is, first set head as next.
		 * if LinkedList is empty (null) in that case also work and incase LinkedList is having data in that case, we set new node as a next of currentHead.
		 */
		node.setNext(head);
		head=node;
		length++;
	}
	
	/**
	 * Insert a node at the end.
	 * @param node
	 */
	public synchronized void insertAtLast(ListNode node)
	{
		if(head==null)
			head= node;
		ListNode p=head;
		/* we are traversing a list here */
		while(p.getNext()!=null)
		{
			p=p.getNext();
		}
		p.setNext(node);
		length++;
	}
	
	/**
	 * Insert a NODE at given position.
	 * @param node
	 * @param position
	 */
	public synchronized void insertAtGivenPosition(ListNode node, int position)
	{
			if(position<0)
				position=0;
			if(position>length)
				position=length;
			
			if(position==0)
				insertAtBegin(node);

			if(position>=length)
				insertAtLast(node);
			else
			{
				ListNode p=head;
				for(int i=1;i<position;i++)
				{
					p=p.getNext();
				}
				node.setNext(p.getNext());
				p.setNext(node);
			}
	}
	
	/**
	 * @overloading
	 * Insert a DATA at given position
	 * @param data
	 * @param position
	 */
	public synchronized void insertAtGivenPosition(int data, int position)
	{
		ListNode newNode;
			if(position<0)
				position=0;
			if(position>length)
				position=length;
			
			if(position==0)
				insertAtBegin(new ListNode(data));

			if(position>=length)
				insertAtLast(new ListNode(data));
			else
			{
				ListNode p=head;
				for(int i=1;i<position;i++)
				{
					p=p.getNext();
				}
				newNode= new ListNode(data);
				newNode.setNext(p.getNext());
				p.setNext(newNode);
			}
	}
	
	/**============================================================================= Deletion ====================================================================================*/
	
	/**
	 * Remove the first element from the list.
	 * @param node
	 */
	public synchronized ListNode removeElementFromBegin()
	{
		ListNode node=head;
		if(node!=null)
		{
			ListNode p= node.getNext();
			head=p;
			node.setNext(null);
		}
		length--;
		return node;
	}
	
	/**
	 * Remove the last element from the list.
	 * @return removed node.
	 */
	public synchronized ListNode removeElementFromEnd()
	{
		ListNode node= head;
		if(head==null)
			return null;
		
	/*	for(int i=1;i<length;i++)
		{
			node=node.getNext();
		}*/
		while(node.getNext()!=null)
		{
			node=node.getNext();
		}
		node.setNext(null);
		length--;
		return node;
	}
	
	/**
	 * Remove the element from given position.
	 * @param position
	 * @return
	 */
	public synchronized ListNode removeElementAtGivenPosition(int position)
	{
		ListNode node=head;
		ListNode prevNode=null;
		if(position<0)
			position=0;
		if(position>=length)
			position=length-1;
		if(head==null)
			return null;
		if(position==0)
			removeElementFromBegin();
		if(position>= length)
			removeElementFromEnd();
		
		for(int i=1;i<position;i++)
		{
			prevNode=node;
			node= node.getNext();
		}
		prevNode.setNext(node.getNext());
		node.setNext(null);
		length--;
		return node;
	}
	
	/**
	 * Remove the matched node from list.
	 * @param node
	 * @return
	 */
	public synchronized void removeMatchedNode(int data)
	{
		ListNode node =head;
		ListNode p=null;
		for(int i=1;i<=length+1;i++)
		{
			if(data==node.getData())
			{
				p.setNext(node.getNext());
				node.setNext(null);
				length--;
				return;
			}
			p=node;
			node=node.getNext();
			
		}
	}
	/**
	 * Remove the matched node from list.
	 * @param node
	 * @return
	 */
	public synchronized ListNode removeMatchedNode(ListNode rnode)
	{
		ListNode node =head;
		ListNode prevNode=null;
		if(rnode.equals(head))
			removeElementFromBegin();
		while(!(rnode.equals(node))&& node!=null)
		{
			
			prevNode=node;
			node=node.getNext();
		}
		prevNode.setNext(node.getNext());
		node.setNext(null);
		length--;
		return node;
	}
	
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
	
	/**
	 * Return the position of the node.
	 * @return
	 */
	public int getPosition(ListNode node) 
	{
		ListNode p= head;
		int counter=1;
		if(node==head)
			return 1;
		if(node.getNext()==null)
			return length;
		while(p!=node)
		{
			counter++;
			p=p.getNext();
		}
		return counter;
	}
	
	/**
	 * @overloading
	 * Return the node position with matched data.
	 * @param data
	 * @return
	 */
	public int getPostion(int data)
	{
		ListNode node=head;
		int counter=0;
		while(node.getNext()!=null)
		{
			if(data==node.getData())
				return counter;
			node=node.getNext();
			counter++;
		}
		return counter;
	}
	
	public int getLength()
	{
		return length;
	}
}