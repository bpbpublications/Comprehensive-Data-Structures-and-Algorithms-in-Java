//Ex21.java : Program to rotate left an array by k elements.

class Ex21Demo
{
	//Solution 1 : rotate an array by 1 element k times
	static void rotate1(int[] arr, int k)
	{
		for(int i=0; i<k; i++)
		{
			int temp = arr[0];
			for(int j=1; j<arr.length; j++)
				arr[j-1]=arr[j];
			arr[arr.length-1] = temp;
		}

	}//End of rotate1()

	static void reverse(int[] arr, int start, int end)
	{
		int temp;
		for(int i=start,j=end; i<j; i++,j--)
		{
			temp = arr[i];
			arr[i] = arr[j];
			arr[j] = temp;
		}
	}//End of reverse()

	//Solution 2 : rotate left by k using reverse
	static void rotate2(int arr[], int k)
	{
		reverse(arr, 0, k-1);
		reverse(arr, k, arr.length-1);
		reverse(arr, 0, arr.length-1);

	}//End of rotate2()
	
	public static void main(String[] args)
	{
		int[] arr = {5,10,15,20,25,30,35,40,45,50};
		int k = 5;

		System.out.println("The array is :");
		for(int i=0; i<arr.length; i++)
			System.out.print(arr[i] + " ");
		System.out.println();

		rotate1(arr,k);

		System.out.println("After left rotation " + k + " elements, the array is :");
		for(int i=0; i<arr.length; i++)
			System.out.print(arr[i] + " ");
		System.out.println();

		rotate2(arr,k);

		System.out.println("Again after left rotation " + k + " elements, the array is :");
		for(int i=0; i<arr.length; i++)
			System.out.print(arr[i] + " ");
		System.out.println();
	}//End of main()
}//End of class Ex21Demo
