package practis1;


public class ColorPencil extends Pencil {
	
	private String color;
	
	public ColorPencil(String color,String nameOfcomp, double lenOfPencil) {
		super(nameOfcomp, lenOfPencil);
		this.color = color;
	}

	public String getColor() {
		return color;
	}
	
	public String toString()
	{
		return super.toString()+"color"+color;
	}
	public boolean equals(Object cp)
	{
		if (cp instanceof ColorPencil) {
			ColorPencil CP = (ColorPencil)cp;
			if (super.equals(cp) && this.isColor(CP.color)) {
				return true;
			}
		}
		return false;

	}
	public boolean isColor(String c) {
		if (c.equals(color)) {
			return true;
		}
		else {
			return false;
		}
	}
}
