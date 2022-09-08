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

    public static void printSquare(int sideSize) {

        int count = 0;

        while (count < 4) {
            printStars(sideSize);
            count++;
        }

        System.out.println();
    }

    public static void printRectangle(int width, int height) {

        int count = 0;

        while (count < height) {
            printStars(width);
            count++;
        }

        System.out.println();
    }

    public static void main(String[] args) {
        printStars(5);
        printStars(3);
        printStars(9);

        System.out.println();

        printSquare(4);

        System.out.println();

        printRectangle(5 , 3);
    }
}
