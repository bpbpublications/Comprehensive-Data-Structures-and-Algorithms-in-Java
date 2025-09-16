//P13.java : Program for magic matrix.

class P13Demo
{
	private static final int MAX_SIZE = 30;	
	
	public static void main(String[] args)
    {
		int[][] arr = new int[MAX_SIZE][MAX_SIZE];
		int n = 7;

		int i = n-1;
		int j = (n-1)/2;
		int num;

		for(num=1; num <= n*n; num++)
		{
			arr[i][j] = num;
			i++; //move down
			j--; //move left

			if(num%n == 0)
			{
				i-=2; //one above the previous row
				j++;  //back to the previous column
			}
			else if(i == n)
				i = 0; //go to topmost row
			else if(j == -1)
				j = n-1; //go to rightmost column
		}

		System.out.println("Magic matrix :");

		for(i=0; i<n; i++)
		{
			for(j=0; j<n; j++)
				System.out.printf("%5d",arr[i][j]);
			System.out.println();
		}

    }//End of main()
}//End of class P13Demo