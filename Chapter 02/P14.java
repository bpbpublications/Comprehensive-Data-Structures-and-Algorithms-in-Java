//P14.java : Program to print prime numbers using Sieve of Eratosthenes.

class P14Demo
{
	private static final int MAX_SIZE = 1000;
	
	public static void main(String[] args)
    {
		int[] arr = new int[MAX_SIZE];
		int n = 50;
		int p = 2, i;

		while(p*p <= n) 
		{
			for(i=2; i*p<=n; i++) //Cross out all multiples of p
				arr[i*p] = 1;
					
			for(i=p+1; i<=n; i++) //Find next uncrossed
			{
				if(arr[i] == 0)
				{
					p = i;
					break;
				}
			}
		}//End of while

		//Print all uncrossed integers
		for(i=2; i<=n; i++)
		{
			if(arr[i] == 0)
				System.out.print(i + " ");
		}
		System.out.println();

    }//End of main()
}//End of class P14Demo
