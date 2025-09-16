//Ex2.java : Write a recursive program for sorting an array through selection sort.

class SelectionSortDemo
{
	static void selectionSort(int[] arr, int start, int end)
	{
		int min, temp; 

		if(start >= end)
			return;
	  
		min = start;
		for(int j=start+1; j<=end; j++)
		{
			if(arr[min] > arr[j])
				min=j ;
		}

		temp = arr[start];
		arr[start] = arr[min];
		arr[min] = temp;        

		selectionSort(arr, start+1, end);

	}//End of selectionSort()

	static void selectionSort(int arr[], int n)
	{
		selectionSort(arr, 0, n-1);
	}//End of selectionSort()

	public static void main(String[] args)
	{
		int[] arr = {82, 42, 49, 8, 25, 52, 36, 93, 59, 15};

		System.out.println("Unsorted list is :"); 
		for(int i=0; i<arr.length; i++)
			System.out.print(arr[i] + " ");
		System.out.println();

		selectionSort(arr,arr.length);
		
		System.out.println("Sorted list is :"); 
		for(int i=0; i<arr.length; i++)
			System.out.print(arr[i] + " ");
		System.out.println();
	}//End of main()
}//End of class SelectionSortDemo

