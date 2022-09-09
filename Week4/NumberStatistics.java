package Week4;

public class NumberStatistics {

    private int amountOfNumbers;

    public NumberStatistics() {
        // initialize here the object variable amountOfNumbers
        this.amountOfNumbers = 0;

    }

    public void addNumber(int number) {
       this.amountOfNumbers++;

    }

    public int amountOfNumbers() {
        return this.amountOfNumbers;
    }

}
