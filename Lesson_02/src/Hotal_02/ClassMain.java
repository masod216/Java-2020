package Hotal_02;

import java.util.Scanner;

public class ClassMain {

	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		
		Hotal[] arr_hotal = new Hotal[5];
		
		arr_hotal[0] = new Hotal("King David Hotel","Jerusalem",100,91);
		arr_hotal[1] = new Hotal("Bezalel Hotel","Jerusalem",600,500);
		arr_hotal[2] = new Hotal("Astral Maris Eilat","Eilat",1000,65);
		arr_hotal[3] = new Hotal("Dan Tel Aviv Hotel","Tel Aviv-Yafo",60,0);
		arr_hotal[4] = new Hotal("Carmel Forest Spa Resort","Beit Oren",90,89);
		
		/*
		for (int i = 0; i < arr_hotal.length; i++) 
		{
			System.out.println("Enter name");
			String hotel_name = input.nextLine();
			
			System.out.println("Enter city");
			String city_name = input.nextLine();
			
			System.out.println("Enter room number");
			int number_of_rooms = input.nextInt();
			
			System.out.println("Enter free rooms");
			int free_rooms = input.nextInt();
			
			arr_hotal[i] = new Hotal(hotel_name,city_name,number_of_rooms,free_rooms);			
		}
		*/
		System.out.println("Enter the city of the Hotel");
		String city_name = input.nextLine();
		
		for (int i = 0; i < arr_hotal.length; i++) 
		{
			String temp_city = arr_hotal[i].get_city();
			if(city_name.equals(temp_city))
			{
				System.out.println("this Hotel cane up");
				arr_hotal[i].print_data();
				System.out.println("-----------------");
			}
				
		}
		
		
		for (int i = 0; i < arr_hotal.length; i++) 
		{
			int temp_free = arr_hotal[i].get_free();
			if(temp_free > 0)
			{
				System.out.println(" ");
				System.out.println("this Hotel has rooms available");
				arr_hotal[i].print_data();
				System.out.println("-----------------");
			}
				
		}
		
		for (int i = 0; i < arr_hotal.length; i++) 
		{
			Float temp_free = (float) arr_hotal[i].get_free();
			Float temp_rooms_percent = (float) ((arr_hotal[i].get_rooms())*0.4);

			if(temp_free > temp_rooms_percent)
			{
				System.out.println(" ");
				System.out.println("this Hotel has 40% free");
				arr_hotal[i].print_data();
				System.out.println("-----------------");
			}
				
		}
		

	}

}
