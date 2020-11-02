package Q20;

public class ClassMain {

	public static void main(String[] args) {
		
		for (int i = 200; i <= 888; i+=2) {
			int temp = i/10;
			
				if ((temp%10)%2==0) {
					temp/=10;
					if((temp%10)%2==0)
						System.out.println(i);
				}

			}

			
		}

	}

