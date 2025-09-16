//P7.java : Program for addition of two matrices.

class P7Demo
{
	public static void main(String[] args)
    {
		int[][] mat1 = { {1,2,8,4}, {5,6,7,8}, {3,2,1,4} };
		int[][] mat2 = { {2,5,4,2}, {1,5,2,6}, {9,4,7,2} };
		
		int row = mat1.length;
		int col = mat1[0].length;
		
		int[][] mat3 = new int[row][col];

		//Addition of matrices
		for(int i=0; i<row; i++)
			for(int j=0; j<col; j++)
				mat3[i][j] = mat1[i][j]+mat2[i][j];

		System.out.println("Matrix 1 :");
		for(int i=0; i<row; i++)
		{
			for(int j=0; j<col; j++)
				System.out.printf("%5d", mat1[i][j]);
			System.out.println();
		}
		System.out.println();

		System.out.println("Matrix 2 :");
		for(int i=0; i<row; i++)
		{
			for(int j=0; j<col; j++)
				System.out.printf("%5d", mat2[i][j]);
			System.out.println();
		}
		System.out.println();

		System.out.println("The resultant Matrix 3 :");
		for(int i=0; i<row; i++)
		{
			for(int j=0; j<col; j++)
				System.out.printf("%5d", mat3[i][j]);
			System.out.println();
		}
		System.out.println();

    }//End of main()
}//End of class P7Demo