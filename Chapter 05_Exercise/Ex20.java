//Ex20.java : Write a recursive function that displays all the proper divisors of a number and returns their sum.

class Ex20Demo
{
	static int divisorsAndSum(int num, int x)
	{
		if(x==1)
		{
			System.out.println(x);
			return 1;
		}

		if(num%x==0) //if x is a proper divisor
		{
			System.out.print(x + " ");
			return x + divisorsAndSum(num,x-1);
		}
		else
			return divisorsAndSum(num,x-1);
	}//End of divisorsAndSum()

	public static void main(String[] args)
	{
		int num = 24;
		System.out.println("Sum of divisors of " + num + " = " + divisorsAndSum(num,num/2));
	}//End of main()
}//End of class Ex20Demo
