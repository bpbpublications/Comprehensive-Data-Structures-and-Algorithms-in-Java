//P15.java : Program to print a square matrix spirally.

class P15Demo
{
	public static void main(String[] args)
    {
		int[][] arr =
			{
				{95,67,32,35,44,65},
				{12,11,16,93,29,59},
				{82,13,21,31,27,17},
				{24,18,28,15,33,20},
				{39,30,26,23,34,37},
				{19,38,52,14,36,22}
			};

		int n = arr.length;
		int i,j,start,end;

		System.out.println("The square matrix is :");
		for(i=0; i<n; i++)
		{
			for(j=0; j<n; j++)
				System.out.printf("%5d",arr[i][j]);
			System.out.println();
		}

		System.out.println("\nPrinting the square matrix spirally :");

		for(start=0,end=n-1; start<=end; start++,end--)
		{
			for(i=start; i<=end; i++)
				System.out.print(arr[start][i] + " ");
			for(i=start+1; i<=end; i++)
				System.out.print(arr[i][end] + " ");
			for(i=end-1; i>=start; i--)
				System.out.print(arr[end][i] + " ");
			for(i=end-1; i>=start+1; i--)
				System.out.print(arr[i][start] + " ");
		}

		System.out.println();

    }//End of main()
}//End of class P15Demo