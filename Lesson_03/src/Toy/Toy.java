package Toy;

public class Toy {
	
	private int Code;
	private String group;
	private String manufact;
	private int year;
	
	public Toy(int Code,String group,String manufact,int year)
	{
		this.Code = Code;
		this.group = group;
		this.manufact = manufact;
		this.year = year;
	}
	
	public void Set(int Code,String group,String manufact,int year)
	{
		this.Code = Code;
		this.group = group;
		this.manufact = manufact;
		this.year = year;
	}
	
	public String toString() {
		return "Toy : " + Code +". group : "+ group +". manufact :"+ manufact +". year : "+ year;
	}
	
	public int GetCode() {
		return Code;
	}
	
	public String Getgroup() {
		return group;
	}
	
	public String Getmanufact() {
		return manufact;
	}
	
	public int Getyear() {
		return year;
	}
	

}
