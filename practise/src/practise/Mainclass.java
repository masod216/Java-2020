package practise;

public class Mainclass {
	
	public static int fibo(int N,int A,int B) {
		int temp;

		temp = B;
		B+=A;
		A=temp;
		
		if (N==0)
		{
			return B;
		}
		return (fibo(N-1,A,B));

	}

	public static void main(String[] args) 
	{
		int N = 7;
		int A = 0 ;
		int B = 1 ;
		System.out.println(fibo(N-2,A,B));
		
	

	}
}
