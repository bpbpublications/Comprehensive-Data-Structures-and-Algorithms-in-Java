//Ex7.java : Modify the bubble sort given in chapter so that in each pass the sorting is done in both directions.

class BubbleSortDemo
{
	static void bubbleSort(int[] arr, int n)
	{
		int temp, xchanges;

	    for(int i=0; i<n-1 ;i++)
		{
			xchanges=0;
			for(int j=0; j<n-1-i; j++)
			{
				if(arr[j] > arr[j+1])
				{
					temp = arr[j];
					arr[j] = arr[j+1];
					arr[j+1] = temp;
					xchanges++;
				}
			}

			if(xchanges == 0) //If list is sorted
				break;
			
			xchanges=0;
			for(int j=n-1-i; j>i; j--)
			{
				if(arr[j] < arr[j-1])
				{
					temp = arr[j];
					arr[j] = arr[j-1];
					arr[j-1] = temp;
					xchanges++;
				}
			}

			if(xchanges == 0) //If list is sorted
				break;
		
			for(int k=0; k<n; k++)
				System.out.print(arr[k] + " ");
			System.out.println();
		}

	}//End of bubbleSort()

	public static void main(String[] args)
	{	
		int[] arr = {40, 20, 50, 60, 30, 10, 90, 97, 70, 80};

		System.out.println("Unsorted list is :"); 
		for(int i=0; i<arr.length; i++)
			System.out.print(arr[i] + " ");
		System.out.println("\n");

		bubbleSort(arr,arr.length);
		
		System.out.println("\nSorted list is :"); 
		for(int i=0; i<arr.length; i++)
			System.out.print(arr[i] + " ");
		System.out.println();
	}//End of main()
}//End of class BubbleSortDemo