//Ex14.java : Program to find out whether a square matrix is symmetric or not.

class Ex14Demo
{
	static boolean isSymmetric(int[][] mat, int n)
	{
		for(int i=0; i<n; i++)
		{
			for(int j=0; j<n; j++)
			{
				if(mat[i][j] != mat[j][i])
					return false;
			}
		}

		return true;
	}//End of isSymmetric()
	
	public static void main(String[] args)
	{
		int[][] mat = { {1,8,5}, {8,3,9}, {5,9,4} };
		
		int row = mat.length;
		int col = mat[0].length;

		System.out.println("The matrix is :");
		for(int i=0; i<row; i++)
		{
			for(int j=0; j<col; j++)
				System.out.printf("%5d", mat[i][j]);
			System.out.println();
		}
		System.out.println();

		if(isSymmetric(mat,row))
			System.out.println("Matrix is symmetric");
		else
			System.out.println("Matrix is not symmetric");
	}//End of main()
}//End of class Ex14Demo

