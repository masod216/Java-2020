package lesson_01;

import java.util.Scanner;

public class test02 {
	
	public static int SumNOfDigit(int num, int count) {
		
		int sum=0;
		
		while (count>0) {
			
			sum+=num%10;
			num/=10;
			count--;
		}
		return sum;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int num_digit , num,count=0,temp;
		
		Scanner input = new Scanner (System.in);
		
		System.out.println("Enter your number");
		num = input.nextInt();
		
		System.out.println("Enter number of digts you want to sum");
		num_digit = input.nextInt();

		System.out.println(SumNOfDigit(num, num_digit)); 
		
		
		
	}

}
