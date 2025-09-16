//Ex41.java : Write a recursive function to find whether a string is palindrome or not.
//Ignore the spaces, punctuations marks, uppercase and lowercase differences in string.

class Ex41Demo
{
	static boolean isPalindrome(String str, int i, int j) 
	{
		if(i > j)
			return true;

		if(str.charAt(i) == ' ' || str.charAt(i)==',' || str.charAt(i)=='"'|| str.charAt(i)=='.'|| str.charAt(i)=='!'|| str.charAt(i)=='-')
			return isPalindrome(str,i+1,j);

		if(str.charAt(j)==' ' || str.charAt(j)==','||  str.charAt(j)=='"'|| str.charAt(j)=='.'|| str.charAt(j)=='!'|| str.charAt(j)=='-')
			return isPalindrome(str,i,j-1);

		if(Character.toUpperCase(str.charAt(i)) != Character.toUpperCase(str.charAt(j)))
			return false;

		return isPalindrome(str,i+1,j-1);

	}//End of findChar()

	static boolean isPalindrome(String str)
	{
		return isPalindrome(str,0,str.length()-1);
	}//End of isPalindrome()

	public static void main(String[] args)
	{
		String str = "A man, a plan, a canal - Panama!";

		System.out.println("The string is : " + str);

		if(isPalindrome(str))
			System.out.println("The string is a palindrome");
		else
			System.out.println("The string is not a palindrome");
	}//End of main()
}//End of class Ex41Demo



