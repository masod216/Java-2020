package Hotal_02;

public class Hotal {
	
	String Hotal_name;
	String Hotal_city;
	int number_Of_rooms;
	int number_Of_rooms_free;
	

	public Hotal()
	{
		Hotal_name = null;
		Hotal_city = null;
		number_Of_rooms = 0;
		number_Of_rooms_free = 0;
	}
	
	public Hotal(String name,String city,int rooms,int free)
	{
		Hotal_name = name;
		Hotal_city = city;
		number_Of_rooms = rooms;
		number_Of_rooms_free = free;
	}
	
	public void print_data()
	{
		System.out.println("Hotal name : "+Hotal_name);
		System.out.println("City : "+Hotal_city);
		System.out.println("Number of rooms in use : "+(number_Of_rooms-number_Of_rooms_free));
		System.out.println("Free rooms : "+number_Of_rooms_free);
	}
	
	public void set_data(String name,String city,int rooms,int free)
	{
		Hotal_name = name;
		Hotal_city = city;
		number_Of_rooms = rooms;
		number_Of_rooms_free = free;
	}
	
	public void set_free(int free)
	{
		number_Of_rooms_free=free;
	}
	
	public String get_name()
	{
		return Hotal_name;
	}
	
	public String get_city()
	{
		return Hotal_city;
	}
	
	public int get_rooms()
	{
		return number_Of_rooms;
	}
	
	public int get_free()
	{
		return number_Of_rooms_free;
	}
}
