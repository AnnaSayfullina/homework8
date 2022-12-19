import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        task1();
    }

    public static void task1() {
        System.out.println("Задача");
        System.out.println("1 массив");
        int[] integer = new int[3];
        integer[0] = 1;
        integer[1] = 2;
        integer[2] = 3;
        System.out.println(Arrays.toString(integer));
        for (int i = 2; i < 3; i--) {
            if (i == 0) {
                System.out.println(integer[i]);
                break;
            }
            System.out.print(integer[i] + ", ");
        }
        for (int i = 0; i<= integer.length - 1; i++) {
            if (integer[i] % 2 != 0) {
                integer[i]++;
            }
        }
        System.out.println(Arrays.toString(integer));

        System.out.println("2 массив");
        float[] fractionalNumber = {1.57f, 7.654f, 9.986f};
        System.out.println(Arrays.toString(fractionalNumber));
        for (int i = fractionalNumber.length - 1; i >= 0; i--) {
            if (i == 0) {
                System.out.println(fractionalNumber[i]);
                break;
            }
            System.out.print(fractionalNumber[i] + ", ");
        }

        System.out.println("3 массив");
        int[] anna = {3, 19, 10, 15, 27, 29, 31};
        System.out.println(Arrays.toString(anna));
        for (int i = anna.length - 1; i >= 0; i--) {
            if (i == 0) {
                System.out.println(anna[i]);
                break;
            }
            System.out.print(anna[i] + ", ");
        }
    }
}