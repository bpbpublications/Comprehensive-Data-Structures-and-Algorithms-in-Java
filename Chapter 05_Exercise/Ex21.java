//Ex21.java : Write a recursive function that finds whether a number is perfect or not.

class Ex21Demo
{
	static int divisorsSum(int num, int x)
	{
		if(x == 1)
		{
			System.out.println(x);
			return 1;
		}

		if(num%x == 0) //if x is a proper divisor
		{
			System.out.print(x + " ");
			return x + divisorsSum(num,x-1);
		}
		else
			return divisorsSum(num,x-1);
	}//End of divisorsSum()

	public static void main(String[] args)
	{
		int num = 28;

		if(divisorsSum(num, num/2) == num)
			System.out.println(num + " is a perfect number");
		else
			System.out.println(num + " is not a perfect number\n");
	}//End of main()
}//End of class Ex21Demo