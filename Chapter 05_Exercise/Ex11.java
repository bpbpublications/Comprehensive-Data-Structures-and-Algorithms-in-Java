//Ex11.java

class Ex11Demo
{
	static int f(int[] arr, int size)
	{
		if(size == 0)
			return 0;
		else if(arr[size-1]%2 == 0)
			return 1 + f(arr, size-1);
		else
			return f(arr, size-1);
	}

	public static void main(String[] args)
	{
		int[] arr = {1,2,3,4,8,10};
		System.out.println(f(arr, arr.length));
	}
}