package queue;

public class DynamicSizedArrayQueue 
{
  private int capacity=0;
  private static final int minimumCapacity= 1 << 15;
  private static final int defaultCapacity=4; // power of two.
  private int size=0;
  private int front, rear=0;
  int queueArray[];
  
  public DynamicSizedArrayQueue()
  {
	  this(defaultCapacity);
  }
  
  public DynamicSizedArrayQueue(int capacity)
  {
	  this.capacity=capacity;
	  queueArray= new int[capacity];
  }
  
  public void enQueue(int data)
  {
	  if(isQueueFull())
		  increseQueueSize();
	  
		  queueArray[rear]=data;
		  rear=(rear+1)%capacity;
		  size++;

  }
  
  public int deQueue()
  {
	  int data=0;
	  if(isQueueEmpty())
		  shrinkQueueSize();
	 data=queueArray[(front%capacity)];
	 queueArray[front]=Integer.MIN_VALUE;
	 front=(front+1)%capacity;
	 size--;

	  return data;
  }
  
  public void increseQueueSize()
  {
	  int length=getSize();
	  int newQueueArray[]= new int[(length<<1)]; // or length*2
System.arraycopy(queueArray, 0, newQueueArray, 0, length);
	  queueArray=newQueueArray;
	  front=0;
	  rear=size;
	  capacity*=2;
	  
  }
  /**
   * Shrink the array; Dynamic array shrink to 1/2 if more than 3/4 empty.
   */
  public void shrinkQueueSize()
  {
	  int length= getSize();
	  if(length<minimumCapacity || length <<2 >= length)
	      return;
	  if(length<minimumCapacity)
			length=minimumCapacity;
		int newStack[] = new int[length];
		System.arraycopy(queueArray, 0, newStack, 0, length+1);
		queueArray=newStack;
		this.capacity=length;
  }
  
  public boolean isQueueFull()
  {
	  return(size==capacity);
  }
  
  public boolean isQueueEmpty()
  {
	  return (size==0);
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
		return front;
	}
	
	/**
	 * @return rear pointer value.
	 */
	public int getRear()
	{
		return rear;
	}
	
	public int getCapacity()
	{
		return capacity;
	}
	public String toString()
	{
		String result= "[ ";
		for(int i=0;i<size;i++)
		{
			result+=Integer.toString(queueArray[(front+i)%capacity]);
			if(i<size-1)
				result+=",";
		}
		result+=" ]";
		return result;
			
	}
}
