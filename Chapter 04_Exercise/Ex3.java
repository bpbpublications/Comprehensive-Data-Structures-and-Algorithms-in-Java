//Ex3.java : Implement a stack in an array such that the stack starts from the last position of array.

class Stack
{
	private static final int MAX_SIZE = 5;
	private	int[] stackArray;
	private int top;

	public Stack()
	{
		stackArray = new int[MAX_SIZE];
		top = MAX_SIZE;
	}//End of Stack()	
	
	public boolean isEmpty()
	{
		return (top == MAX_SIZE);
	}//End of isEmpty()
	
	public boolean isFull()
	{
		return (top == 0);
	}//End of isFull()	
	
	public void push(int data)
	{
		if(isFull())
			System.out.println("Stack Overflow");
		else
		{
			top--;
			stackArray[top] = data;
		}
	}//End of push()	
	
	public int pop() throws Exception
	{
		if(isEmpty())
			throw new Exception("Stack is empty");

		int retValue = stackArray[top];
		top = top+1;

		return retValue;
	}//End of pop()
	
	public int peek() throws Exception
	{
		if(isEmpty())
			throw new Exception("Stack is empty");

		return stackArray[top];
	}//End of peek()	
	
	public int size()
	{
		return (MAX_SIZE-top);
	}//End of size()
	
	public void display()
	{
		if(isEmpty())
			System.out.println("Stack is empty");
		else
			for(int i=top; i<MAX_SIZE; i++)
				System.out.println(stackArray[i]);
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
			System.out.println("Is stack full : " + ((st.isFull()) ? "True" : "False"));

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






