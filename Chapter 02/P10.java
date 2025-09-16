//P10.java : Program to rotate an array left by 1 element.

class P10Demo
{
	public static void main(String[] args)
    {
		int[] arr = {10,20,30,40,50};

		System.out.println("The array is :");
		for(int i=0; i<arr.length; i++)
			System.out.print(arr[i] + " ");
		System.out.println();

		int temp = arr[0];
		for(int i=1; i<arr.length; i++)
			arr[i-1]=arr[i];
		arr[arr.length-1] = temp;

		System.out.println("After left rotation, the array is :");
		for(int i=0; i<arr.length; i++)
			System.out.print(arr[i] + " ");
		System.out.println();

    }//End of main()
}//End of class P10Demo