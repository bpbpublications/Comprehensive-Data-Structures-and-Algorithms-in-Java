//Ex15.java : Write a program to convert a decimal number to binary using a stack.

import java.util.Stack;

class StackDemo
{
	static long decimalToBinary(int num)
	{
		Stack<Integer> st = new Stack<Integer>();
		int rem;

		while(num!=0)
		{
			rem = num%2;
			st.push(rem);
			num/=2;
		}

		long result = 0;
		while(!st.empty())
		{
			result = result*10 + st.peek();
			st.pop();
		}

		return result;
	}//End of decimalToBinary()	
	
	public static void main(String[] args)
	{
		int num = 10;

		System.out.println("Decimal Number : " + num + ", Binary is " + decimalToBinary(num));
	}//End of main()
}//End of class StackDemo
