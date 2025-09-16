//Ex3.java : Write a program to sort an array in descending order using selection sort.

class SelectionSortDemo
{
	static void selectionSort(int[] arr, int n)
	{
		int max, temp;

		for(int i=0; i<n-1; i++)
		{
			//Find the index of largest element
			max = i;
			for(int j=i+1; j<n ; j++)
			{
				if(arr[max] < arr[j])
					max = j;
			}

			if(i != max)
			{
				temp = arr[i];
				arr[i] = arr[max];
				arr[max] = temp ;
			}
		}//End of for
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