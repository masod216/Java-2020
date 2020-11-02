package Shop;

import java.util.ArrayList;
import java.util.Scanner;

public class ClassMain {
	
		public static void cheapest(Shop[] Shop_arr,int b_amount,int a_amount,int o_amount)
		{
			boolean flag = true;
			double sum=0,min_sum=0;
			String name = null;
			
			for (int i = 0; i < Shop_arr.length; i++)
			{
				sum+=(Shop_arr[i].getBanana()*b_amount)+(Shop_arr[i].getApple()*a_amount)+(Shop_arr[i].getOrange()*o_amount);
				System.out.println(i+" "+sum);
				
				if (flag==true || sum<min_sum) 
				{
					flag=false;
					min_sum=sum;
					name = Shop_arr[i].getName();
				}
			}
			System.out.println(name+" total : "+min_sum);	
		}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		
		int b_amount=4,a_amount=3,o_amount=5;
		Shop[] Shop_arr = new Shop[5];
		
		ArrayList<Shop> ShopList = new ArrayList<Shop>();
		
		Shop_arr[0]= new Shop("test",3.2,4.5,2.1);
		Shop_arr[1]= new Shop("1",3.2,4.3,6.1);
		Shop_arr[2]= new Shop("4",3.2,4.3,0.1);
		Shop_arr[3]= new Shop("7",3.2,2.5,3.1);
		Shop_arr[4]= new Shop("21",3.2,8.5,2.1);
		
		for (int i = 0; i < 12; i++) {
			System.out.println("name");
			String name = input.nextLine();
			
			System.out.println("banana");
			Double banana = input.nextDouble();
			
			System.out.println("apple");
			Double apple = input.nextDouble();
			
			System.out.println("orange");
			Double orange = input.nextDouble();
			
			Shop s = new Shop(name, banana, apple, orange);
			
			ShopList.add(s);
		}
		
		
		System.out.println(Shop_arr[0]); // toString a system graber of syso

		cheapest(Shop_arr,b_amount,a_amount,o_amount);
		
	}





}
