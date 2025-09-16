//Ex23.java : Write a recursive function that finds the sum of all elements of an array by repeatedly partitioning it into two almost equal parts.

class Ex23Demo
{
	static int sum(int[] arr, int low, int high)
	{
		int mid, left, right;
		if(low == high)
			return arr[low];

		mid = (low+high)/2;
		left = sum(arr,low,mid);
		right = sum(arr,mid+1,high);

		return (left+right);
	}//End of sum()

	public static void main(String[] args)
	{
		int[] arr = {1,2,3,4,5,6,7,8,9,10};
		
		System.out.println("The array is :");
		for(int i=0; i<arr.length; i++)
			System.out.print(arr[i] + " ");
		System.out.println();
		System.out.println("Sum = " + sum(arr, 0, arr.length-1));
	}//End of main()
}//End of class Ex23Demo
