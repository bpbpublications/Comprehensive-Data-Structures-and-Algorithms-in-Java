//Ex38.java : Write a recursive function to return the index of first occurrence of a character in a string.

class Ex38Demo
{
	static int findChar(String str, char ch, int i) 
	{
		if(str.length() == i)
			return -1;

		if(str.charAt(i) == ch)
			return i;

		return findChar(str,ch,i+1);

	}//End of findChar()

	static int findChar(String str,char ch)
	{
		return findChar(str,ch,0);
	}//End of findChar()

	public static void main(String[] args)
	{
		String str = "This is coding";
		char ch = 'i';

		System.out.println("String is : " + str + ", character is : " + ch);

		System.out.println("Index is : " + findChar(str,ch));
	}//End of main()
}//End of class Ex38Demo



