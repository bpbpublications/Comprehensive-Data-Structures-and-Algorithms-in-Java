//Ex17.java : Write a recursive function to add array of n numbers.

class Ex17Demo
{
	static int	addNumbers(int[] arr, int n)
	{
		if(n == 0)
		    return 0;
		else
		    return arr[n-1] + addNumbers(arr, n-1);
	}//End of addNumbers()

	public static void main(String[] args)
	{
		int[] arr = {1,2,3,4,5,6,7,8,9,10};

		System.out.println("Array numbers :");
		for(int i=0; i<arr.length; i++)
			System.out.print(arr[i] + " ");
		System.out.println();

		System.out.println("Sum of array numbers = " + addNumbers(arr,arr.length));
	}//End of main()
}//End of class Ex17Demo







