//Ex5.java : Program to check whether all the elements of an array are distinct.

class Ex5Demo
{
	public static void main(String[] args)
	{
		int[] arr = {10,5,20,15,30,25,40,35,50,45};
		boolean duplicateFound = false;

		System.out.println("The array is :");
		for(int i=0; i<arr.length; i++)
			System.out.print(arr[i] + " ");
		System.out.println();

		for(int i=0; i<arr.length; i++)
			for(int j=i+1; j<arr.length; j++)
				if(arr[i] == arr[j])
					duplicateFound = true;

		if(duplicateFound)
			System.out.println("All the elements of array are not distinct.");
		else
			System.out.println("All the elements of array are distinct.");
	}//End of main()
}//End of class Ex5Demo

