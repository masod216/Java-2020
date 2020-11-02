
public class GasolineCar extends Car implements AvgGas{
	int year;
	public GasolineCar(String name, int km, int year) {
		super(name, km);
		this.year = year;
	}
	public int getYear() {
		return year;
	}
	public void setYear(int year) {
		this.year = year;
	}
		void carInfo()
		{
			System.out.println("type: "+getClass());
			System.out.println("km: "+super.getKm());
			System.out.println("year: "+year);
		}
		@Override
		public void AvgGas() {
			// TODO Auto-generated method stub
			System.out.println(super.getKm()/(2019-year));
		}
		@Override
		public String toString() {
			return "GasolineCar [year=" + year + ", name=" + name + ", km=" + km + "]";
		}
		
	}	

