//P12.java : Program for Pascal's triangle.

class P12Demo
{
	private static final int MAX_SIZE = 30;
	
	public static void main(String[] args)
    {
		int[][] arr = new int[MAX_SIZE][MAX_SIZE];
		int n = 7; //Number of lines for triangle
		for(int i=0; i<n; i++)
		{
			for(int j=0; j<=i; j++)
			{
				if(j==0 || i==j)
					arr[i][j] = 1;
				else
					arr[i][j] = arr[i-1][j-1]+arr[i-1][j];
			}
		}

		System.out.println("Pascal triangle :");
		for(int i=0; i<n; i++)
		{
			for(int j=0; j<=i; j++)
				System.out.printf("%5d",arr[i][j]);
			System.out.println();
		}

    }//End of main()
}//End of class P12Demo