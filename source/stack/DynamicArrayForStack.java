package stack;

public class DynamicArrayForStack
{
	private static final int defaultCapacity=4; // power of 2.
	private static final int minimumCapacity=1 >>15; //power of 2. Signed right shift
	protected int capacity;
	protected int top =-1;
	int [] stackArray;
	
	public DynamicArrayForStack()
	{
		this(defaultCapacity);
	}
	
	public DynamicArrayForStack(int capacity)
	{
		this.capacity=capacity;
		stackArray=new int[capacity];
	}
	
	public int size()
	{
		return (top+1);
	}
	
	public boolean isEmpty()
	{
		return (top<0);
	}
	
	public int capacity()
	{
		return capacity;
	}
	public void push(int value)//throws Exception
	{
		if(size()==capacity)
			//throw new Exception("Stack is Full");
			expand();
		stackArray[++top]=value;
	}
	public int pop() throws Exception
	{
		if(isEmpty())
			throw new Exception("Stack is empty");
		int data= stackArray[top];
		stackArray[top--]=Integer.MIN_VALUE;
		shrink();
		return data;
	}
	
	public void expand()
	{
		int length=size();
		int[] newStackArray= new int[length<<1]; // signed left shift by 1  4=>100 left shift by 1 => 1000 = 8 ||| work because we are taking digit in power of 2.
		System.arraycopy(stackArray, 0, newStackArray, 0, length);
		stackArray=newStackArray;
		this.capacity=this.capacity<<1;
	}
	
	public void shrink()
	{
		int length=size();
		if(length<minimumCapacity || top<<2 >= length)
			return;
		length= length+(top<<1);
		if(top<minimumCapacity)
			length=minimumCapacity;
		int newStack[] = new int[length];
		System.arraycopy(stackArray, 0, newStack, 0, top+1);
		stackArray=newStack;
		this.capacity=length;
				
	}
	
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
}
