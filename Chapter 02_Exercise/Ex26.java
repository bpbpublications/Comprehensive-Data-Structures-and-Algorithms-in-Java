//Ex26.java : Write a program to find all two array elements whose sum is equal to k.

class Ex26Demo
{
	public static void main(String[] args)
	{
		int[] arr = {5,15,10,25,30,35,20,40,50,45};
		int k = 45;

		System.out.println("The array is :");
		for(int i=0; i<arr.length; i++)
			System.out.print(arr[i] + " ");
		System.out.println();

		for(int i=0; i<arr.length-1; i++)
		{
			for(int j=i+1; j<arr.length; j++)
			{
				if(arr[j] == k-arr[i])
				{
					System.out.println("arr[" + i + "](" + arr[i] + ") + arr[" + j + "](" + arr[j] + ") = " + k);
				}
			}
		}
	}//End of main()
}//End of class Ex26Demo

