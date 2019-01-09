package queue;

import linkedlist.ListNode;
/**
 * 
 * @author e081103
 *Queue implemetation of singly linked list (not circular one)
 */
public class QueueByLinkedList 
{
	private ListNode front;
	private ListNode rear;
	private int size=0;
	
	
	public synchronized void enQueue(ListNode node)
	{
		if(front==null)
		{
			front= node;
			rear=node;
			size++;
			return;
		}
		rear.setNext(node);
		node.setNext(null);
		rear=node;
		size++;		
	}
	
	public synchronized int deQueue()
	{
		int data=0;
		if(front==rear)
		{
			data=front.getData();
			front=null;
			rear=null;
			size--;
			return data;
		}
		ListNode newFront= front.getNext();
		data= front.getData();
		front.setNext(null);
		front=newFront;
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
		//s+= Integer.toString(front.getData());
		ListNode node=front;
		for(int i=0;i<size;i++)
		{
			s+= Integer.toString(node.getData());
			node=node.getNext();
			if(i<size)
				s+=",";
		}
		s+=" ]";
		return s;
		
	}
}
