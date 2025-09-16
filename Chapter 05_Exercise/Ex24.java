//Ex24.java : Write a recursive function to reverse the elements of an array.

class Ex24Demo
{
	static void reverse(int[] arr, int low, int high)
	{
		int temp;

		if(low >= high)
			return;

		temp = arr[low];
		arr[low] = arr[high];
		arr[high] = temp;

		reverse(arr, low+1, high-1);

	}//End of reverse()

	public static void main(String[] args)
	{
		int[] arr = {1,2,3,4,5,6,7,8,9,10};
		int n = 10;
		
		System.out.println("The array is :");
		for(int i=0; i<n; i++)
			System.out.print(arr[i] + " ");
		System.out.println();

		reverse(arr, 0, n-1);

		System.out.println("After reverse, the array is :");
		for(int i=0; i<n; i++)
			System.out.print(arr[i] + " ");
		System.out.println();
	}//End of main()
}//End of class Ex24Demo


