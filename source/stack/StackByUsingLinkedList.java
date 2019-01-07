package stack;

import linkedlist.ListNode;
/**
 * This is the LinkedList implementation of stack.
 * Follow the basic structure of LinkedList and basic implementations of stack.
 * 
 * Here we take only one variable as 'Top' (No head, no tail) and will keep moving as we insert/delete Any node/data.
 * @author Jash
 *
 */
public class StackByUsingLinkedList 
{
	private ListNode top;  // this will work as a top pointer and it will move as we insert an element.
	private int length;
	
	public int getLength()
	{
		return length;
	}
	
	public int top()
	{
		return top.getData();
	}
	
	public StackByUsingLinkedList()
	{
		length=0;
		top=null;
	}
	
	public void push(int data)
	{
		// top remain at first place only.
		ListNode newNode = new ListNode(data);
		newNode.setNext(top);
		top=newNode;
		length++;
		
		/*//in this case we add an element one after another and top pointer move as we insert/delete any node.
		 * 
		 * issue with this approach is : while do the pop () - we need a starting node here we are not maintaining the 'head' pointer.
		 *==
		ListNode newNode = new ListNode(data);
		if(top==null)
			top= newNode;
		top.setNext(newNode);
		top=newNode;
		length++;*/
		
	}
	
	public int pop() throws Exception
	{
		if(isEmpty())
			throw new Exception("Stack is empty!");
		ListNode nodeToBeRemoved= top;
		top=nodeToBeRemoved.getNext();
		nodeToBeRemoved.setNext(null);
		length--;
		return nodeToBeRemoved.getData();
	}
	
	public boolean isEmpty()
	{
		return (length==0);
	}
	
	public int size()
	{
		return length;
	}
	
	public String toString()
	{
		String result="[ ";
		if(top==null)
			return result+=" | ";
		result=result+top.getData();
		ListNode temp= top.getNext();
		while(temp!=null)
		{
			result=result+" , "+temp.getData();
			temp=temp.getNext();
		}
		return result+" ] ";
	}
}
