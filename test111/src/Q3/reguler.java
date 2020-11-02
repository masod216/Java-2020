package Q3;

public class reguler extends SlotA{

	private int start_time;
	private int end_time;
	
	public reguler(int parking_size,int start_time, int end_time) {
		super(parking_size);
		this.start_time = start_time;
		this.end_time = end_time;
	}

	public int getStart_time() {
		return start_time;
	}

	public void setStart_time(int start_time) {
		this.start_time = start_time;
	}

	public int getEnd_time() {
		return end_time;
	}

	public void setEnd_time(int end_time) {
		this.end_time = end_time;
	}
	
	
	public boolean addCar(Car car1,int time)
	{
		if(time >= this.start_time && time <= this.end_time
				)
		{
			setCurrent_car(car1);
			return true;
		}
		return false;
	}
}
