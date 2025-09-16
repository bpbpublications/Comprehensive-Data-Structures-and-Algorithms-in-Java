//Ex33.java : Write a recursive function to find the Binomial coefficient C(n,k).

class Ex33Demo
{
	static int BC(int n, int k)
	{
		if(k==0 || k==n)
			return 1;

		return BC(n-1,k-1) + BC(n-1,k);
	}//End of BC()

	public static void main(String[] args)
	{
		int n = 3, k = 2;

		System.out.println("C(" + n + "," + k + ") = " + BC(n,k));
	}//End of main()
}//End of class Ex33Demo


