package Film;

public class Film {

	String Movie_Name;
	String Director;
	int Copies;
	
	public Film(String Movie_Name,String Director,int Copies)
	{
		 this.Movie_Name = Movie_Name;
		 this.Director = Director;
		 this.Copies = Copies;
	}
	
	public Film()
	{
		 this.Movie_Name = null;
		 this.Director = null;
		 this.Copies = 0;
	}

	public String Get_Name() {
		return Movie_Name;
	}
	
	public String Get_Director() {
		return Director;
	}
	
	public int Get_Copies() {
		return Copies;
	}
	
	public void Set_Data(String Movie_Name,String Director,int Copies)
	{
		 this.Movie_Name = Movie_Name;
		 this.Director = Director;
		 this.Copies = Copies;
	}
	
	public void Print_Data()
	{
		System.out.println(Movie_Name);
		System.out.println(Director);
		System.out.println(Copies);

	}
	
	public void Return()
	{
		 this.Copies++;
	}
	
	public boolean Check()
	{
		if(this.Copies>0)
			return true;
		
		return false;
	}

	public void Rent()
	{
		 this.Copies--;
	}

}
