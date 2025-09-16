//Ex43.java : Write a function to convert a string of numbers to an integer.

class Ex43Demo
{
	static int stringToNumber(String str, int num, int i) 
	{ 
		if(str.length() == i)
			return num;
		
		num = num*10 + str.charAt(i)-'0';
		
		return stringToNumber(str,num,i+1);

	}//End of stringToNumber()

	static int stringToNumber(String str) 
	{
		return stringToNumber(str,0,0);
	}//End of stringToNumber()

	public static void main(String[] args)
	{
		String str = "12340";
		
		System.out.println("String " + str + " in number : " + stringToNumber(str));
	}//End of main()
}//End of class Ex43Demo

