package Q12;

import java.util.Scanner;

public class Family {

	private String name;
	private int num;
	private double totalSum;
	
	public Family(String name,int num) {
		this.name = name;
		this.num = num;
		this.totalSum = 0;
	}
	
	public double GetTotalSum() {
		return this.totalSum;
	}
	
	public void Input()
	{
		Scanner in = new Scanner(System.in);
		for (int i = 0; i < num; i++) {
			System.out.println("Enter age of the "+(i+1)+" member of the family");
			
		}
	}
}
