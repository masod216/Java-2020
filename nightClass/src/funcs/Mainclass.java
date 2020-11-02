package funcs;

import java.util.Scanner;

public class Mainclass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in = new Scanner(System.in);
		int num = in.nextInt();
		int countNums= 0;
		int numberOfEvenNumbers= 0;
		int numberOfPosNumbers= 0;
		float numAvg = 0;
		while (num != 0) {
			
			countNums++;
			if(num%2==0)
				numberOfEvenNumbers++;
			if(num>0)
			{
				numberOfPosNumbers++;
				numAvg+=num;
			}
			num = in.nextInt();
			
		}
		System.out.println("countNums: "+countNums);
		System.out.println("numberOfEvenNumbers: "+numberOfEvenNumbers);
		System.out.println("numAvg: "+numAvg/numberOfPosNumbers);
		
	}

}
