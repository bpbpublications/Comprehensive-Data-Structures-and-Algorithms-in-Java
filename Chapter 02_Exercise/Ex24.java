//Ex24.java : Write a program to find the maximum sum of k elements subarray in an array.

class Ex24Demo
{
	public static void main(String[] args)
	{
		int[] arr = {5,3,2,4,1,7,10,9,6,8};
		int k = 3;

		System.out.println("The array is :");
		for(int i=0; i<arr.length; i++)
			System.out.print(arr[i] + " ");
		System.out.println();

		int maxSum=0, currentSum=0;

		for(int i=0; i<k; i++)
			currentSum += arr[i];

		maxSum = currentSum;

		for(int i=0; i+k<arr.length; i++)
		{
			currentSum = currentSum-arr[i]+arr[i+k];
			if(currentSum > maxSum)
				maxSum = currentSum;
		}

		System.out.println("Maximum Sum = " + maxSum);
	}//End of main()
}//End of class Ex24Demo

