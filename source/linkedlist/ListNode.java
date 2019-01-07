package linkedlist;

/**
 * @author jash
 * This class provids the basic structure of LinkedList node.       Singly  => |data|next|   Doubly => |prev|data|next 
 */
public class ListNode 
{
	public int data;
	private ListNode next;
	private ListNode prev;
	
	public ListNode getPrev() {
		return prev;
	}
	public void setPrev(ListNode prev) {
		this.prev = prev;
	}
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
