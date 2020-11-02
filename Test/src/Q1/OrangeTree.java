package Q1;

public class OrangeTree {

    private int[] daysArray;
    private int sumOfFruit;

	public OrangeTree() {
        daysArray = new int[90];
        sumOfFruit = 0;
	}

	public void pickedFruit(int day,int Fruit) {

        daysArray[day] = Fruit;
        sumOfFruit += Fruit;
	}

	public int numberofFruit(int day) {

        return daysArray[day];
    }

    public int TotalFruitcount() { //אז אין צורך בלולאה pickedFruit אם ההכנסה של הסכום היא רק דרך 

    return sumOfFruit;
	}
}
