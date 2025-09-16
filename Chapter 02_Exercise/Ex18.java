//Ex18.java : Write a program to rotate a matrix 90 degree in a clockwise direction.

class Ex18Demo
{
	public static void main(String[] args)
	{
		int[][] mat = { {1,2,3}, {4,5,6}, {7,8,9} };
		
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

		//Transpose the matrix
		int temp;
		for(int i=0; i<col; i++)
		{
			for(int j=0; j<i; j++)
			{
				temp = mat[i][j];
				mat[i][j] = mat[j][i];
				mat[j][i] = temp;
			}
		}

		//Reverse the columns
		for(int i=0,k=col-1; i<k; i++,k--)
		{
			for(int j=0; j<row; j++)
			{
				temp = mat[j][i];
				mat[j][i] = mat[j][k];
				mat[j][k] = temp;
			}
		}

		System.out.println("After rotating the matrix 90 degree clockwise :");
		for(int i=0; i<row; i++)
		{
			for(int j=0; j<col; j++)
				System.out.printf("%5d", mat[i][j]);
			System.out.println();
		}
		System.out.println();
	}//End of main()
}//End of class Ex18Demo

