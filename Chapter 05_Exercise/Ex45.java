//Ex45.java : Write a function to print pyramids of numbers.

class Ex45Demo
{
	static void pyramid1(int n)
	{
		int i;
		if(n==0)
			return;
	    else
		{
			pyramid1(n-1);
			for(i=1; i<= n; i++)
				System.out.print(i + " ");
			System.out.println();	
		}
	}//End of pyramid1()

	static void pyramid2(int n)
	{
		int i;
		if(n==0)
			return;
	    else
		{
			for(i=1; i<=n; i++)
				System.out.print(i + " ");
			System.out.println();	
			pyramid2(n-1);
		}
	}//End of pyramid2()

	static void pyramid3(int n)
	{
		int i;
		if(n==0)
			return;
	    else
		{
			for(i=n; i>=1; i--)
				System.out.print(i + " ");
			System.out.println();
			pyramid3(n-1);
		}
	}//End of pyramid3()

	public static void main(String[] args)
	{
		pyramid1(4);
		System.out.println();
		pyramid2(4);
		System.out.println();
		pyramid3(4);
	}//End of main()
}//End of class Ex45Demo

