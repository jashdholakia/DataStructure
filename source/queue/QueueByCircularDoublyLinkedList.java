package queue;

import linkedlist.ListNode;
/**
 * @author e081103
 * Queue implementation of Doubly circular linked list
 *
 */
public class QueueByCircularDoublyLinkedList 
{
	private ListNode front;
	private ListNode rear;
	private int size=0;
	
	public void enQueue(ListNode node)
	{
		if(front==null)
		{
			front=node;
			rear=node;
			node.setNext(node);
			node.setPrev(node);
			size++;
		}
		rear.setNext(node);
		node.setPrev(rear);
		node.setNext(front);
		front.setPrev(node);
		rear=node;
		size++;
	}
	
	public int deQueue()
	{
		int data= 0;
		if(front==rear)
		{
			data= front.getData();
			front=null;
			rear=null;
			size--;
			return data;
		}
		ListNode nextToFrontNode= front.getNext();
		nextToFrontNode.setPrev(rear);
		rear.setNext(nextToFrontNode);
		data=front.getData();
		front=nextToFrontNode;
		size--;
		return data;
	}
	
	/**
	 * @return size of queue
	 */
	public int getSize()
	{
		return size;
	}
	
	/**
	 * @return front pointer value
	 */
	public int getFront()
	{
		return front.getData();
	}
	
	/**
	 * @return rear pointer value.
	 */
	public int getRear()
	{
		return rear.getData();
	}
	
	public String toString()
	{
		String s="[ ";
		s+= Integer.toString(front.getData());
		ListNode node=front.getNext();
		while(node!=front)
		{
			s+=",";
			s+=Integer.toString(node.getData());
			
			node=node.getNext();
		}
		s+=" ]";
		return s;
		
	}
}
