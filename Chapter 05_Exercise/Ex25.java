//Ex25.java : Write a recursive function to find whether the elements of an array are in strict ascending order or not.

class Ex25Demo
{
	static boolean isAscending(int arr[], int i, int n)
	{
		if(n==1)
			return true;
		
		if(arr[i] >= arr[i+1])
			return false;
		
		return isAscending(arr, i+1, n-1);
	}//End of isAscending()

	public static void main(String[] args)
	{
		int[] arr = {1,2,3,4,5,6,7,8,9,10};
		
		System.out.println("The array is :");
		for(int i=0; i<arr.length; i++)
			System.out.print(arr[i] + " ");
		System.out.println();

		if(isAscending(arr, 0, arr.length))
			System.out.println("Array elements are in strict ascending order.");
		else
			System.out.println("Array elements are not in strict ascending order.");
	}//End of main()
}//End of class Ex25Demo

