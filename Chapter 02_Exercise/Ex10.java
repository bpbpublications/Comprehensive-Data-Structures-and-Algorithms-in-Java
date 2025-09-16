//Ex10.java : Program to interchange first and last rows of a matrix.

class Ex10Demo
{
	public static void main(String[] args)
	{
		int[][] mat = { 
			{1,2,3,4}, 
			{5,6,7,8},
			{9,10,11,12},
			{13,14,15,16}
		};
		
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

		int temp;
		//Interchange first and last row
		for(int i=0; i<col; i++)
		{
			temp = mat[0][i];
			mat[0][i] = mat[row-1][i];
			mat[row-1][i] = temp; 
		}

		System.out.println("After interchanging first and last row, the matrix is :");
		for(int i=0; i<row; i++)
		{
			for(int j=0; j<col; j++)
				System.out.printf("%5d", mat[i][j]);
			System.out.println();
		}
		System.out.println();
	}//End of main()
}//End of class Ex10Demo




