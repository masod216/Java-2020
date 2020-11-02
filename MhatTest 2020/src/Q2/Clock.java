package Q2;

public class Clock {
	
	private int hour; //  23 0
	private int min; //  59 0
		
	public Clock(int hour, int min)
	{
		this.hour = hour;
		this.min = min;
	}
		
	public int getInterval()
	{
		return (23-hour)*60+60-min;
	}
		
}
