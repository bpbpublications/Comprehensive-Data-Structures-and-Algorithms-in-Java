//Ex8.java : Program to find the most frequent element in a sorted array.

class Ex8Demo
{
	public static void main(String[] args)
	{
		int[] arr = {5,5,10,15,15,15,30,35,35,50};

		System.out.println("The array is :");
		for(int i=0; i<arr.length; i++)
			System.out.print(arr[i] + " ");
		System.out.println();

		int maxTimes = 0, count;
		int mfElement, element;

		mfElement=arr[0];
		
		int i=0;
		while(i <= arr.length-1)
		{
				element = arr[i];
				count = 0;	
				while(i<arr.length && arr[i]==element)
				{
					count++;
					i++;
				}
				if(count > maxTimes)
				{
					mfElement=element;
					maxTimes=count;
				}
		}//End of while

		System.out.println(mfElement + " occurs " + maxTimes + " times.");
	}//End of main()
}//End of class Ex8Demo

