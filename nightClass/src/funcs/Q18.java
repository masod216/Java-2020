package funcs;

import java.util.Scanner;

public class Q18 {
	
	public static int func(int num) {
		int sum=0;
		while (num!=0) {
			sum+=num%10;
			num/=10;
		}
		return sum;
	}

	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in = new Scanner(System.in);
		int num = in.nextInt();
		int num1 = in.nextInt();
		int count = 0;
		while (num != 0 || num1 !=0) {
			if(func(num) == func(num1))
			{
				System.out.println(num+" and "+num1);
			}
			num = in.nextInt();
			num1 = in.nextInt();
		}
	}

}
