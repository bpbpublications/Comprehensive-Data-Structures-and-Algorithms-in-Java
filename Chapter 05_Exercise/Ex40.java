//Ex40.java : Write a recursive function to find whether a string is palindrome or not.

class Ex40Demo
{
	static boolean isPalindrome(String str, int i, int j) 
	{
		if(i > j)
			return true;

		if(str.charAt(i) != str.charAt(j))
			return false;

		return isPalindrome(str,i+1,j-1);

	}//End of isPalindrome()

	static boolean isPalindrome(String str)
	{
		return isPalindrome(str,0,str.length()-1);
	}//End of isPalindrome()

	public static void main(String[] args)
	{
		String str = "abcba";

		System.out.println("The string is : " + str);

		if(isPalindrome(str))
			System.out.println("The string is a palindrome");
		else
			System.out.println("The string is not a palindrome");
	}//End of main()
}//End of class Ex40Demo
