package func_Q15;

import java.util.Scanner;

public class ClassMain {

	public static int sumOfNum(int n) {
		int sum=0;
		
		while (n>0) {
			sum+=n%10;
			n/=10;
		}
		return sum;
	}
	
	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		
		int num = input.nextInt();
		int num_sum = sumOfNum(num);
		int count = 0;
		
		for (int i = 0; i < num; i++) {
			if (sumOfNum(i)==num_sum) {
				System.out.print(i+",");
				count++;
			}
		}
		System.out.println();
		System.out.println("number is machs: "+count);
	}

}
