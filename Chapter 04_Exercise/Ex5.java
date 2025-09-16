//Ex5.java : Write a program to implement 2 queues in a single array.

class Queue
{
	private static final int MAX_SIZE = 6;
	private int[] queueArray;
	private	int frontA;
	private	int rearA;
	private	int frontB;
	private	int rearB;
	
	public Queue()
	{
		queueArray = new int[MAX_SIZE];
		frontA = -1;
		rearA = -1;
		frontB = MAX_SIZE;
		rearB = MAX_SIZE;
	}//End of Queue()

	public boolean isEmptyA()
	{
		return (frontA==-1);
	}//End of isEmptyA()
	
	public boolean isEmptyB()
	{
		return (frontB == MAX_SIZE);
	}//End of isEmptyB()	
	
	public boolean isFull()
	{
		return (rearA == rearB-1);
	}//End of isFull()	
	
	public void enqueueA(int data)
	{
		if(isFull())
			System.out.println("Queue Overflow");
		else
		{
			if(frontA == -1)
				frontA = 0;

			rearA = rearA+1;
			queueArray[rearA] = data;
		}
	}//End of enqueueA()	
	
	public void enqueueB(int data)
	{
		if(isFull())
			System.out.println("Queue Overflow");
		else
		{
			if(frontB == MAX_SIZE)
				frontB = MAX_SIZE-1;

			rearB = rearB-1;
			queueArray[rearB] = data;
		}
	}//End of enqueueB()	
	
	public int dequeueA() throws Exception
	{
		if(isEmptyA())
			throw new Exception("Queue is empty");

		int retValue = queueArray[frontA++];

		if(frontA==rearA+1)
		{
			frontA = -1;
			rearA = -1;
		}

		return retValue;
	}//End of dequeueA()	
	
	public int dequeueB() throws Exception
	{
		if(isEmptyB())
			throw new Exception("Queue is empty");

		int retValue = queueArray[frontB--];

		if(frontB==rearB-1)
		{
			frontB = MAX_SIZE;
			rearB = MAX_SIZE;
		}

		return retValue;
	}//End of dequeueB()
	
	public void displayA()
	{
		System.out.println("FrontA = " + frontA + "	rearA = " + rearA);

		if(isEmptyA())
			System.out.println("Queue is empty");
		else
			for(int i=frontA; i<=rearA; i++)
				System.out.println(queueArray[i]);
	}//End of displayA()

	public void displayB()
	{
		System.out.println("FrontB = " + frontB + "	rearB = " + rearB);

		if(isEmptyB())
			System.out.println("Queue is empty");
		else
			for(int i=frontB; i>=rearB; i--)
				System.out.println(queueArray[i]);
	}//End of displayB()	
		
}//End of class Queue

class QueueDemo
{
	public static void main(String[] args)
	{
		Queue qu = new Queue();

		try
		{
			//For Queue A
			qu.enqueueA(1);
			qu.enqueueA(2);
			qu.enqueueA(3);

			System.out.println("QueueA Items :");
			qu.displayA();

			System.out.println("QueueA deleted Item : " + qu.dequeueA());
			System.out.println("QueueA Items :");
			qu.displayA();

			System.out.println("QueueA deleted Item : " + qu.dequeueA());
			System.out.println("QueueA Items :");
			qu.displayA();

			System.out.println("QueueA deleted Item : " + qu.dequeueA());
			System.out.println("QueueA Items :");
			qu.displayA();

			qu.enqueueA(4);
			qu.enqueueA(5);
			qu.enqueueA(6);
			System.out.println("QueueA Items :");
			qu.displayA();

			//For Queue B
			qu.enqueueB(7);
			qu.enqueueB(8);
			qu.enqueueB(9);

			System.out.println("QueueB Items :");
			qu.displayB();

			System.out.println("QueueB deleted Item : " + qu.dequeueB());
			System.out.println("QueueB Items :");
			qu.displayB();

			System.out.println("QueueB deleted Item : " + qu.dequeueB());
			System.out.println("QueueB Items :");
			qu.displayB();

			System.out.println("QueueB deleted Item : " + qu.dequeueB());
			System.out.println("QueueB Items :");
			qu.displayB();

			qu.enqueueB(10);
			qu.enqueueB(11);
			qu.enqueueB(12);

			System.out.println("QueueB Items :");
			qu.displayB();

			//Now queue is full
			qu.enqueueB(14);

		}//End of try
		catch(Exception e)
		{
			System.out.println(e.getMessage());
		}



	}//End of main()
}//End of class QueueDemo








