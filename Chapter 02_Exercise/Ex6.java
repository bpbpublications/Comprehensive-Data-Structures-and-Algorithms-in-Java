//Ex6.java : Program to remove duplicate elements from an unsorted array.

class Ex6Demo
{
	public static void main(String[] args)
	{
		int[] arr = {10,5,20,10,30,5,20,35,5,45};
		int n = arr.length;
		
		System.out.println("The array is :");
		for(int i=0; i<arr.length; i++)
			System.out.print(arr[i] + " ");
		System.out.println();

		for(int i=0; i<n; i++)
		{
			for(int j=i+1; j<n;  )
			{
				if(arr[i]==arr[j]) //Duplicate found
				{
					n--;
					for(int k=j; k<n; k++)
						arr[k]=arr[k+1];
				}
				else
					j++;	//Continue comparing
			}
		}//End of for

		System.out.println("After removing duplicates, the array is :");
		for(int i=0; i<n; i++)
			System.out.print(arr[i] + " ");
		System.out.println();
	}//End of main()
}//End of class Ex6Demo
