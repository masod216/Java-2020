package Q3;

public class Car{

	private String car_number;
	private int car_size;
	private Boolean handicap_tag;
	private String owner;
	
	public Car(String car_number, int car_size, Boolean handicap_tag, String owner)
{
	this.car_number = car_number;
	this.car_size = car_size;
	this.handicap_tag = handicap_tag;
	this.owner = owner ;
}

	public String Get_car_number()
		{return car_number;}

	public int Get_car_size()
		{return car_size;}

	public Boolean Get_handicap_tag()
		{return handicap_tag;}

	public String Get_owner()
		{return owner;}

	public void Set_handicap_tag(Boolean handicap_tag)
	{	
		this.handicap_tag= handicap_tag;
	}
	
	public void Set_owner(String owner)
	{
		this.owner = owner;
	}
}

