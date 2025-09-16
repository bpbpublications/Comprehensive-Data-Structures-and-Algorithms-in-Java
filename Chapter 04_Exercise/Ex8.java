//Ex8.java : Implement a stack with one queue.

import java.util.LinkedList;
import java.util.Queue;

class Stack
{
	private Queue<Integer> qu = new LinkedList<Integer>();

	public boolean isEmpty()
	{
		return qu.isEmpty();
	}//End of isEmpty()
	
	public void push(int data)
	{
		qu.add(data);

		int size = qu.size();
		for(int i=0; i<size-1; i++)
			qu.add(qu.remove());

	}//End of push()	
	
	public int pop() throws Exception
	{
		int retValue;

		if(qu.isEmpty())
			throw new Exception("Stack is empty");
		else
			retValue = qu.remove();

		return retValue;
	}//End of pop()	
	
	public int peek() throws Exception
	{
		if(qu.isEmpty())
			throw new Exception("Stack is empty");

		return qu.peek();
	}//End of peek()

	public int size()
	{
		return qu.size();
	}//End of size()	

	public void display()
	{
		if(qu.isEmpty())
			System.out.println("Stack is empty");
		else
		{
			int size = qu.size();
			for(int i=0; i<size; i++)
			{
				System.out.println(qu.peek());
				qu.add(qu.remove());
			}
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
