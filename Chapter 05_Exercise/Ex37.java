//Ex37.java : Write a recursive function to reverse a string.

class Ex37Demo
{
	static StringBuilder reverse(StringBuilder str, int i, int j) 
	{ 
		if(i > j)
			return str;

		char temp = str.charAt(i);
		str.setCharAt(i, str.charAt(j));
        str.setCharAt(j, temp);		

		return reverse(str, i+1, j-1);
	}//End of reverse()

	static StringBuilder reverse(StringBuilder str)
	{
		return reverse(str,0,str.length()-1);
	}//End of reverse()

	public static void main(String[] args)
	{
		StringBuilder str = new StringBuilder("Bangalore");

		System.out.println("String is : " + str);

		System.out.println("After reverse, " + "the string is : " + reverse(str));
	}//End of main()
}//End of class Ex37Demo


