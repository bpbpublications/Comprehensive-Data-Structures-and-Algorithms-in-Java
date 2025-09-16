// Ex1.java

class Ex1Demo
{
	static int f1(int a, int b)
	{
		if(a > b)
			return 0;
		return b + f1(a, b-1);
	}

	static int f2(int a, int b)
	{
		if(a > b)
			return 0;
		return a + f2(a+1, b);
	}	

	public static void main(String[] args)
	{
		System.out.println(f1(3, 8) + " " + f2(3, 8));
	}
}