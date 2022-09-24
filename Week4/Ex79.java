package Week4;

import java.util.Scanner;

public class Ex79 {
    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        System.out.println("Insert number: ");

        NumberStatistics stats = new NumberStatistics();

        while (true ) {
            int number = Integer.parseInt(reader.nextLine());
            if (number == -1) {
                break;
            }
            stats.addNumber(number);
        }

            System.out.println("Amount: " + stats.amountOfNumbers());
            System.out.println("sum: " + stats.sum());
            System.out.println("average: " + stats.average());
    }
}