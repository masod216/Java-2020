package Q12;

import java.util.Scanner;

public class Family1 {
	
	private String name;
	private int num;
	private double totalSum;
	
	public Family1(String name,int num)
	{
		  this.name = name;
		  this.num = num;
		  totalSum = 0;
	}
	public double GetTotalSum()
	{
		return totalSum;
	}
	
	public void Input()
	{
		double sum = 100;
		Scanner in = new Scanner(System.in);
		for (int i = 0; i < num; i++) {
			System.out.println("Enter age of the "+(i+1)+" member of the family");
			int age = in.nextInt();
			
			if (age <= 3) {
				sum+=20.5;
			}
			else if (age <= 12) {
				sum+=30;
			}
			else {
				sum+=40.5;
			}
		}
		
		totalSum = sum;
	}
}
