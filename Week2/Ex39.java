package Week2;

public class Ex39 {
    public static void printStars(int times) {

        int count = 0;
        while (count < times) {
            System.out.print("*");
            count++;
        }
        System.out.println();
    }

    public static void main(String[] args) {
        printStars(5);
        printStars(3);
        printStars(9);
    }
}
