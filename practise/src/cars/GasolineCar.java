package cars;

public class GasolineCar extends Car{

	int year;

	public GasolineCar(String compName, int km, int year) {
		super(compName, km);
		this.year = year;
	}

	public int getYear() {
		return year;
	}

	public void setYear(int year) {
		this.year = year;
	}
	

}
