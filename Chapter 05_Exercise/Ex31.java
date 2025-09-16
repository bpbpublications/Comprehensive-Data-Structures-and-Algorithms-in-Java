//Ex31.java : Write a recursive function to multiply two numbers by Russian peasant method.

class Ex31Demo
{
	static int multiplication(int a, int b) 
	{
		if(a==0) //if we write if(a==1) return b; then 0 * b can not be computed, so this condition
			return 0;

		if(a%2!=0) //if a is odd
	        return b + multiplication(a/2, b*2);

	    return multiplication(a/2, b*2);
	}//End of multiplication()

	public static void main(String[] args)
	{
		int a = 19, b = 25;

		System.out.println(a + "*" + b + " by russian peasant method = " + multiplication(a,b));
	}//End of main()
}//End of class Ex31Demo


