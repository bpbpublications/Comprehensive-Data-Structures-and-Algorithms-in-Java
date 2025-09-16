//Ex42.java : Write a function to convert a positive integer to string.

class Ex42Demo
{
	static StringBuilder numberToString(StringBuilder str, int n) 
	{ 
		if(n==0)
			return str;
	
		numberToString(str,n/10);
		
		return str.append((char)(n%10+'0'));		
	}//End of numberToString()

	static StringBuilder numberToString(int n) 
	{
		StringBuilder str = new StringBuilder();
		return numberToString(str,n);
	}//End of numberToString()

	public static void main(String[] args)
	{
		int num = 12340;
		System.out.println(num + " in string : " + numberToString(num));
	}//End of main()
}//End of class Ex42Demo

