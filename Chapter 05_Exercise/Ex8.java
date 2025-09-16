//Ex8.java

class Ex8Demo
{
	static int count(int n)
	{
		if(n == 0) 
			return 0;
		else 
			return 1 + count(n/10);
	}

	public static void main(String[] args)
	{
		System.out.println(count(17243));
	}
}