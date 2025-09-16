//Ex4.java : Modify the selection sort program given in the chapter so that in each pass the larger element moves towards the end.

class SelectionSortDemo
{
	static void selectionSort(int[] arr, int n)
	{
		int max, temp;

		for(int i=n-1; i>0; i--)
		{
			//Find the index of largest element
			max=i;
			for(int j=i-1; j>=0; j--)
			{
				if(arr[max] < arr[j])
					max=j ;
			}

			if(i!=max)
			{
				temp = arr[i];
				arr[i] = arr[max];
				arr[max] = temp ;
			}

			for(int k=0; k<n; k++)
				System.out.print(arr[k] + " ");
			System.out.println();
		}//End of for
	}//End of selectionSort()
	
	public static void main(String[] args)
	{
		int[] arr = {82, 42, 49, 8, 25, 52, 36, 93, 59, 15};

		System.out.println("Unsorted list is :"); 
		for(int i=0; i<arr.length; i++)
			System.out.print(arr[i] + " ");
		System.out.println("\n");

		selectionSort(arr,arr.length);
		
		System.out.println("\nSorted list is :"); 
		for(int i=0; i<arr.length; i++)
			System.out.print(arr[i] + " ");
		System.out.println();
	}//End of main()
}//End of class SelectionSortDemo
