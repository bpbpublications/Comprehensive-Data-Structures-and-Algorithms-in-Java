//Ex20.java : program to reverse a portion of an array.

class Ex20Demo
{
	public static void main(String[] args)
	{
		int[] arr = {1,2,3,4,5,6,7,8,9,10};
		int start = 2, end = 6;
		int i,j,temp;

		System.out.println("The array is :");
		for(i=0; i<arr.length; i++)
			System.out.print(arr[i] + " ");
		System.out.println();

		for(i=start-1,j=end-1; i<j; i++,j--)
		{
			temp = arr[i];
			arr[i] = arr[j];
			arr[j] = temp;
		}

		System.out.println("After reversing, the array is :");
		for(i=0; i<arr.length; i++)
			System.out.print(arr[i] + " ");
		System.out.println();
		
	}//End of main()
}//End of class Ex20Demo
