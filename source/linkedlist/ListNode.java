package linkedlist;

/**
 * @author jash
 * This class provids the basic structure of LinkedList.
 */
public class ListNode 
{
	public int data;
	private ListNode next;
	
	public ListNode(int data)
	{
		this.data=data;
	}
	public int getData() {
		return data;
	}
	public void setData(int data) {
		this.data = data;
	}
	public ListNode getNext() {
		return next;
	}
	public void setNext(ListNode next) {
		this.next = next;
	}
}
