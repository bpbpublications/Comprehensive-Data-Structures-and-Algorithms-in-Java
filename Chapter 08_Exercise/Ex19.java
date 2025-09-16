//Ex19.java : Program to partition an array such that all the even numbers are on the left side of array and odd numbers on the right 
//side.

class PartitionEvenOddDemo
{
	static void partition(int arr[],int n)
	{
		int i=0, j=n-1, temp;
		while(i < j)
		{
			while((arr[i]%2)==0 && i<j) //move right
				i++;
			while((arr[j]%2)!=0 && i<j) //move left
				j--;
			if(i < j) 
			{
				temp = arr[i];
				arr[i] = arr[j];
				arr[j] = temp;
				i++; j--;
			}
		}//End of while
	}//End of partition()

	public static void main(String[] args)
	{
		int[] arr = {1,2,3,4,5,6,7,8,9,10};
		
		System.out.println("The array is :");
		for(int i=0; i<arr.length; i++)
			System.out.print(arr[i] + " ");
		System.out.println();

		partition(arr,arr.length);

		System.out.println("After movement, the array is :");
		for(int i=0; i<arr.length; i++)
			System.out.print(arr[i] + " ");
		System.out.println();

	}//End of main()
}//End of class PartitionEvenOddDemo