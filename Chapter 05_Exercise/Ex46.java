//Ex46.java : Write a recursive function that returns nth triangular number.

class Ex46Demo
{
	static int triangularNumber(int n)
	{
		if(n == 1)
			return 1;
		return n + triangularNumber(n-1);
	}//End of triangularNumber()

	public static void main(String[] args)
	{
		int n = 4;

		System.out.println(triangularNumber(n));
	}//End of main()
}//End of class Ex46Demo


