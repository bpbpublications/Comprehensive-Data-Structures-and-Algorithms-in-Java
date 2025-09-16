//Ex6.java

class Ex6Demo
{
	static void f1(int a, int b)
	{
		if(a > b)
			return;
		System.out.print(a + " ");
		f1(a+1, b);
	}

	static void f2(int a, int b)
	{
		if(a > b)
			return;
		f2(a+1, b);
		System.out.print(a + " ");
	}

	public static void main(String[] args)
	{
		f1(10, 18); 
		System.out.println();
		f2(10, 18);
		System.out.println();
	}
}