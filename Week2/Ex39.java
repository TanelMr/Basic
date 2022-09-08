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
    }

    public static void printRectangle(int width, int height) {

        int count = 0;

        while (count < height) {
            printStars(width);
            count++;
        }
    }

    public static void printTriangle(int size) {

        int count = 0;
        int repetition = -1;

        while (repetition < size) {
            printStars(count);
            count++;
            repetition++;
        }
    }

    public static void main(String[] args) {
        printStars(5);
        printStars(3);
        printStars(9);

        System.out.println();

        printSquare(4);

        System.out.println();

        printRectangle(5 , 3);

        System.out.println();

        printTriangle(5);
    }
}
