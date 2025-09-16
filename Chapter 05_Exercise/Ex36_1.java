//Ex36_1.java : Write a recursive function to replace each occurrence of a character by another character in a string.

class Ex36_1Demo
{
	static String replaceCharInStr(String str, char a, char b, int i) 
	{ 
		if(str.length() == i)
			return str;

		if(str.charAt(i) == a)
				str = str.substring(0,i) + b + str.substring(i+1,str.length());
	
		return replaceCharInStr(str,a,b,i+1);

	}//End of replaceCharInStr()

	static String replaceCharInStr(String str, char a, char b)
	{
		return replaceCharInStr(str,a,b,0);
	}//End of replaceCharInStr()

	public static void main(String[] args)
	{
		String str = "This is recursion";

		System.out.println("String is : " + str);
		char a = 'i', b = 'e';

		System.out.println("After replacing " + a + " with " + b + ", the string is : " + replaceCharInStr(str, a, b));
	}//End of main()
}//End of class Ex36_1Demo
