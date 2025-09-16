//Ex13.java : Modify the insertion sort algorithm to use binary search instead of linear search.

class InsertionSortDemo
{
	static void insertionSort(int arr[], int n)
	{
		int i,j,k;
		int low, up, mid;

		for(i=1; i<n; i++)
		{
			k=arr[i]; //k is to be inserted at proper place
		    low=0; up=i-1;
	        while(low <= up)
		    {   
				mid = (low+up)/2;
				if(k >= arr[mid])
					low = mid+1;	
				else if(k < arr[mid])
					up = mid-1;		
			}

			for(j=i-1; j>=low; j--)
				arr[j+1]=arr[j];
			arr[j+1]=k;

		}//End of for

	}//End of insertionSort()

	public static void main(String[] args)
	{
		int[] arr = {82, 42, 49, 8, 25, 52, 36, 93, 59, 15};

		System.out.println("Unsorted list is :"); 
		for(int i=0; i<arr.length; i++)
			System.out.print(arr[i] + " ");
		System.out.println();

		insertionSort(arr,arr.length);
		
		System.out.println("Sorted list is :"); 
		for(int i=0; i<arr.length; i++)
			System.out.print(arr[i] + " ");
		System.out.println();		
	}//End of main()
}//End of class InsertionSortDemo