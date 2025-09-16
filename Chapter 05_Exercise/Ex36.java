//Ex36.java : Write a recursive function to replace each occurrence of a character by another character in a string.

class Ex36Demo
{
	static StringBuilder replaceCharInStr(StringBuilder str, char a, char b, int i) 
	{ 
		if(str.length() == i)
			return str;

		if(str.charAt(i) == a)
				str.setCharAt(i,b);
	
		return replaceCharInStr(str,a,b,i+1);

	}//End of replaceCharInStr()

	static StringBuilder replaceCharInStr(StringBuilder str, char a, char b)
	{
		return replaceCharInStr(str,a,b,0);
	}//End of replaceCharInStr()

	public static void main(String[] args)
	{
		StringBuilder str = new StringBuilder("This is recursion");

		System.out.println("String is : " + str);
		char a = 'i', b = 'e';

		System.out.println("After replacing " + a + " with " + b + ", the string is : " + replaceCharInStr(str, a, b));
	}//End of main()
}//End of class Ex36Demo










