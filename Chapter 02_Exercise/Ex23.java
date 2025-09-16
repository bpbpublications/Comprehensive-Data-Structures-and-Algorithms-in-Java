//Ex23.java : Write a program to display union of two arrays i.e. all elements of both arrays and if an element is repeated in both arrays, then display it only once.

class Ex23Demo
{
	static boolean isPresent(int data, int[] arr1)
	{
		for(int i=0; i<arr1.length; i++)
		{
			if(arr1[i] == data)
				return true;
		}

		return false;
	}//End of isPresent()

	static void unionArrays(int[] arr1,int[] arr2)
	{
		for(int i=0; i<arr1.length; i++)
			System.out.print(arr1[i] + " ");

		for(int i=0; i<arr2.length; i++)
		{
			if(!isPresent(arr2[i], arr1))
				System.out.print(arr2[i] + " ");
		}
		System.out.println();
	}//End of unionArrays()	
	
	public static void main(String[] args)
	{
		int[] arr1 = {10, 20, 30, 40, 50, 60};
		int[] arr2 = {10, 15, 30, 35, 50, 60};

		System.out.println("Array 1 :");
		for(int i=0; i<arr1.length; i++)
			System.out.print(arr1[i] + " ");
		System.out.println();

		System.out.println("Array 2 :");
		for(int i=0; i<arr2.length; i++)
			System.out.print(arr2[i] + " ");
		System.out.println();

		System.out.println("Union of Array 1 and Array 2 is :");
		unionArrays(arr1,arr2);
	}//End of main()
}//End of class Ex23Demo

