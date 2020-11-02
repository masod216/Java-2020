package cars;

public abstract class ElectricOrSunCars extends Car{

	double energy;
	boolean sunroof;
	public ElectricOrSunCars(String compName, int km, double energy, boolean sunroof) {
		super(compName, km);
		this.energy = energy;
		this.sunroof = sunroof;
	}
	public double getEnergy() {
		return energy;
	}
	public void setEnergy(double energy) {
		this.energy = energy;
	}
	public boolean isSunroof() {
		return sunroof;
	}
	public void setSunroof(boolean sunroof) {
		this.sunroof = sunroof;
	}
	
	
}
