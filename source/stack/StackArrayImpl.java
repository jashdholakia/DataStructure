package stack;

import java.util.Stack;

public class StackArrayImpl {


	public static void main(String[] args) throws Exception 
	{
		fixedArrayForStack();
		dynamicArrayForStack();
		stackByLinkedList();
	}
	
	private static void stackByLinkedList() throws Exception {
		StackByUsingLinkedList sll = new StackByUsingLinkedList();
		System.out.println("*********************************LL for stack*******************************************");
		sll.push(1);
		sll.push(2);
		sll.push(3);
		sll.push(4);
		sll.push(5);
		sll.push(6);
		
		System.out.println("SLL Size: "+sll.size());
		System.out.println("SLL Top element: "+sll.top());
		System.out.println("SLL Stack after inserting elements: "+sll.toString());
		
		System.out.println("SLL pop operation data: "+sll.pop());
		sll.pop();
		sll.pop();
		
		System.out.println("SLL After pop operation Size: "+sll.size());
		System.out.println("SLL After pop operation Top element: "+sll.top());
		System.out.println("SLL After pop operation Stack after inserting elements: "+sll.toString());
		
		
	}

	static void dynamicArrayForStack()throws Exception
	{
		
		System.out.println("*********************************Dynamic array for stack*******************************************");
		DynamicArrayForStack fs= new DynamicArrayForStack();
		System.out.println("Default Capacity "+fs.capacity());
		fs.push(1);
		fs.push(2);
		fs.push(3);
		fs.push(4);
		fs.push(5);
		fs.push(6);
		
		System.out.println("Size: "+fs.size());
		System.out.println("Top element: "+fs.top());
		System.out.println("Stack after inserting elements: "+fs.toString());
		
		fs.pop();
		fs.pop();
		fs.pop();
		
		System.out.println("After pop operation Size: "+fs.size());
		System.out.println("After pop operation Top element: "+fs.top());
		System.out.println("After pop operation Stack after inserting elements: "+fs.toString());
		
	}
	
	static void fixedArrayForStack() throws Exception
	{
		System.out.println("*********************************Fixed array for stack*******************************************");
		FixedSizeArrayForStack fs= new FixedSizeArrayForStack();
		System.out.println("Default Capacity "+fs.capacity());
		fs.push(1);
		fs.push(2);
		fs.push(3);
		fs.push(4);
		fs.push(5);
		fs.push(6);
		
		System.out.println("Size: "+fs.size());
		System.out.println("Top element: "+fs.top());
		System.out.println("Stack after inserting elements: "+fs.toString());
		
		fs.pop();
		fs.pop();
		fs.pop();
		
		System.out.println("After pop operation Size: "+fs.size());
		System.out.println("After pop operation Top element: "+fs.top());
		System.out.println("After pop operation Stack after inserting elements: "+fs.toString());
	
		
		FixedSizeArrayForStack fsu= new FixedSizeArrayForStack(25);
		System.out.println("fsu Default Capacity "+fsu.capacity());
		fsu.push(10);
		fsu.push(20);
		fsu.push(30);
		fsu.push(40);
		fsu.push(50);
		fsu.push(60);
		
		System.out.println("fsu Size: "+fsu.size());
		System.out.println("fsu Top element: "+fsu.top());
		System.out.println("fsu Stack after inserting elements: "+fsu.toString());
		
		fsu.pop();
		fsu.pop();
		fsu.pop();
		
		System.out.println("fsu After pop operation Size: "+fsu.size());
		System.out.println("fsu After pop operation Top element: "+fsu.top());
		System.out.println("fsu After pop operation Stack after inserting elements: "+fsu.toString());
	}

}
