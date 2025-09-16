//Ex27.java : Write a recursive function that reverses an integer.

class Ex27Demo
{
	static int reverse(int n, int num) 
	{ 
		if(n == 0)
			return num;

		num = num * 10 + n%10 ;
		return reverse(n/10, num);

	}//End of reverse()

	static int reverse(int n)
	{
		return reverse(n, 0);
	}

	public static void main(String[] args)
	{
		int num = 5678;
		System.out.println("Reverse of " + num + " is : " + reverse(num));
	}//End of main()
}//End of class Ex27Demo







