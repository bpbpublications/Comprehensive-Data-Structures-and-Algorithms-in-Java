//Ex4.java : Write a program to implement 2 stacks in a single array of size N.

class Stack
{
	private static final int MAX_SIZE = 10;
	private	int[] stackArray;	
	int topA;
	int topB;

	public Stack()
	{
		stackArray = new int[MAX_SIZE];
		topA = -1;
		topB = MAX_SIZE;
	}//End of Stack()
		
	public boolean isFull()
	{
		return (topA == topB-1);
	}//End of isFull()	
	
	public void pushA(int data)
	{
		if(isFull())
			System.out.println("Stack Overflow");
		else
		{
			topA++;
			stackArray[topA] = data;
		}
	}//End of pushA()	
	
	public void pushB(int data)
	{
		if(isFull())
			System.out.println("Stack Overflow");
		else
		{
			topB--;
			stackArray[topB] = data;
		}
	}//End of pushB()	
	
	public int popA() throws Exception
	{
		if(topA==-1)
			throw new Exception("Stack is empty");

		int retValue = stackArray[topA];
		topA = topA-1;

		return retValue;
	}//End of popA()
	
	public int popB() throws Exception
	{
		if(topB==MAX_SIZE)
			throw new Exception("Stack is empty");

		int retValue = stackArray[topB];
		topB = topB+1;

		return retValue;
	}//End of popB()	
	
	public void displayA()
	{
		if(topA==-1)
			System.out.println("StackA is empty");
		else
			for(int i=topA; i>=0; i--)
				System.out.println(stackArray[i]);

	}//End of displayA()

	public void displayB()
	{
		if(topB==MAX_SIZE)
			System.out.println("StackB is empty");
		else
			for(int i=topB; i<MAX_SIZE; i++)
				System.out.println(stackArray[i]);

	}//End of displayA()	
	
}//End of class Stack

class StackDemo
{
	public static void main(String[] args)
	{
		Stack st = new Stack();

		try
		{
			st.pushA(1);
			st.pushA(2);
			st.pushA(3);
			st.pushA(4);

			System.out.println("StackA Items :");
			st.displayA();

			System.out.println("StackA Popped Item : " + st.popA());
			System.out.println("StackA Items :");
			st.displayA();

			st.pushA(4);
			st.pushA(5);

			System.out.println("StackA Items :");
			st.displayA();

			st.pushB(6);
			st.pushB(7);
			st.pushB(8);
			st.pushB(9);

			System.out.println("StackB Items :");
			st.displayB();

			System.out.println("StackB Popped Item : " + st.popB());
			System.out.println("StackB Items :");
			st.displayB();

			st.pushB(9);
			st.pushB(10);

			System.out.println("StackB Items :");
			st.displayB();

			st.pushA(11);
			st.pushB(12);

			System.out.println("StackA Popped Item : " + st.popA());
			System.out.println("StackA Popped Item : " + st.popA());
			System.out.println("StackA Popped Item : " + st.popA());
			System.out.println("StackA Popped Item : " + st.popA());
			System.out.println("StackA Popped Item : " + st.popA());

			System.out.println("StackA Items :");
			st.displayA();

			System.out.println("StackB Popped Item : " + st.popB());
			System.out.println("StackB Popped Item : " + st.popB());
			System.out.println("StackB Popped Item : " + st.popB());
			System.out.println("StackB Popped Item : " + st.popB());
			System.out.println("StackB Popped Item : " + st.popB());

			System.out.println("StackB Items :");
			st.displayB();

		}//End of try
		catch(Exception e)
		{
			System.out.println(e.getLocalizedMessage());
		}
	}//End of main()
}//End of class StackDemo

