package Week3;

import java.util.Scanner;

public class Ex69 {
    public static boolean palindrome(String text) {

        String newString = "";
        char ch;

        for (int i = 0; i < text.length(); i++) {
            ch = text.charAt(i);
            newString = ch + newString;
        }

        return text.equals(newString);
    }

    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);

        System.out.println("Type a text: ");
        String text = reader.nextLine();
        if (palindrome(text)) {
            System.out.println("The text is a palindrome!");
        } else {
            System.out.println("The text is not a palindrome!");
        }
    }
}
