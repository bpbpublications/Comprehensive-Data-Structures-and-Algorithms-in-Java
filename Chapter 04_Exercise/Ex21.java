//Ex21.java : Write a program to convert prefix expression to postfix.

import java.util.Stack;

class PrefixToPostfixDemo
{
	static String prefixToPostfix(String prefix)
	{
		Stack<String> st = new Stack<String>();
		String operand1, operand2;
		char symbol;
		String strin;

		for(int i=prefix.length()-1; i>=0; i--)
		{
			symbol = prefix.charAt(i);
			String temp = "";
			temp += symbol;

			switch(symbol)
			{
			case '+':
			case '-':
			case '*':
			case '/':
			case '%':
			case '^':
				operand1 = st.pop();
				operand2 = st.pop();
				strin = operand1;
				strin = strin + operand2;
				strin = strin + temp;
				st.push(strin);
				break;
			default: //if an operand comes
				    st.push(temp);
			}//End of switch

		}//End of for

		return st.peek();
	}//End of prefixToPostfix()

	public static void main(String[] args)
	{	
		String prefix = "+-+A/BC*DEF";

		System.out.println("Prefix expression is : " + prefix);

		System.out.println("Postfix expression is :");
		System.out.println(prefixToPostfix(prefix));
	}//End of main()	
}//End of class PrefixToPostfixDemo
