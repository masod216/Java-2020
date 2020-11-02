
public class Electric extends Car{
	double energy;
	Boolean sunroof;
	public Electric(String name, int km, double energy, Boolean sunroof) {
		super(name, km);
		this.energy = energy;
		this.sunroof = sunroof;
	}
	public double getEnergy() {
		return energy;
	}
	public void setEnergy(double energy) {
		this.energy = energy;
	}
	public Boolean getSunroof() {
		return sunroof;
	}
	public void setSunroof(Boolean sunroof) {
		this.sunroof = sunroof;
	}
	
	
}
