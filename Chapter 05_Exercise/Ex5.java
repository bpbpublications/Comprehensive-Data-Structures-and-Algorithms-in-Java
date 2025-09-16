//Ex5.java

class Ex5Demo
{
	static void f1(int a, int b)
	{
		if(a > b)
			return;
		System.out.print(b + " ");
		f1(a, b-1);
	}

	static void f2(int a, int b)
	{
		if(a > b)
			return;
		f2(a, b-1);
		System.out.print(b + " ");
	}

	public static void main(String[] args)
	{
		f1(10, 18); 
		System.out.println();
		f2(10, 18);
		System.out.println();
	}
}