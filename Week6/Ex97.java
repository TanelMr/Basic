package Week6;

public class Ex97 {

        public static void main(String[] args) {
            int[] array = {5, 1, 3, 4, 2};
            printElegantly(array);
        }

        public static void printElegantly(int[] array) {
            int i = 0;
            String list = "";
            while(i < array.length){
                list = list + array[i] + "," + " ";
                i++;
            }
            list = list.substring(0, list.length() - 2);
            System.out.println(list);

        }
    }
