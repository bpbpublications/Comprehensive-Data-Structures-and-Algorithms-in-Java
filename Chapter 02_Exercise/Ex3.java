//Ex3.java : Program to find the largest and second largest elements of an array.

class Ex3Demo
{
	public static void main(String[] args)
	{
		int[] arr = {2,5,4,1,8,9,11,6,3,7};
		int largest, secondLargest;

		largest = secondLargest = arr[0];

		for(int i=1; i<arr.length; i++)
		{
			if(arr[i] > largest)
			{
				secondLargest = largest;
				largest = arr[i];
			}
		}
		System.out.println("Largest : " + largest + ", second largest : " + secondLargest);
	}//End of main()
}//End of class Ex3Demo

