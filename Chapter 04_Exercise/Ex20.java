//Ex20.java : Write a program to convert postfix expression to prefix.

import java.util.Stack;

class PostfixToPrefixDemo
{
	static String postfixToPrefix(String postfix)
	{
		Stack<String> st = new Stack<String>();
		String operand1, operand2;
		char symbol;
		String strin;

		for(int i=0; i<postfix.length(); i++)
		{
			symbol = postfix.charAt(i);
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
				strin = temp;
				strin = strin + operand2;
				strin = strin + operand1;
				st.push(strin);
				break;
			default: //if an operand comes
				    st.push(temp);
			}//End of switch
		}//End of for

		return st.peek();

	}//End of postfixToPrefix()

	public static void main(String[] args)
	{	
		String postfix = "ABC*-DE-F*G/H/+";

		System.out.println("Postfix expression is : " + postfix);

		System.out.println("Prefix expression is :");
		System.out.println(postfixToPrefix(postfix));	
	}//End of main()
}//End of class PostfixToPrefixDemo