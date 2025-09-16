//Ex12.java : Program to interchange first and last columns of a matrix.

class Ex12Demo
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
		for(int i=0; i<row; i++)
		{
			temp = mat[i][0];
			mat[i][0] = mat[i][col-1];
			mat[i][col-1] = temp;
		}

		System.out.println("After reversing first and last row, the matrix is :");
		for(int i=0; i<row; i++)
		{
			for(int j=0; j<col; j++)
				System.out.printf("%5d", mat[i][j]);
			System.out.println();
		}
		System.out.println();
	}//End of main()
}//End of class Ex12Demo

