//Ex4.java

class Ex4Demo
{
	static int f(int a, int b)
	{
		if(a == b)
			return a;
		return a + b + f(a+1, b-1);
	}

	public static void main(String[] args)
	{
		System.out.println(f(4, 8));
		System.out.println(f(3, 8));
	}
}