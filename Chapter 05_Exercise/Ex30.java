//Ex30.java : Write a recursive function to compute a^n.

class Ex30Demo
{
	static int compute(int a, int b)
	{
		if(b==0) 
			return 1;
		else if (b%2==0) 
			return compute(a*a, b/2);
		else 
			return a * compute(a*a, (b-1)/2);
	}//End of compute()

	public static void main(String[] args)
	{
		int a = 2, b = 5;

		System.out.println(a + "^" + b + " = " + compute(a,b));
	}//End of main()
}//End of class Ex30Demo




