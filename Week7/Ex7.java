package Week7;

import java.util.ArrayList;
import java.util.Scanner;

public class Ex7 {
    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        Dictionary dictionary = new Dictionary();

//        dictionary.add("apina", "monkey");
//        dictionary.add("banaani", "banana");
//        dictionary.add("cembalo", "harpsichord");

//        ArrayList<String> translations = dictionary.translationList();
//        for(String translation: translations) {
//            System.out.println(translation);
//        }

        TextUserInterface ui = new TextUserInterface(reader, dictionary);
        ui.start();



    }
}
