package Week4;

import java.util.Scanner;

public class Ex79 {
    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        System.out.println("Insert number: ");

        NumberStatistics stats = new NumberStatistics();
        NumberStatistics all = new NumberStatistics();
        NumberStatistics even = new NumberStatistics();
        NumberStatistics odd = new NumberStatistics();


        while (true ) {
            int number = Integer.parseInt(reader.nextLine());
            if (number == -1) {
                break;
            }
            stats.addNumber(number);
            all.addNumber(number);
            if(number % 2 == 0){
                even.addNumber(number);
            } else {
                odd.addNumber(number);
            }
        }

            System.out.println("Amount: " + stats.amountOfNumbers());
            System.out.println("sum: " + stats.sum());
            System.out.println("average: " + stats.average());
            System.out.println("sum of even: " + even.sum());
            System.out.println("sum of odd: " + odd.sum());
    }
}