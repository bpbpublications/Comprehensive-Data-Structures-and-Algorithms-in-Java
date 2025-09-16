//Ex29.java : Write a recursive function to find quotient when a positive integer a is divided by positive integer b.

class Ex29Demo
{
	static int getQuotient(int a, int b)
	{
		if(a<b) 
			return 0;
		else 
			return 1+getQuotient(a-b, b);
	}//End of getQuotient()

	public static void main(String[] args)
	{
		int a = 24, b = 5;

		System.out.println("Quotient of " + a + "/" + b + " = " + getQuotient(a,b));
	}//End of main()
}//End of class Ex29Demo


