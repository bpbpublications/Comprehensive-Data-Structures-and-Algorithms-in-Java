//Ex11.java : Program to reverse the rows of a matrix.

class Ex11Demo
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
		for(int i=0,k=row-1; i<k; i++,k--)
		{
			for(int j=0; j<col; j++)
			{
				temp = mat[i][j];
				mat[i][j] = mat[k][j];
				mat[k][j] = temp; 
			}
		}

		System.out.println("After reversing rows, the matrix is :");
		for(int i=0; i<row; i++)
		{
			for(int j=0; j<col; j++)
				System.out.printf("%5d", mat[i][j]);
			System.out.println();
		}
		System.out.println();
	}//End of main()
}//End of class Ex11Demo

