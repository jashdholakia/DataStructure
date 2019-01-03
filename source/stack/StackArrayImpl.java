package stack;

import java.util.Stack;

public class StackArrayImpl {


	public static void main(String[] args) throws Exception 
	{
		fixedArrayForStack();
		dynamicArrayForStack();
	}
	
	static void dynamicArrayForStack()throws Exception
	{
		DynamicArrayForStack fs= new DynamicArrayForStack();
		System.out.println("Default Capacity "+fs.capacity());
		fs.push(1);
		fs.push(2);
		fs.push(3);
	/*	fs.push(4);
		fs.push(5);
		fs.push(6);*/
		
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
