//P2.java : Program to find the smallest and largest number in an array.

class P2Demo
{
	public static void main(String[] args)
    {
		int[] arr = {2,5,4,1,8,9,11,6,3,7};
		int small, large;

		small = large = arr[0];

		for(int i=1; i<arr.length; i++)
		{
			if(arr[i] < small)
				small = arr[i];
			if(arr[i] > large)
				large = arr[i];
		}

		System.out.println( "Smallest = " + small + ", Largest = " + large);
    }//End of main()
}//End of class P2Demo