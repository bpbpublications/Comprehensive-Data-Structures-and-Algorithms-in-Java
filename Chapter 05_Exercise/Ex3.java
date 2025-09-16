//Ex3.java

class Ex3Demo
{
	static int f(int a)
	{
		if(a == 10)
			return a;
		return a + f(a+1);
	}

	static int f1(int a)
	{
		if(a == 0)
			return a;
		return a + f1(a+1);
	}

	public static void main(String[] args)
	{
		System.out.println(f(6));
		System.out.println(f1(6));
	}
}