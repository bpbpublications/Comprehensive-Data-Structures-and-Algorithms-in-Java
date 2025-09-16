//Ex44.java : Write a function to print all possible permutations of a string.

class Ex44Demo
{
	static void swap(StringBuilder str, int p, int currentP)
	{
		char temp;
		temp = str.charAt(p);  str.setCharAt(p, str.charAt(currentP)); str.setCharAt(currentP,temp);
	}//End of swap

	static void permutation1(StringBuilder str, int currentP)
	{
		int p;

		if(str.length() == currentP+1)
			System.out.print(str + "\t");
		else
		{
			for(p=currentP; str.length()!=(p); p++)
			{
				swap(str,p,currentP);
				permutation1(str, currentP+1);
				swap(str,p,currentP);
			}
		}
	}//End of permutation1()

	static void permutation2(StringBuilder str, int startIndex, int lastIndex)
	{
		int i;
		if(startIndex == lastIndex)
		{
			for(i=0; i<=lastIndex; i++)
				System.out.print(str.charAt(i));
			System.out.print("\t");
		}
		else
		for(i=startIndex; i<=lastIndex; i++)
		{
			swap(str,startIndex,i);
			permutation2(str,startIndex+1,lastIndex);
			swap(str,startIndex,i);
		}
	}//End of permutation2()	

	public static void main(String[] args)
	{
		StringBuilder str = new StringBuilder("abc");

		permutation1(str,0);
		System.out.println("\n");
		
		permutation2(str,0,str.length()-1);
		System.out.println();
	}//End of main()
}//End of class Ex44Demo


