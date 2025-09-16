//P1.java : Program to display the array elements.

class P1Demo
{
	public static void main(String[] args)
    {
		int[] arr = new int[5];
		arr[0] = 10;
		arr[1] = 20;
		arr[2] = 30;
		arr[3] = 40;
		arr[4] = 50;

		System.out.println("The array elements are :");
		for(int i=0; i<5; i++)
			System.out.print(arr[i] + " ");
		System.out.println();
    }//End of main()
}//End of class P1Demo