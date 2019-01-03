package stack;

import java.util.Stack;

/**
 * Default stack collection class provided by Java.
 * 
 *  List Interface
 *     ^
 *   Vector
 *     ^
 *   Stack
 * @author jash
 *
 */
public class StackCollectionByJava {

	static Stack<Integer>stack= new Stack<>();
	
	public static void main(String[] args) 
	{
		for(int i=0;i<10;i++)
			stack.push(i);
		System.out.println("Stack: "+stack);
		System.out.println("Top element: "+stack.lastElement());
		System.out.println("peek element: "+stack.peek());
		
		for(int j=0;j<5;j++)
			System.out.println("Pop element: "+stack.pop());
		
		System.out.println("After pop operation Stack: "+stack);
		System.out.println("After pop operation Top element: "+stack.lastElement());
		System.out.println("After pop operation peek element: "+stack.peek());

		
		/**Duplicate methods, do the same thing as vector introduce in JDK1.1 it has empty() later in JDK1.2 collections were introduce 
		 * and method naming conversion was also changed so they introduce
		 * isEmpty in stack class.
		 * 
		 * but for backward compatibility they remain old methods.
		 */
		System.out.println("empty(): "+stack.empty());
		System.out.println("isEmpty(): "+stack.isEmpty());
		
		System.out.println("Capacity : "+ stack.capacity());
		
		
		for(int i=10;i<16;i++)
			stack.push(i);
		System.out.println("New element added to Stack: "+stack);
		
		/**
		 * added 5 elements only and before that also removed the earlier 5 element so ideally size should not increase
		 * but it is not the case.
		 * 
		 * size increased by 10 as per vector.
		 */
		System.out.println("Capacity : "+ stack.capacity());
		

	}

}
