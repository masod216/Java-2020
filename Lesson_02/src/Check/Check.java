package Check;

public class Check {
	
	String Ch_number;
	String Bank_Name;
	int Dep_Number;
	double Amount;
	
	public Check(String ch_number, String bank_Name, int dep_Number, double d)
	{
		this.Ch_number = ch_number;
		this.Bank_Name = bank_Name;
		this.Dep_Number = dep_Number;
		this.Amount = d;
	}
	
	public Check()
	{
		this.Ch_number = "UNKNOWN";
		this.Bank_Name = "UNKNOWN";
		this.Dep_Number = 0;
		this.Amount = 0;
	}
	
	public void Set_Data(String ch_number, String bank_Name, int dep_Number, double amount) 
	{	
		this.Ch_number = ch_number;
		this.Bank_Name = bank_Name;
		this.Dep_Number = dep_Number;
		this.Amount = amount;
	}
	
	public String Get_Ch_Number() {
		return this.Ch_number;
	}
	
	public String Get_Bank_Name() {
		return this.Bank_Name;
	}
	
	public int Get_Dep_Number() {
		return this.Dep_Number;
	}
	
	public double Get_Amount() {
		return this.Amount;
	}
	
	public void Print() {
		System.out.println(this.Ch_number);
		System.out.println(this.Bank_Name);
		System.out.println(this.Dep_Number);
		System.out.println(this.Amount);
	}
}
