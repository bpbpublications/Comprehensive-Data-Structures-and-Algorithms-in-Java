//Ex16.java : Program to print a rectangular matrix spirally.

class Ex16Demo
{
	public static void main(String[] args)
	{
		int[][] mat =
		{
			{95,67,32,35,44,65},
			{12,11,16,93,29,59},
			{82,13,21,31,27,17},
			{24,18,28,15,33,20},
			{39,30,26,23,34,37}
		};

		int row = mat.length;
		int col = mat[0].length;
		
		System.out.println("The square matrix is :");
		for(int i=0; i<row; i++)
		{
			for(int j=0; j<col; j++)
				System.out.printf("%5d", mat[i][j]);
			System.out.println();
		}

		System.out.println("\nPrinting the rectangular matrix spirally :");

		int k;
		for(int rStart=0,cStart=0,rEnd=row-1,cEnd=col-1; rStart<=rEnd && cStart<=cEnd; rStart++,cStart++,rEnd--,cEnd--)
		{
			for(k=cStart; k<=cEnd; k++) 
				System.out.print(mat[rStart][k] + " ");
			for(k=rStart+1; k<=rEnd; k++) 
				System.out.print(mat[k][cEnd] + " ");
			if(rStart<rEnd)
				for(k=cEnd-1; k>=cStart; k--)
					System.out.print(mat[rEnd][k] + " ");
			if(cStart<cEnd)
				for(k=rEnd-1; k>=rStart+1; k--)
					System.out.print(mat[k][cStart] + " ");
		}

		System.out.println();
	}//End of main()
}//End of class Ex16Demo
