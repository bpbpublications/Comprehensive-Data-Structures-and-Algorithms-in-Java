//Ex22.java : Write a program to display intersection of two arrays, i.e. it contains only the elements which are common to both the arrays.

class Ex22Demo
{
	static void intersectionArrays(int[] arr1, int arr2[])
	{
		for(int i=0; i<arr1.length; i++)
		{
			for(int j=0; j<arr2.length; j++)
			{
				if(arr1[i] == arr2[j])
				{
					System.out.print(arr1[i] + " ");
					break;
				}
			}
		}
		System.out.println();
		
	}//End of intersectionArrays()	
	
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

		System.out.println("Intersection of Array 1 and Array 2 is :");
		intersectionArrays(arr1,arr2);
	}//End of main()
}//End of class Ex22Demo
