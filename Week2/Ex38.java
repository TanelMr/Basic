package Week2;

import java.util.Scanner;

public class Ex38 {

    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);

        System.out.println("Sisesta teksti korduste arv: ");
        int repeatCount = Integer.parseInt(reader.nextLine());
        int count = 1;

        while (repeatCount >= count) {
            printText();
            count++;
        }
    }
    public static void printText() {
        System.out.println("Üks rida teksti");
    }
}
