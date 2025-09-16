//Ex17.java : Write a program to sort a list of strings using bubble sort.

class BubbleSortDemo
{
	static void bubbleSort(String[] arr, int n)
	{
		String temp;
		int xchanges;

		for(int i=0; i<n-1; i++)
		{
			xchanges = 0;
			for(int j=0; j<n-1-i; j++)
			{
				if(arr[j].compareTo(arr[j+1]) > 0)
				{
					temp = arr[j];
					arr[j] = arr[j+1];
					arr[j+1] = temp;
					xchanges++;
				}
			}
			if(xchanges == 0) //If list is sorted
				break;
		}//End of for
	}//End of bubbleSort()

	public static void main(String[] args)
	{
		String[] arr = {"Newyork", "Bangalore", "Tokyo", "Paris", "Lucknow"};

		System.out.println("Unsorted list is :");
		for(int i=0; i<arr.length; i++)
			System.out.print(arr[i] + " ");
		System.out.println();

		bubbleSort(arr,arr.length);
		
		System.out.println("Sorted list is :"); 
		for(int i=0; i<arr.length; i++)
			System.out.print(arr[i] + " ");
		System.out.println();
	}//End of main()
}//End of class BubbleSortDemo
