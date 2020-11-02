package arielProjectExamA;

public class Regular extends Slot{

	private int dateTimeStart;
	private int dateTimeEnd;
	
	public Regular(int sizeNo, int dateTimeStart, int dateTimeEnd) {
		super(sizeNo);
		this.dateTimeStart = dateTimeStart;
		this.dateTimeEnd = dateTimeEnd;
	}
	public Regular( int dateTimeStart, int dateTimeEnd) {
		this.dateTimeStart = dateTimeStart;
		this.dateTimeEnd = dateTimeEnd;
	}
	public int getDateTimeStart() {
		return dateTimeStart;
	}
	public void setDateTimeStart(int dateTimeStart) {
		dateTimeStart = dateTimeStart;
	}
	public int getDateTimeEnd() {
		return dateTimeEnd;
	}
	public void setDateTimeEnd(int dateTimeEnd) {
		dateTimeEnd = dateTimeEnd;
	}
	
	public boolean addCar(Car c ,  int time )
	{
		if(this.dateTimeStart < time && time < this.dateTimeEnd 
				&& super.addCar(c))
		{
			setC(c);
			return true;
		}
		return false; 
	}
}



