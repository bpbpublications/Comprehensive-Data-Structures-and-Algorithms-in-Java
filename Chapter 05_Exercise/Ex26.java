//Ex26.java : Write a recursive function that displays a positive integer in words.

class Ex26Demo
{
	static void integerToWords(int n) 
	{ 
		if(n==0)
			return;

		integerToWords(n/10);

		switch(n%10)
		{
			case 0: System.out.print("zero "); break;
			case 1: System.out.print("one "); break;
			case 2: System.out.print("two "); break;
			case 3: System.out.print("three "); break;
			case 4: System.out.print("four "); break;
			case 5: System.out.print("five "); break;
			case 6: System.out.print("six "); break;
			case 7: System.out.print("seven "); break;
			case 8: System.out.print("eight "); break;
			case 9: System.out.print("nine "); break;
		}
	}//End of integerToWords()

	public static void main(String[] args)
	{
		int num = 12340;
		System.out.println(num + " in words :");
		integerToWords(num);
		System.out.println();
	}//End of main()
}//End of class Ex26Demo

