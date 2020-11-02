package q5;


public class Main {
	public static void main(String[] args) {

		C obj1 = new C();
		D obj2 = new D(2,4.6);
		System.out.println(obj1.getStr()); //"C: " -1
		System.out.println(obj2.getStr1()); //C: 2 D: 4.6
		
	}
}
