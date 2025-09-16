//Ex12.java : Copy the contents of a stack S1 to another stack S2 using one temporary stack.

class Stack
{
	private static final int MAX_SIZE = 5;
	private	int[] stackArray;
	private int top;

	public Stack()
	{
		stackArray = new int[MAX_SIZE];
		top = -1;
	}//End of Stack()
	
	public boolean isEmpty()
	{
		return (top == -1);
	}//End of isEmpty()	
	
	boolean isFull()
	{
		return (top == MAX_SIZE-1);
	}//End of isFull()
	
	public void push(int data)
	{
		if(isFull())
			System.out.println("Stack Overflow");
		else
		{
			top++;
			stackArray[top] = data;
		}
	}//End of push()
	
	public int pop() throws Exception
	{
		if(isEmpty())
			throw new Exception("Stack is empty");

		int retValue = stackArray[top];
		top = top-1;

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
		return (top+1);
	}//End of size()

	public void display()
	{
		if(isEmpty())
			System.out.println("Stack is empty");
		else
			for(int i=top; i>=0; i--)
				System.out.println(stackArray[i]);
	}//End of display()	

}//End of class Stack

class StackDemo
{
	public static void main(String[] args)
	{
		Stack st1 = new Stack();
		Stack st2 = new Stack();
		Stack temp = new Stack();

		try
		{
			st1.push(10);
			st1.push(20);
			st1.push(30);
			st1.push(40);
			st1.push(50);
	
			System.out.println("Stack1 Items :");
			st1.display();

			while(!st1.isEmpty())
				temp.push(st1.pop());
	
			System.out.println("Temporary stack items :");
			temp.display();
	
			while(!temp.isEmpty())
			{
				st1.push(temp.peek());
				st2.push(temp.peek());
				temp.pop();
			}
	
			System.out.println("Stack1 Items :");
			st1.display();
	
			System.out.println("Stack2 Items :");
			st2.display();
		}
		catch(Exception e)
		{
			System.out.println(e.getMessage());
		}

	}//End of main()
}//End of class StackDemo
