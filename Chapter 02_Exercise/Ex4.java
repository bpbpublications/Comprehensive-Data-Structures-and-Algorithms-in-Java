//Ex4.java : Program to reverse only first k elements of an array.

class Ex4Demo
{
	public static void main(String[] args)
	{
		int[] arr = {95,67,32,35,44,65,59,17,20,37};
		int k = 5;
		int i,j,temp;

		System.out.println("The array is :");
		for(i=0; i<arr.length; i++)
			System.out.print(arr[i] + " ");
		System.out.println();

		for(i=0,j=k-1; i<j; i++,j--)
		{
			temp = arr[i];
			arr[i] = arr[j];
			arr[j] = temp;
		}

		System.out.println("After reverse of first " + k + " elements, the array is :");
		for(i=0; i<arr.length; i++)
			System.out.print(arr[i] + " ");
		System.out.println();
	}//End of main()
}//End of class Ex4Demo
