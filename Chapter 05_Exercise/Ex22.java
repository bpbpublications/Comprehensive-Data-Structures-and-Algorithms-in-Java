//Ex22.java : Write a recursive function to find the sum of all even numbers in an array.

class Ex22Demo
{
	static int sumEven(int[] arr, int n)
	{
		if(n == 0)
			return 0;
		
		if(arr[n-1]%2 == 0)
			return arr[n-1] + sumEven(arr, n-1);

		return sumEven(arr, n-1);
	}//End of sumEven()

	public static void main(String[] args)
	{
		int[] arr = {1,2,3,4,5,6,7,8,9,10};
		
		System.out.println("The array is :");
		for(int i=0; i<arr.length; i++)
			System.out.print(arr[i] + " ");
		System.out.println();
		System.out.println("Sum of even numbers = " + sumEven(arr, arr.length));
	}//End of main()
}//End of class Ex22Demo

