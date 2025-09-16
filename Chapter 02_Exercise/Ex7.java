//Ex7.java : Program to remove duplicate elements from a sorted array.

class Ex7Demo
{
	public static void main(String[] args)
	{
		int[] arr = {5,10,15,15,15,30,35,35,45,50};
		int n = arr.length;

		System.out.println("The array is :");
		for(int i=0; i<n; i++)
			System.out.print(arr[i] + " ");
		System.out.println();

		int k, ndup;
		for(int i=0; i<n; i++)
		{
			if(arr[i]==arr[i+1])
			{
				k=i+1;
				while(k<n && arr[k]==arr[k+1])
					k++;
				//Duplicates of arr[i] start at i+1 and end at k
				ndup=k-i;	//Number of duplicates of arr[i]
				for(k=i+1; k<n; k++)
				{
					if(k+ndup < arr.length)
						arr[k]=arr[k+ndup];
				}
				n=n-ndup;
			}
		}//End of for

		System.out.println("After removing duplicates, the array is :");
		for(int i=0; i<n; i++)
			System.out.print(arr[i] + " ");
		System.out.println();
	}//End of main()
}//End of class Ex7Demo

