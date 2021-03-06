package queue;

import linkedlist.ListNode;

public class QueueMain 
{
	public static void main(String[] args) throws Exception 
	{
		System.out.println("******************************:: Fixed size array circular queue : ************************************");
		FixedSizedArrayQueue fsq= new FixedSizedArrayQueue(4);
		fsq.insertIntoQueue(1);
		fsq.insertIntoQueue(2);
		fsq.insertIntoQueue(3);
		fsq.insertIntoQueue(4);
		
		System.out.println("Queue: "+fsq.toString());
		System.out.println("front after Insertion: "+fsq.getFront());
		System.out.println("rear after Insertion: "+fsq.getRear());
		
		fsq.deleteFromQueue();
		
		System.out.println("Queue after deletion: "+fsq.toString());
		System.out.println("front after deletion: "+fsq.getFront());
		System.out.println("rear after deletion: "+fsq.getRear());
		
		fsq.insertIntoQueue(5);
		
		System.out.println("Queue insertion after deletion: "+fsq.toString());
		System.out.println("front Queue insertion after deletion: "+fsq.getFront());
		System.out.println("rear Queue insertion after deletion: "+fsq.getRear());
		
		System.out.println("******************************:: Dynamic size array circular queue : ************************************");
		DynamicSizedArrayQueue dsaq= new DynamicSizedArrayQueue(4);
		dsaq.enQueue(1);
		dsaq.enQueue(2);
		dsaq.enQueue(3);
		dsaq.enQueue(4);
		
		
		System.out.println("Queue: "+dsaq.toString());
		System.out.println("front after Insertion: "+dsaq.getFront());
		System.out.println("rear after Insertion: "+dsaq.getRear());
		
		dsaq.deQueue();
		
		System.out.println("Queue after deletion: "+dsaq.toString());
		System.out.println("front after deletion: "+dsaq.getFront());
		System.out.println("rear after deletion: "+dsaq.getRear());
		
		dsaq.enQueue(5);
		
		System.out.println("Queue insertion after deletion: "+dsaq.toString());
		System.out.println("front Queue insertion after deletion: "+dsaq.getFront());
		System.out.println("rear Queue insertion after deletion: "+dsaq.getRear());
		
    dsaq.enQueue(6);
		
		System.out.println("Queue insertion after array full: "+dsaq.toString());
		System.out.println("front Queue insertion after array full: "+dsaq.getFront());
		System.out.println("rear Queue insertion after array full: "+dsaq.getRear());
		System.out.println("Array size after array full: "+dsaq.getSize());
		System.out.println("Array size after array full: "+dsaq.getCapacity());
		
		System.out.println("******************************:: Queue by singly linked list (not circular one) : ************************************");
		QueueByLinkedList qLL= new QueueByLinkedList();
		qLL.enQueue(new ListNode(1));
		qLL.enQueue(new ListNode(2));
		qLL.enQueue(new ListNode(3));
		qLL.enQueue(new ListNode(4));
		
		System.out.println("Queue: "+qLL.toString());
		System.out.println("front after Insertion: "+qLL.getFront());
		System.out.println("rear after Insertion: "+qLL.getRear());
		
		System.out.println("Delete from front: "+qLL.deQueue());
		System.out.println("Delete from front: "+qLL.deQueue());
		
		System.out.println("Queue: "+qLL.toString());
		System.out.println("front after Deletion: "+qLL.getFront());
		System.out.println("rear after Deletion: "+qLL.getRear());
		
		qLL.enQueue(new ListNode(5));
		qLL.enQueue(new ListNode(6));
		
		System.out.println("Queue: "+qLL.toString());
		System.out.println("front after Insertion->Deletion->Insertion: "+qLL.getFront());
		System.out.println("rear after Insertion->Deletion->Insertion: "+qLL.getRear());
		
		
		
		System.out.println("******************************:: Queue by doubly linked list (circular one) : ************************************");
		QueueByCircularDoublyLinkedList qDLL= new QueueByCircularDoublyLinkedList();
		qDLL.enQueue(new ListNode(1));
		qDLL.enQueue(new ListNode(2));
		qDLL.enQueue(new ListNode(3));
		qDLL.enQueue(new ListNode(4));
		
		System.out.println("Queue: "+qDLL.toString());
		System.out.println("front after Insertion: "+qDLL.getFront());
		System.out.println("rear after Insertion: "+qDLL.getRear());
		
		System.out.println("Delete from front: "+qDLL.deQueue());
		System.out.println("Delete from front: "+qDLL.deQueue());
		
		System.out.println("Queue: "+qDLL.toString());
		System.out.println("front after Deletion: "+qDLL.getFront());
		System.out.println("rear after Deletion: "+qDLL.getRear());
		
		qDLL.enQueue(new ListNode(5));
		qDLL.enQueue(new ListNode(6));
		
		System.out.println("Queue: "+qDLL.toString());
		System.out.println("front after Insertion->Deletion->Insertion: "+qDLL.getFront());
		System.out.println("rear after Insertion->Deletion->Insertion: "+qDLL.getRear());
		
		
		
	}
}
