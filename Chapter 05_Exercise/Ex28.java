//Ex28.java : Write a recursive function to find remainder when a positive integer a is divided by positive integer b.

class Ex28Demo
{
	static int getRemainder(int a, int b)
	{
		if(a<b) 
			return a;
		else 
			return getRemainder(a-b, b);
	}//End of getRemainder()

	public static void main(String[] args)
	{
		int a = 24, b = 5;

		System.out.println("Remainder of " + a + "/" + b + " = " + getRemainder(a,b));
	}//End of main()
}//End of class Ex28Demo

