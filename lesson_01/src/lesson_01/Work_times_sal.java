package lesson_01;

public class Work_times_sal {
	
	public static void salary(double Work_hours, double hourly_wage , double bus_ticket, int daysOfMonth ) 
	{
		double sum = Work_hours * hourly_wage;
		sum+= bus_ticket*daysOfMonth;
		
		System.out.println("broto "+sum);
		System.out.println("neto "+sum*0.83);
	}
	public static void orgnizer(int A,int B,int C)
	{
		if (A>B && A>C) {
			if (B>C)
				System.out.println(A+" "+B+" "+C);
			else
				System.out.println(A+" "+C+" "+B);
		}
		else if (B>A && B>C) {
			if (A>C)
				System.out.println(B+" "+A+" "+C);
			else {
				System.out.println(B+" "+C+" "+A);
			}
		}
		else {
			if(A>B)
				System.out.println(C+" "+A+" "+B);
			else 
				System.out.println(C+" "+B+" "+A);
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		salary(15, 40, 20.2, 6);
		orgnizer(3,7,2);
	}

}
