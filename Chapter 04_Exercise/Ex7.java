//Ex7.java : Implement a stack using 2 queues.

import java.util.LinkedList;
import java.util.Queue;

class Stack
{
	private Queue<Integer> qu1 = new LinkedList<Integer>();
	private Queue<Integer> qu2 = new LinkedList<Integer>();

	public boolean isEmpty()
	{
		return qu1.isEmpty();
	}//End of isEmpty()
		
	public void push(int data)
	{
		while(!qu1.isEmpty())
			qu2.add(qu1.remove());

		qu1.add(data);
		while(!qu2.isEmpty())
			qu1.add(qu2.remove());

	}//End of push()		

	public int pop() throws Exception
	{
		int retValue;

		if(qu1.isEmpty())
			throw new Exception("Stack is empty");
		else
		{
			retValue = qu1.peek();
			qu1.remove();
		}

		return retValue;
	}//End of pop()	
	
	public int peek() throws Exception
	{
		if(qu1.isEmpty())
			throw new Exception("Stack is empty");

		return qu1.peek();
	}//End of peek()

	public int size()
	{
		return qu1.size();
	}//End of size()	

	public void display()
	{
		if(qu1.isEmpty())
			System.out.println("Stack is empty");
		else
		{
			while(!qu1.isEmpty())
			{
				qu2.add(qu1.peek());
				System.out.println(qu1.peek());
				qu1.remove();
			}

			while(!qu2.isEmpty())
				qu1.add(qu2.remove());
		}
	}//End of display()	
		
}//End of class Stack

class StackDemo
{
	public static void main(String[] args)
	{
		Stack st = new Stack();

		try
		{
			System.out.println("Is stack empty : " + ((st.isEmpty()) ? "True" : "False"));

			st.push(1);
			st.push(2);
			st.push(3);
			st.push(4);

			System.out.println("Stack Items :");
			st.display();
			System.out.println("Top Item : " + st.peek());
			System.out.println("Total items : " + st.size());

			System.out.println("Popped Item : " + st.pop());
			System.out.println("Stack Items :");
			st.display();

			st.push(4);
			st.push(5);

			System.out.println("Stack Items :");
			st.display();

			System.out.println("Popped Item : " + st.pop());
			System.out.println("Popped Item : " + st.pop());
			System.out.println("Popped Item : " + st.pop());
			System.out.println("Popped Item : " + st.pop());
			System.out.println("Popped Item : " + st.pop());

			System.out.println("Stack Items :");
			st.display();

		}//End of try
		catch(Exception e)
		{
			System.out.println(e.getMessage());
		}

	}//End of main()
}//End of class StackDemo








