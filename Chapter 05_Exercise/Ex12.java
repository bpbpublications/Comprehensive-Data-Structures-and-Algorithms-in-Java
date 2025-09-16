//Ex12.java

class Ex12Demo
{
	static int f(int[] arr, int size)
	{
		if(size == 0)
			return 0;
		return arr[size-1] + f(arr, size-1);
	}

	public static void main(String[] args)
	{
		int[] arr = {1,2,3,4,8,10};
		System.out.println(f(arr, arr.length));
	}
}