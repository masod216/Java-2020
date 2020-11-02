package malls_And_Stores;

public class BookStore extends Store{
	
	public int NumberOfTypesOfBooks;

	public BookStore(int rent, String StoreName, int numberOfTypesOfBooks) {
		super(rent, StoreName);
		NumberOfTypesOfBooks = numberOfTypesOfBooks;
	}

	public int getNumberOfTypesOfBooks() {
		return NumberOfTypesOfBooks;
	}

	public void setNumberOfTypesOfBooks(int numberOfTypesOfBooks) {
		NumberOfTypesOfBooks = numberOfTypesOfBooks;
	}
	
}
