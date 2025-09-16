//Ex7.java

class Ex7Demo
{
	static int f(int a, int b) 
	{
		if(b == 0)
			return 0;
		if(b == 1)
			return a;
		return a + f(a, b-1);
	}

	public static void main(String[] args)
	{
		System.out.print(f(3, 8) + " ");
		System.out.print(f(3, 0) + " ");
		System.out.println(f(0, 3));
	}
}