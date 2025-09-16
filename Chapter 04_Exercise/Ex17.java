//Ex17.java : Write a program for converting an infix expression to prefix and evaluating that prefix expression.
//It will evaluate only single digit numbers.

import java.util.Stack;

class InfixToPrefixDemo
{
	static int power(int b, int a)
	{
		int result=1;

		for(int i=1; i<=a; i++)
			result *= b;

		return result;
	}//End of power()

	static int evaluatePrefix(String prefix)
	{
		int a,b,temp=0,result;
		int i;
		Stack<Integer> st = new Stack<Integer>();
		
		for(i=prefix.length()-1; i>=0; i--)
		{
			if(prefix.charAt(i)<='9' && prefix.charAt(i)>='0')
				st.push(prefix.charAt(i)-48);
			else
			{
				b = st.pop();
				a = st.pop();
				switch(prefix.charAt(i))
				{
				case '+':
					temp = b+a; break;
				case '-':
					temp = b-a; break;
				case '*':
					temp = b*a; break;
				case '/':
					temp = b/a; break;
				case '%':
					temp = b%a; break;
				case '^':
					temp = power(b,a);
				}
				st.push(temp);
			}//End of else
		}//End of for

		result = st.pop();

		return result;
	}//End of evaluatePrefix()
	
	//This method returns the precedence of the operator
	static int precedence(char symbol )
	{
		switch(symbol)
		{
		case ')':
			return 0;
		case '+':
		case '-':
			return 1;
		case '*':
		case '/':
		case '%':
			return 2;
		case '^':
			return 3;
		default : 
			 return 0;
		}//End of switch
	}//End of precedence()	
	
	static String infixToPrefix(String infix)
	{
		String prefix = "";
		Stack<Character> st = new Stack<Character>();
		int i,n;
		char next ;
		char symbol;	

		n = infix.length();
		
		for(i=n-1; i>=0; i--)
		{
			symbol=infix.charAt(i);
			switch(symbol)
			{
			case ')':
				st.push(symbol);
				break;
			case '(':
				while((next=st.peek()) != ')')
				{
					prefix += next;
					st.pop();
				}
				st.pop();
				break;
			case '+':
			case '-':
			case '*':
			case '/':
			case '%':
			case '^':
				while(!st.empty() &&  precedence(st.peek()) > precedence(symbol) )
					prefix += st.pop();
				st.push(symbol);
				break;
			default: //if an operand comes
				    prefix += symbol;
			}//End of switch
		}//End of for

		while(!st.empty())
			prefix += st.pop();
		
		StringBuilder sb = new StringBuilder(prefix);
		prefix = sb.reverse().toString();
		
		return prefix;
	}//End of infixToPrefix()	
	
	public static void main(String[] args)
	{
		String infix = "7+5*3^2/(9-2^2)+6*4";
		String prefix;

		System.out.println("Infix expression is : " + infix);

		prefix = infixToPrefix(infix);

		System.out.println("Prefix expression is :");
		System.out.println(prefix);

		System.out.println("Value of expression is :");
		System.out.println(evaluatePrefix(prefix));

	}//End of main()
}//End of class InfixToPrefixDemo





