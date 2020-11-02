package cars;

public class UltimateCar extends ElectricOrSunCars{

	int year;

	public UltimateCar(String compName, int km, double energy, boolean sunroof, int year) {
		super(compName, km, energy, sunroof);
		this.year = year;
	}

	public int getYear() {
		return year;
	}

	public void setYear(int year) {
		this.year = year;
	}
	
	
}
