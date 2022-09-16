package Week3;

import java.util.ArrayList;

public class Ex64 {

    public static double average(ArrayList<Integer> list) {
        double numberSum = 0;
        for(int number : list ) {
           numberSum = number + numberSum;
        }
        return numberSum/4;
       }

    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();
        list.add(3);
        list.add(2);
        list.add(7);
        list.add(2);

        System.out.println("The average is: " + average(list));
    }

}
