//Ex14.java

class Ex14Demo
{
	static void f1(int n)
	{
		if(n == 0)
			return;
		for(int i=1; i<=n; i++)
			System.out.print("*");
		System.out.println();
		f1(n-1);
	}

	static void f2(int n)
	{
		if(n == 0)
			return;
		f2(n-1);
		for(int i=1; i<=n; i++)
			System.out.print("*");
		System.out.println();	
	}

	public static void main(String[] args)
	{
		f1(4);
		System.out.println();
		f2(4);
	}
}