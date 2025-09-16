//Ex19.java : Program to find the kth smallest element in an array.

class Ex19Demo
{
	public static void main(String[] args)
	{
		int[] arr = {5,15,10,25,30,35,20,40,50,45};
		int k = 5;
		int min, temp;

		System.out.println("The array is :");
		for(int i=0; i<arr.length; i++)
			System.out.print(arr[i] + " ");
		System.out.println();

	    for(int i=0; i<k; i++) //Selection sort upto k only
		{
			min=i;
			for(int j=i+1; j<arr.length; j++)
			{
				if(arr[min] > arr[j])
					min=j ;
			}
			if(i!=min)
			{
				temp=arr[i];
				arr[i]=arr[min];
				arr[min]=temp;
			}
		}

	    System.out.println(k + "th smallest element is : " + arr[k-1]);
	}//End of main()
}//End of class Ex19Demo


