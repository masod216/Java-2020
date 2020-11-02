package Q3;

public class Slot {

	int parking_size;
	Boolean taken;
	String current_car; 
	String saved_number;
	int start_time;
	int end_time;

	public Slot(int parking_size, boolean taken)
	{
		this.parking_size= parking_size;
		this.taken=taken;
	}
	
	
	public Slot(int parking_size, boolean taken, String saved_number)
	{
		this.saved_number = saved_number;
		this.parking_size= parking_size;
		this.taken=taken;
	}
	
	public Slot(int parking_size, boolean taken,int start_time,int end_time)
	{
		this.parking_size= parking_size;
		this.taken=taken;
		this.start_time = start_time;
		this.end_time = end_time;
	}



	public boolean add(Car car1,int time)
	{
		if(parking_size <= car1.Get_car_size() && taken==false)
		{
			if(parking_size == 2)
				if(saved_number == car1.Get_car_number()) {
				taken = true;
				current_car = car1.Get_car_number();
				return true;
			}
			if(parking_size == 3)
				if(car1.Get_handicap_tag()==true) {
					taken = true;
					current_car = car1.Get_car_number();
					return true;
			}
			if(parking_size == 1)
				if(time>=start_time && time<= end_time){
				taken = true;
				current_car = car1.Get_car_number();
				return true;
			}
	
		}
	return false;
	}
	
	public void remove(Car car1)
	{
	if(car1.Get_car_number().equals(current_car))
	{
		taken = false;
		current_car = "";
	}
	}
}