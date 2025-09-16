//P4.java : Program to pass array elements to a method.

class P4Demo
{
	static void checkEvenOdd(int num)
	{
		if(num%2 == 0)
			System.out.println(num + " is even");
		else
			System.out.println(num + " is odd");
	}//End of checkEvenOdd()	
	
	public static void main(String[] args)
    {
		int[] arr = {1,2,3,4,5,6,7,8,9,10};

		for(int i=0; i<arr.length; i++)
			checkEvenOdd(arr[i]);

    }//End of main()
}//End of class P4Demo