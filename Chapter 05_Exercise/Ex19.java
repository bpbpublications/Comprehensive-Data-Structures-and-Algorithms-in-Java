//Ex19.java : Write a recursive function to count all the prime numbers between numbers a and b (both inclusive).

class Ex19Demo
{
	static boolean isPrime(int n)
	{
		if(n < 2)
			return false;

		for(int i=2; i<=(n/2); i++)	
			if(n%i == 0)
			    return false;

		return true;
	}//End of isPrime()

	static int countPrimes(int a, int b)
	{
		if(a > b)
			return 0;
		if(isPrime(b))
		{
			System.out.print(b + " ");
			return 1 + countPrimes(a,b-1);
		}
		else
			return countPrimes(a,b-1);
	}//End of countPrimes()

	public static void main(String[] args)
	{
		int a = 1, b = 20;
		System.out.println("\nTotal prime numbers between " + a + " and " + b + " is : " + countPrimes(a,b));
	}//End of main
}//End of class Ex19Demo