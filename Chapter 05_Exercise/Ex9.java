//Ex9.java

class Ex9Demo
{
	static int f(int n) 
	{ 
		return (n!=0) ? n%10 + f(n/10) : 0; 
	}

	public static void main(String[] args)
	{
		System.out.println(f(14837));
	}
}