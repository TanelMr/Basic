package Week2;

import java.util.Scanner;

public class Ex36 {
    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);

        System.out.println("Insert number: ");
        int number;
        int sum = 0;
        int count = 0;
        double average = 0;
        int even = 0;
        int odd = 0;

        while (true) {
            number = Integer.parseInt(reader.nextLine());
            if (number == -1) {
                break;
            }
            sum += number;
            count++;
            average = (double)sum/count;
            if (number % 2 == 0){
                even++;
            }
            else {
                odd++;
            }
        }

        System.out.println("Thank you and see you later!");
        System.out.println("Sum of numbers: " + sum);
        System.out.println("Inserted numbers: " + count);
        System.out.println("Average of inserted numbers: " + average);
        System.out.println("Even numbers: " + even);
        System.out.println("Odd numbers: " + odd);

    }
}
