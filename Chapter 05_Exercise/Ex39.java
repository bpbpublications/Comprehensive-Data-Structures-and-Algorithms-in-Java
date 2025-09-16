//Ex39.java : Write a recursive function to return the index of last occurrence of a character in a string.

class Ex39Demo
{
	static int findChar(String str, char ch, int i) 
	{
		if(i == 0)
			return -1;

		if(str.charAt(i-1) == ch)
			return i-1;

		return findChar(str,ch,i-1);

	}//End of findChar()

	static int findChar(String str, char ch)
	{
		return findChar(str,ch,str.length());
	}//End of findChar()

	public static void main(String[] args)
	{
		String str = "This is coding";
		char ch = 'i';

		System.out.println("String is : " + str + ", character is : " + ch);

		System.out.println("Index is : " + findChar(str,ch));
	}//End of main()
}//End of class Ex39Demo



