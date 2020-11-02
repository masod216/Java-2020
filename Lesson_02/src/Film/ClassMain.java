package Film;

import java.util.Scanner;


public class ClassMain {

	public static void main(String[] args) {
		
		Scanner input = new Scanner (System.in);

		String Movie_Name;
		String Director;
		int Copies;
		int M,N;
		
		Film[] FilmArray = new Film[4];
		
		FilmArray[0] = new Film("1", "2", 3);
		FilmArray[1] = new Film("1", "2", 0);
		FilmArray[2] = new Film("1", "2", 3);
		FilmArray[3] = new Film("1", "2", 3);
		
		
		/*
		for (int i = 0; i < FilmArray.length; i++) {
			System.out.println("Enter Movie Name");
			Movie_Name = input.nextLine();
			System.out.println("Enter Director Name");
			Director = input.nextLine();
			System.out.println("Enter number of Copies");
			Copies = input.nextInt();
			FilmArray[i] = new Film(Movie_Name, Director, Copies);
		}
		*/
		System.out.println("Enter Movie index you want to rent");
		M = input.nextInt();
		System.out.println("Enter Movie index you want to return");
		N = input.nextInt();
		
		if (FilmArray[M].Get_Copies() > 0) {
			FilmArray[M].Rent();
		}
		else {
			System.out.println("there are no more copies of the movie to rent");
		}
		
		FilmArray[N].Return();
		
	}

}
