//Ex6.java : Implement a queue using 2 stacks.

import java.util.Stack;

class Queue
{
	private Stack<Integer> instack = new Stack<Integer>();
	private Stack<Integer> outstack = new Stack<Integer>();

	public boolean isEmpty()
	{
		return (instack.empty() && outstack.empty());
	}//End of isEmpty()	

	public void enqueue(int data)
	{
		instack.push(data);
	}//End of enqueue()

	public int dequeue() throws Exception
	{
		if(isEmpty())
			throw new Exception("Queue is empty");

		if(outstack.empty())
		{
			while(!instack.empty())
			{
				outstack.push(instack.pop());
			}
		}

		int retValue = outstack.pop();
		//outstack.pop();

		return retValue;
	}//End of dequeue()
	
	public int peek() throws Exception
	{
		if(isEmpty())
			throw new Exception("Queue is empty");

		if(outstack.empty())
		{
			while(!instack.empty())
			{
				outstack.push(instack.pop());
			}
		}

		int retValue = outstack.peek();

		return retValue;
	}//End of peek()	
	
	public void display()
	{
		if(isEmpty())
			System.out.println("Queue is empty");
		else
		{
			int instackSize = instack.size();
			while(!outstack.empty())
			{
				instack.push(outstack.peek());
				System.out.println(outstack.peek());
				outstack.pop();
			}

			while(!instack.empty())
				outstack.push(instack.pop());

			for(int i=0; i<instackSize; i++)
			{
				instack.push(outstack.peek());
				System.out.println(outstack.peek());
				outstack.pop();
			}
		}//End of else

	}//End of display()	
	
	public int size()
	{
		int retValue=0;

		if(!isEmpty())
			retValue = instack.size() + outstack.size();

		return retValue;
	}//End of size()	
	
}//End of class Queue

class QueueDemo
{
	public static void main(String[] args)
	{
		Queue qu = new Queue();

		try
		{
			System.out.println("Is queue empty : " + ((qu.isEmpty()) ? "True" : "False"));

			qu.enqueue(1);
			qu.enqueue(2);
			qu.enqueue(3);
			qu.enqueue(4);

			System.out.println("Queue Items :");
			qu.display();
			System.out.println("Front Item : " + qu.peek());
			System.out.println("Total items : " + qu.size());

			System.out.println("Deleted Item : " + qu.dequeue());
			System.out.println("Queue Items :");
			qu.display();

			qu.enqueue(5);

			System.out.println("Queue Items :");
			qu.display();

			System.out.println("Deleted Item : " + qu.dequeue());
			System.out.println("Deleted Item : " + qu.dequeue());
			System.out.println("Deleted Item : " + qu.dequeue());
			System.out.println("Deleted Item : " + qu.dequeue());

			System.out.println("Queue Items :");
			qu.display();

		}//End of try
		catch(Exception e)
		{
			System.out.println(e.getMessage());
		}		
		
	}//End of main()
}//End of class QueueDemo











