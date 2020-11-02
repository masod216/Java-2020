package Q4;

public class Q4 {


	public static int what(int num) // 12345
	{
		int c = 0;
		while (num > 0 ) // 12345,1234,123,12,1,0
		{
			c += (num % 2); //1,0,1,0,1
			num /= 10; //1234,123,12,1
		}
		return c;//3
	}

	public static void why()
	{
		int[] arr = { 1245 , 34781 , 23 , 468 , 139};
		int res = arr[0]; //1245
		
		for (int i = 1 ; i < arr.length; i++)
		{
			if (what(arr[i]) < what(res))// 0<1
				res = arr[i];
			
		}

		System.out.println(res);
	}
	//468
	// print the number with the min amunot of odd numbers
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		why();
	}

}
