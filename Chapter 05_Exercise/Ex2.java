//Ex2.java

class Ex2Demo
{
	static int f(int a, int b)
	{
		if(a > b)
			return 1000;
		return a + f(a+1, b);
	}

	public static void main(String[] args)
	{
		System.out.println(f(3, 8));	
	}
}