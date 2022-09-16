package Week3;

import java.util.ArrayList;
import java.util.Scanner;

public class Ex57 {
    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);

        ArrayList<String> words = new ArrayList<>();

        while(true) {
        System.out.println("Type a word: ");
        String word = reader.nextLine();
            if ( word.isEmpty() ) {
                break;
            }
            else {
                words.add(word);
            }
        }
        System.out.println("You typed the words: " + words);
    }
}
