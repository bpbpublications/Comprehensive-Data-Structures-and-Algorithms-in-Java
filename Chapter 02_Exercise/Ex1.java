//Ex1.java : Program to exchange adjacent elements of an array.

class Ex1Demo
{
	public static void main(String[] args)
	{
		int[] arr = {40, 20, 50, 60, 30, 10, 90, 97, 70, 80};

		System.out.println("The array is :");
		for(int i=0; i<arr.length; i++)
			System.out.print(arr[i] + " ");
		System.out.println();

		int temp;
		for(int i=0; i<arr.length-1; i=i+2)
		{
			temp = arr[i];
			arr[i] = arr[i+1];
			arr[i+1] = temp;
		}

		System.out.println("After exchanging adjacent elements, the array is :");
		for(int i=0; i<arr.length; i++)
			System.out.print(arr[i] + " ");
		System.out.println();
	}//End of main()
}//End of class Ex1Demo


