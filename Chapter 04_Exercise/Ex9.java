//Ex9.java : Reverse a stack using two stacks.

class Stack
{
	private static final int MAX_SIZE = 30;
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
		Stack st = new Stack();
		Stack temp1 = new Stack();
		Stack temp2 = new Stack();

		try
		{
			st.push(10);
			st.push(20);
			st.push(30);
			st.push(40);
			st.push(50);
	
			System.out.println("Stack Items :");
			st.display();
	
			while(!st.isEmpty())
				temp1.push(st.pop());
	
			System.out.println("Temp1 stack items :");
			temp1.display();
	
			while(!temp1.isEmpty())
				temp2.push(temp1.pop());
	
			System.out.println("Temp2 stack items :");
			temp2.display();
	
			while(!temp2.isEmpty())
				st.push(temp2.pop());
	
			System.out.println("Reversed stack items :");
			st.display();
		}
		catch(Exception e)
		{
			System.out.println(e.getMessage());
		}

	}//End of main()
}//End of class StackDemo
