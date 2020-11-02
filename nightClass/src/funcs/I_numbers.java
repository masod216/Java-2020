package funcs;

public class I_numbers {

	public static void func(int num,int i) {
		int count=1;
		while (num!=0) {
			if (num%10 == i) {
				System.err.print(count+",");
			}
			num/=10;
			count++;
		}
	}
	
	public static void func1(int num) {
		for (int i = 0; i < 10; i++) {
			func(num,i);
		}
	}
	
	public static void func2() {
		for (int i = 1; i <= 50; i++) {
			if (i%7==0) {
				System.out.println(i);
			}
		}
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		func1(3453);
		func2();
	}

}
