package queue;

/**
 * @author Jash
 * This class is basically provide the structure of Queue.
 * Queue must have two pointers 1)Front - Data delete from this end 2) Rear - Data is insert from this end
 * 
 * Below structure is of Circular Queue [Array implementation].
 * In Array, if we want to implement circular way then we need to play with array index.
 *  - for example: If queue is full , both front and rear is at '0th' index. 
 * And to implement circular Array, we use 'MODULO' operation.
 *   - for example: Capacity is 16 and array is full in that case rear=(rear+1)%capacity => 16%16=0 [as array is having data from 0 to 15 index]
 *                  same for front.
 *    _ _ _ _ _ _
 *   |_|_|_|_|_|_| {FIFO}
 *    F         R    
 *
 */
public class FixedSizedArrayQueue {

		private int capacity=0;
		private static final int defaultCapecity= 16;
		private int[] queueArray;
		// size is used to check whether queue is full or empty, we can't use front or rear as this is circular array implementation of queue.
		private int front, rear,size=0;
		
		/**
		 * User-Defined constructor.
		 * @param capacity
		 */
		public FixedSizedArrayQueue(int capacity)
		{
			this.capacity=capacity;
			queueArray= new int [capacity];	
		}
		/**
		 * Default constructor.
		 */
		public FixedSizedArrayQueue()
		{
			this(defaultCapecity);
		}
	
		/**
		 * Insert a data into queue at rear end.
		 * @param data
		 * @throws Exception
		 */
		public void insertIntoQueue(int data)throws Exception
		{
			if(isQueueFull())
				throw new Exception("Queue is Full");
			else
			{
				queueArray[rear]=data;	
				rear= (rear+1)%capacity;
				size++;
			}
		}
		
		/**
		 * remove a data from queue at front end.
		 * @return
		 * @throws Exception
		 */
		public int deleteFromQueue()throws Exception
		{
			int data=0;
			if(isQueueEmpty())
			  throw new Exception("Queue is empty");
			else
			{
				size--;
			 data= queueArray[(front%capacity)];
			 queueArray[front]=Integer.MIN_VALUE;
			 front=(front+1)%capacity;
			
			}
			return data;
		}
		
		/**
		 * Check whether queue is empty or not
		 * @return
		 */
		public boolean isQueueEmpty()
		{
			return(rear>0);
		}
		
		/**
		 * Check whether queue is full or not.
		 * @return
		 */
		public boolean isQueueFull()
		{
				return (size==capacity);
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
