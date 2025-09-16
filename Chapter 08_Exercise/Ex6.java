//Ex6.java : Modify the bubble sort program so that the smallest element is bubbled up in each pass.

class BubbleSortDemo
{
	static void bubbleSort(int[] arr, int n)
	{
		int temp, xchanges;

		for(int i=0; i<n-1; i++)
		{
			xchanges=0;
			for(int j=n-1; j>i; j--)
			{
				if(arr[j] < arr[j-1])
				{
					temp = arr[j];
					arr[j] = arr[j-1];
					arr[j-1] = temp;
					xchanges++;
				}
			}

			if(xchanges==0) //If list is sorted
				break;

			for(int k=0; k<n; k++)
				System.out.print(arr[k] + " ");
			System.out.println();

		}//End of for
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
		System.out.println("\n");	
	}//End of main()
}//End of class BubbleSortDemo


