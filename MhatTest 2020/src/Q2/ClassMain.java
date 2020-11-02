package Q2;

import java.util.Scanner;

public class ClassMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in = new Scanner(System.in);
		

		
		Clock p1 = new Clock(in.nextInt(), in.nextInt());
		Clock p2 = new Clock(in.nextInt(), in.nextInt());
		
		if(p1.getInterval()>p2.getInterval())
			System.out.println("the later flight is lnding in :"+p1.getInterval()+" minits");
		else {
			System.out.println("the later flight is lnding in :"+p2.getInterval()+" minits");
		}
		
	}
	

}
