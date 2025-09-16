//Ex35.java : Write a recursive function to count the number of vowels in a string.

class Ex35Demo
{
	static int countVowels(String str, int i) 
	{ 
		if(str.length() == i)
			return 0;

		switch(str.charAt(i))
	    { 
		    case 'A': case 'a':
			case 'E': case 'e':
			case 'I': case 'i':
			case 'O': case 'o':
			case 'U': case 'u':
	             return 1 + countVowels(str,i+1);
			default:
	             return countVowels(str,i+1);
	    }
	}//End of countVowels()

	static int countVowels(String str)
	{
		return countVowels(str,0);
	}//End of countVowels()

	public static void main(String[] args)
	{
		String str = "This is recursion";

		System.out.println("String is : " + str);
		System.out.println("Number of vowels : " + countVowels(str));
	}//End of main()
}//End of class Ex35Demo

