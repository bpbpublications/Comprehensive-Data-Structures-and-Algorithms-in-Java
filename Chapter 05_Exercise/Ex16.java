//Ex16.java

class Ex16Demo
{
	static int f(int[] arr, int low, int high)
	{
		int mid, left, right;
		if(low == high)
			return arr[low];
		mid = (low+high)/2;
		left = f(arr, low, mid);
		right = f(arr, mid+1, high);
		if(left < right)
			return left;
		else
			return right;
	}

	public static void main(String[] args)
	{
		int[] arr = {3,4,2,11,8,10};
		System.out.println(f(arr, 0, 5));
	}
}