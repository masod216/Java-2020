package Shop;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class ClassMain2 {
	
		public static void cheapest(ArrayList<Shop> shopList,int b_amount,int a_amount,int o_amount)
		{
			double min_sum= shopList.get(0).getBanana()*b_amount + (shopList.get(0).getApple()*a_amount) + (shopList.get(0).getOrange()*o_amount);
			double sum=0;
			String name = null;
			
			for (int i = 1; i < shopList.size(); i++)
			{
				sum+=(shopList.get(i).getBanana()*b_amount)+(shopList.get(i).getApple()*a_amount)+(shopList.get(i).getOrange()*o_amount);
				System.out.println(i+" "+sum);
				
				if (sum<min_sum) 
				{
					min_sum=sum;
					name = shopList.get(i).getName();
				}
			}
			System.out.println(name+" total : "+min_sum);	
		}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		
		int b_amount=4,a_amount=3,o_amount=5;
		Shop[] arr = new Shop[5];
		
		arr[0] = new Shop("test",3.2,4.5,2.1);
		arr[1] = new Shop("1",3.2,4.3,6.1);
		arr[2] = new Shop("4",3.2,4.3,0.1);
		arr[3] = new Shop("7",3.2,2.5,3.1);
		arr[4] = new Shop("21",3.2,8.5,2.1);
		
		ArrayList<Shop> ShopList = new ArrayList<Shop>(Arrays.asList(arr));
		

		/*
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
		*/
		cheapest(ShopList,b_amount,a_amount,o_amount);
		
	}





}
