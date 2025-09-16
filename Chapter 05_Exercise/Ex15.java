//Ex15.java

class Ex15Demo
{
	static int f(int[] arr, int size)
	{
		int m;
		if(size == 1)
			return arr[0];
		m = f(arr, size-1);
		if(arr[size-1] < m )
			return arr[size-1];
		else
			return m;
	}

	public static void main(String[] args)
	{
		int[] arr = {2,3,1,4,6,34};
		System.out.println(f(arr, arr.length));
	}
}