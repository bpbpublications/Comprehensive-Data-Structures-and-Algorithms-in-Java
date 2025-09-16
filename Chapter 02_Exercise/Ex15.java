//Ex15.java : Program to find the sum of rows and columns of a 2-d array and store the sums in the same array.

class Ex15Demo
{
	public static void main(String[] args)
	{
		int[][] mat = { 
			{1,2,2,1,4,0},
			{5,4,3,2,5,0},
			{6,3,2,1,4,0},
			{3,5,4,2,3,0},
			{0,0,0,0,0,0}
		};
		
		int row = mat.length-1;
		int col = mat[0].length-1;

		System.out.println("The matrix is :");
		for(int i=0; i<row; i++)
		{
			for(int j=0; j<col; j++)
				System.out.printf("%5d", mat[i][j]);
			System.out.println();
		}
		System.out.println();

		for(int i=0; i<row; i++)
		{
			mat[i][col] = 0;
			for(int j=0; j<col; j++)
				mat[i][col] += mat[i][j];
		}

		for(int i=0; i<col+1; i++)
		{
			mat[row][i] = 0;
			for(int j=0; j<row; j++)
				mat[row][i] += mat[j][i];
		}

		System.out.println("After sum of rows and columns, the matrix is :");
		for(int i=0; i<row+1; i++)
		{
			for(int j=0; j<col+1; j++)
				System.out.printf("%5d", mat[i][j]);
			System.out.println();
		}
		System.out.println();
	}//End of main()
}//End of class Ex15Demo
