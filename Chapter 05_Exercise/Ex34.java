//Ex34.java : Write a recursive function to compute Ackermann’s function A(m,n).

class Ex34Demo
{
	static int A(int m, int n)
	{
		if(m==0) 
			return n+1;
		else if(n==0)
			return A(m-1,1);
		else
			return A(m-1,A(m,n-1)); 
	}//End of A()

	public static void main(String[] args)
	{
		int m = 3, n = 2;

		System.out.println("A(" + m + "," + n + ") = " + A(m,n));
	}//End of main()
}//End of Ex34Demo


