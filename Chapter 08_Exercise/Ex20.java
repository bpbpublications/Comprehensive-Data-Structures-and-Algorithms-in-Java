//Ex20.java : Write a program to sort the elements of a matrix (i) Row-wise (ii) Column-wise.

class SortMatrixDemo
{
	static void sortRowwise(int[][] mat)
	{
		int i,j,k,temp,xchanges;
		
		int row = mat.length;
		int col = mat[0].length;

		for(k=0; k<row; k++)
		{
			//Bubble sort
			for(i=0; i<col-1 ;i++)
			{
				xchanges = 0;
				for(j=0; j<col-1-i; j++)
				{
					if(mat[k][j] > mat[k][j+1])
					{
						temp=mat[k][j];
						mat[k][j]=mat[k][j+1];
						mat[k][j+1]=temp;
						xchanges++;
					}
				}
				if(xchanges==0) //If list is sorted
					break;
			}
		}
	}//End of sortRowwise()

	static void sortColumnwise(int[][] mat)
	{
		int k,xchanges,i,j,temp;
		
		int row = mat.length;
		int col = mat[0].length;
		
		for(k=0; k<col; k++)
		{
			//Bubble sort
			for(i=0; i<row-1 ;i++)
			{
				xchanges=0;
				for(j=0; j<row-1-i; j++)
				{
					if(mat[j][k] > mat[j+1][k])
					{
						temp=mat[j][k];
						mat[j][k]=mat[j+1][k];
						mat[j+1][k]=temp;
						xchanges++;
					}
				}
				if(xchanges==0) //If list is sorted
					break;
			}
		}//End of for
	}//End of sortColumnwise()

	public static void main(String[] args)
	{
			int[][] mat1 = { 
				{5,8,2,1}, 
				{3,6,9,4},
				{1,7,2,8},
				{8,3,5,7}
			};

			int[][] mat2 = { 
				{5,8,2,1}, 
				{3,6,9,4},
				{1,7,2,8},
				{8,3,5,7}
			};

			int row = mat1.length;
			int col = mat1[0].length;
			
			System.out.println("The matrix 1 is :");
			for(int i=0; i<row; i++)
			{
				for(int j=0; j<col; j++)
					System.out.printf("%5d", mat1[i][j]);
				System.out.println();
			}
			System.out.println();

			sortRowwise(mat1);

			System.out.println("After sorting row-wise, the matrix 1 is :");
			for(int i=0; i<row; i++)
			{
				for(int j=0; j<col; j++)
					System.out.printf("%5d", mat1[i][j]);
				System.out.println();
			}
			System.out.println();

			System.out.println("The matrix 2 is :");
			for(int i=0; i<row; i++)
			{
				for(int j=0; j<col; j++)
					System.out.printf("%5d", mat2[i][j]);
				System.out.println();
			}
			System.out.println();

			sortColumnwise(mat2);

			System.out.println("After sorting column-wise, the matrix 2 is :");
			for(int i=0; i<row; i++)
			{
				for(int j=0; j<col; j++)
					System.out.printf("%5d", mat2[i][j]);
				System.out.println();
			}
			System.out.println();

	}//End of main()
}//End of class SortMatrixDemo