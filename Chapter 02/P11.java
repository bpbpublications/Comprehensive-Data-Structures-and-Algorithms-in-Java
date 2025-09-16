//P11.java : Program to place the biggest element at the last position.
//Count the total number of exchanges done.

class P11Demo
{
	public static void main(String[] args)
    {
		int[] arr = {40, 20, 50, 60, 30, 10, 90, 97, 70, 80};
		int xchanges = 0;

		System.out.println("The array is :");
		for(int i=0; i<arr.length; i++)
			System.out.print(arr[i] + " ");
		System.out.println();

		int temp;
		for(int i=0; i<arr.length-1; i++)
		{
			if(arr[i]>arr[i+1])
			{
				temp = arr[i];
				arr[i] = arr[i+1];
				arr[i+1] = temp;
				xchanges++;
			}
		}

		System.out.println("After exchanges, the array is :");
		for(int i=0; i<arr.length; i++)
			System.out.print(arr[i] + " ");
		System.out.println();

		System.out.println("Total number of exchanges = " + xchanges);

    }//End of main()
}//End of class P11Demo