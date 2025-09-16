//Ex17.java : program to print Spiral Matrix.

class Ex17Demo
{
	public static void main(String[] args)
	{
		
		int n = 5;
		int[][] mat = new int[n][n];
		int i,j,start,end;

		int num = 1;
		for(start=0,end=n-1; start<=end; start++,end--)
		{
			for(i=start; i<=end; i++)
				mat[start][i] = num++;
			for(i=start+1; i<=end; i++)
				mat[i][end] = num++;
			for(i=end-1; i>=start; i--)
				mat[end][i] = num++;
			for(i=end-1; i>=start+1; i--)
				mat[i][start] = num++;
		}

		System.out.println("The spiral matrix for " + n + " is:");
		for(i=0; i<n; i++)
		{
			for(j=0; j<n; j++)
				System.out.printf("%5d", mat[i][j]);
			System.out.println();
		}
		System.out.println();
	}//End of main()
}//End of class Ex17Demo

