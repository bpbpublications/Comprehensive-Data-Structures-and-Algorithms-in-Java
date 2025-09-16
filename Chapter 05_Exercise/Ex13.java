//Ex13.java

class Ex13Demo
{
	static int f(String s, int i, char a)
	{
		if(i == s.length())
			return 0;

		if(s.charAt(i) == a)
			return 1 + f(s, i+1, a); 
		return f(s, i+1, a); 
	}

	public static void main(String[] args)
	{
		String str = "data structures and algorithms";
		char a = 't';

		System.out.println(f(str, 0, a));
	}
}