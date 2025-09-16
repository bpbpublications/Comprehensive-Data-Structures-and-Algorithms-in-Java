//Ex25.java : Write a program to find the if left side sum of array elements are equal to the right side sum of array elements.

class Ex25Demo
{
	public static void main(String[] args)
	{
		int[] arr = {9,4,3,1,5,6,2,8,7,11};

		System.out.println("The array is :");
		for(int i=0; i<arr.length; i++)
			System.out.print(arr[i] + " ");
		System.out.println();

		int leftSum=0, rightSum=0;
		int i;

		for(i=0; i<arr.length; i++)
			rightSum += arr[i];

		for(i=0; i<arr.length; i++)
		{
			leftSum += arr[i];
			rightSum -= arr[i];
			
			if(leftSum == rightSum)
				break;
		}

		if(leftSum == rightSum)
			System.out.println("Sum of arr[0.." + i + "] = Sum of arr[" + (i+1) + ".." + (arr.length-1) + "]");
		else
			System.out.println("No where in array sum of left side elements are equal to sum of right side elements.");
	}//End of main()
}//End of class Ex25Demo

