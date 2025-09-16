//P9.java : Program for transpose of matrix.

class P9Demo
{
	public static void main(String[] args)
    {
		int[][] mat1 = { {3,2,1,5}, {6,5,8,2}, {9,3,4,1} };
		
		int row = mat1.length;
		int col = mat1[0].length;
		
		int[][] mat2 = new int[col][row];

		System.out.println("The matrix is :");
		for(int i=0; i<row; i++)
		{
			for(int j=0; j<col; j++)
				System.out.printf("%5d", mat1[i][j]);
			System.out.println();
		}
		System.out.println();

		//Transpose
		for(int i=0; i<col; i++)
			for(int j=0; j<row; j++)
				mat2[i][j] = mat1[j][i];


		System.out.println("Transpose of matrix is :");
		for(int i=0; i<col; i++)
		{
			for(int j=0; j<row; j++)
				System.out.printf("%5d", mat2[i][j]);
			System.out.println();
		}
		System.out.println();

    }//End of main()
}//End of class P9Demo