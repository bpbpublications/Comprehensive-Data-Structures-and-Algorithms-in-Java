//Ex2.java : Program to find the difference of the largest and smallest elements of an array.

class Ex2Demo
{
	public static void main(String[] args)
	{
		int[] arr = {2,5,4,1,8,9,11,6,3,7};
		int smallest, largest;

		smallest = largest = arr[0];

		for(int i=1; i<arr.length; i++)
		{
			if(arr[i] < smallest)
				smallest = arr[i];
			if(arr[i] > largest)
				largest = arr[i];
		}

		System.out.println("Difference of largest(" + largest + ") and smallest(" + smallest + ") is : " + (largest-smallest));
	}//End of main()
}//End of class Ex2Demo

