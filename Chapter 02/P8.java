//P8.java : Program for multiplication of two matrices.

class P8Demo
{
	public static void main(String[] args)
    {
		int[][] mat1 = { {2,1,4,3}, {5,2,7,1}, {3,1,4,2} };
		int[][] mat2 = { {1,2}, {3,4}, {2,5}, {6,2} };

		int row1 = mat1.length;
		int col1 = mat1[0].length;
		int row2 = col1;
		int col2 = mat2[0].length;
		
		int[][] mat3 = new int[row1][col2];
		
		//Multiplication of matrices
		for(int i=0; i<row1; i++)
		{
			for(int j=0; j<col2; j++)
			{
				mat3[i][j] = 0;
				for(int k=0; k<col1; k++)
					mat3[i][j] += mat1[i][k]*mat2[k][j];
			}
		}

		System.out.println("Matrix 1 :");
		for(int i=0; i<row1; i++)
		{
			for(int j=0; j<col1; j++)
				System.out.printf("%5d", mat1[i][j]);
			System.out.println();
		}
		System.out.println();

		System.out.println("Matrix 2 :");
		for(int i=0; i<row2; i++)
		{
			for(int j=0; j<col2; j++)
				System.out.printf("%5d", mat2[i][j]);
			System.out.println();
		}
		System.out.println();

		System.out.println("The resultant Matrix 3 :");
		for(int i=0; i<row1; i++)
		{
			for(int j=0; j<col2; j++)
				System.out.printf("%5d", mat3[i][j]);
			System.out.println();
		}
		System.out.println();

    }//End of main()
}//End of class P8Demo