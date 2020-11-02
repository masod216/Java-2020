package Q3;

public class Q3 {

	public static void main(String[] args) {
			System.out.println(what(12345));
	}
	
	public static int what(int num) // 12345
	{
		int c = 0;
		while (num > 0 ) // 12345,1234,123,12,1,0
		{
			System.out.println((num));
			c += (num % 2); //1,0,1,0,1
			num /= 10; //1234,123,12,1
		}
		return c;//3
	}
}

//3
//222
//count the odd digits in a number