//Ex16.java : Write a program to print all the prime factors of a number in descending order using a stack.

import java.util.Stack;

class StackDemo
{
	static void primeFactors(int num)
	{
		Stack<Integer> st = new Stack<Integer>();

		for(int i=2; num!=1; i++)
		{
			while(num%i == 0)
			{
				st.push(i);	
				num = num/i;
			}
		}

		while(!st.empty())
			System.out.print(st.pop() + " ");
		System.out.println();

	}//End of primeFactors()

	public static void main(String[] args)
	{
		int num = 60;

		System.out.println("Prime factors of " + num + " are :");
		primeFactors(num);
	}//End of main()
}//End of class StackDemo
