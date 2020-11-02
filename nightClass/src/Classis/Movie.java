package Classis;

import com.sun.beans.introspect.PropertyInfo.Name;

public class Movie {
	
	private String name;
	private int year;
	private int length;
	private int rating;
	
	public Movie(String name,int year,int length,int rating)
	{
		this.length = length;
		this.name = name;
		this.year = year;
		this.rating = rating;
	}
}
