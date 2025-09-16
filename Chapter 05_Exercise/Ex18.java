//Ex18.java : Write a recursive function to display a line of text in reverse order.

class Ex18Demo
{
	static void reverseLine(String line, int i)
	{
		if(i == 1)
		{
			System.out.println(line.charAt(0));
			return;
		}
		else
		{
			System.out.print(line.charAt(i-1));
			reverseLine(line, i-1);
		}

	}//End of reverseLine()

	public static void main(String[] args)
	{
		String line = "There is a man in a hut";

		System.out.println("Line is : " + line);

		System.out.println("Reversed line is : ");
		reverseLine(line,line.length());
	}//End of main()
}//End of class Ex18Demo