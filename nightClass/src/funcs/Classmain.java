package funcs;

public class Classmain {

	public static int func(int num) {
		
		int sum = 0;
		 while (num!=0) {
			sum+= num%10;
			num/=10;
			
		}
		 return sum;
	}
	public static void main(String[] args) {
		int num = 35;
		int conut=0;
		
		for (int i = 0; i < num; i++) {
			if (func(num) == func(i)) {
				System.out.println(i);
				conut++;
			}
			System.out.println(conut);
		}
	}

}
