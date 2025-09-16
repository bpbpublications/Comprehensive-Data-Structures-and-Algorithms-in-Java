//Ex32.java : Write recursive functions to find values of floor of log N base 2 and floor of log N base b.

class Ex32Demo
{
	static int log2(int num) 
	{ 
	      if(num == 1) 
	           return 0;
	      return 1 + log2(num/2);
	}//End of log2()

	static int logN(int num,int base) 
	{ 
	      if(num < base) 
	           return 0;
	     return 1 + logN(num/base,base);
	}//End of logN()

	public static void main(String[] args)
	{
		int n = 8;
		System.out.println("Floor of log " + n + " base " + 2 + " = " + log2(n));

		n = 81;
		int b = 3;
		System.out.println("Floor of log " + n + " base " + b + " = " + logN(n,b));
	}//End of main()
}//End of class Ex32Demo


