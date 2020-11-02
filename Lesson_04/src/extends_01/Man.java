package extends_01;

public class Man extends Person{
	
	private Double beardLen;

	public Man(String name, int id, int age, Double beardLen) {
		super(name, id, age);
		this.beardLen = beardLen;
	}
	
	public Double getBeardLen() {
		return beardLen;
	}

	public void setBeardLen(Double beardLen) {
		this.beardLen = beardLen;
	}

	@Override
	public String toString() {
		return "Man [beardLength=" + beardLen + ", toString()=" + super.toString() + "]";
	}


	

}
