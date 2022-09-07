package Week1;

import java.util.Scanner;

public class Ex22 {
    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);

        while (true) {
            System.out.println("Sisesta salasõna: ");
            String input = reader.nextLine();
            if (input.equals("Java")) {
                break;
            }
            System.out.println("Vale parool, proovi uuesti!");
        }

        System.out.println("Õige parool!");
        System.out.println("Salasõna: Java");
    }
}



