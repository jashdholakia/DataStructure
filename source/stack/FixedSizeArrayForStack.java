package stack;

/**
 * @author Jash
 *
 * This class  is used as a stack,we create stack using fixed size array.
 * Also provide the basic stack operation 
 *   -push
 *   -pop
 *   -top/peek
 *   -isEmpty
 *   -size
 *   -capacity
 */
public class FixedSizeArrayForStack 
{
	/*user defined capacity value, work as Array size.*/
	protected int capacity;
	/* default array size*/
	private static final int defaultCapacity=10;
	/*Array work as a stack*/
	int stackArray[];
	/* Top variable work as a pointer to the top element, initially stack is empty so we keep it as -1*/
	private int top =-1;
	
	/*default constructor, load stack (array) with default size*/
	public FixedSizeArrayForStack()
	{
		this(defaultCapacity);
	}
	
	/*User-defined array size*/
	public FixedSizeArrayForStack(int capacity) 
	{
		this.capacity=capacity;
		stackArray= new int[capacity];
	}
	
	/**
	 * @return size of the array.
	 */
	public int size() 
	{
		return (top+1);
	}
	
	/**
	 * check whether stack is empty or not.
	 * @return boolean result.
	 */
	public boolean isEmpty()
	{
		return (top<0);
	}
	
	/**
	 * Push operation.
	 * @param value needs to be inserted in a stack (LIFO)
	 * @throws Exception
	 */
	public void push(int value) throws Exception
	{
		if(size()==capacity)
			throw new Exception("Stack is full");
		/* first we do ++ operation to top value and then assign as array index because we want to store value at next index*/
		stackArray[++top]=value;
	}
	
	/**
	 * POP operation.
	 * @return last element of stack.
	 * @throws Exception
	 */
	public int pop() throws Exception
	{
		if(isEmpty())
			throw new Exception("Stack is empty");
		int data= stackArray[top];
		/*
		 * [1, 2, 3, 4, 5, -2147483648, 0, 0, 0, 0] - here we are removing last element
		 * in array top-- so first we assign top value as array index then do the -- operation.
		 */
		stackArray[top--]=Integer.MIN_VALUE;
		return data;
	}
	
	/**
	 * @return top element of the stack.
	 * @throws Exception
	 */
	public int top()throws Exception
	{
		if(isEmpty())
			throw new Exception("Stack is empty");
		return stackArray[top];
	}
	
	public String toString()
	{
		String s ="[ ";
		if(size()>0)
			s+=stackArray[0];
	    if(size()>1)
			for(int i=1;i<=size()-1;i++)
				s+=", "+stackArray[i];
		s+=" ]";
		return s;
	}
	
	public int capacity()
	{
		return capacity;
	}
}
