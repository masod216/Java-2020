package Polimorfisom_03;

public class Woman extends Person{
	
	private Double heelsLen;

	public Woman(String name, int id, int age, Double heelsLen) {
		super(name, id, age);
		this.heelsLen = heelsLen;
	}

	public Double getHeelsLen() {
		return heelsLen;
	}

	public void setHeelsLen(Double heelsLen) {
		this.heelsLen = heelsLen;
	}

	@Override
	public String toString() {
		return "Woman [heelsLength=" + heelsLen + ", toString()=" + super.toString() + "]";
	}

	
}
