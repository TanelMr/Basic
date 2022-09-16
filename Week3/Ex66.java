package Week3;

import java.util.ArrayList;

public class Ex66 {
    public static int greatest(ArrayList<Integer> list) {
        int i;
        int max = list.get(0);
        for (i = 1; i < list.size(); i++) {
            if (list.get(i) > max)
                max = list.get(i);
        }
        return max;
    }


    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();
        list.add(3);
        list.add(2);
        list.add(7);
        list.add(2);


        System.out.println("The greatest number is: " + greatest(list));
    }
}
