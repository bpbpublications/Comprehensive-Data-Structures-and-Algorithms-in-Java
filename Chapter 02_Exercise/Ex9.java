//Ex9.java : Program to find an element in a matrix, where the matrix is sorted row-wise and column-wise.

class Ex9Demo
{
	public static void main(String[] args)
	{
		int[][] mat = { {1,2,3}, {4,5,6}, {7,8,9} };
		int searchItem = 8;
		
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

		int i=0, j=col-1;
		while(i<=col-1 && j>=0)
		{
			if(mat[i][j] == searchItem)	
			{
				System.out.println(searchItem + " found at row : " + i + ", column : " + j);
				break;
			}
	        if( mat[i][j] < searchItem )
				i++;
			else
				j--;
		}//End of while
	}//End of main()
}//End of class Ex9Demo


