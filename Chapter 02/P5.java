//P5.java : Program to understand the effect of passing an array to a method.

class P5Demo
{
	static void sumOfSquare(int[] val)
	{
		int sum=0;

		for(int i=0; i<6; i++)
		{
			val[i] = val[i]*val[i];
			sum += val[i];
		}

		System.out.println("Sum of square = " + sum);

	}//End of sumOfSquare()	
	
	public static void main(String[] args)
    {
		int[] arr = {1,2,3,4,5,6};

		System.out.println("The array is :");
		for(int i=0; i<arr.length; i++)
			System.out.print(arr[i] + " ");
		System.out.println();

		sumOfSquare(arr);

		System.out.println("Now the array is :");
		for(int i=0; i<arr.length; i++)
			System.out.print(arr[i] + " ");
		System.out.println();
    }//End of main()
}//End of class P5Demo