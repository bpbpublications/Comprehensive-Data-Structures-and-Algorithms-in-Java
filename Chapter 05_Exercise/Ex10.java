//Ex10.java

class Ex10Demo
{
	static int count(long n, int d)
	{
		if(n == 0) 
			return 0;
		else if(n%10 == d)
			return 1 + count(n/10, d);
		else
			return count(n/10, d);
	}

	public static void main(String[] args)
	{
		System.out.println(count(123212, 2));
	}
}