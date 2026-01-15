import java.util.Arrays;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        System.out.println("Задание 1!");

        int[] num = new int[3];
        num[0] = 1;
        num[1] = 2;
        num[2] = 3;
        float[] num2 = {1.57f, 7.654f, 9.986f};
        int[] num3 = new int[7];
        num3[0] = 1;
        num3[1] = 2;
        num3[2] = 3;
        num3[3] = 10;
        num3[4] = 8;
        num3[5] = 25;
        num3[6] = 7;

        System.out.println("Задание 2!");

        for (int i = 0; i < num.length; i++) {
            if (i > 0) {
                System.out.print(", ");
            }
            System.out.print(num[i]);
        }
        System.out.println();

        for (int i = 0; i < num2.length; i++) {
            if (i > 0) {
                System.out.print(", ");
            }
            System.out.print(num2[i]);
        }
        System.out.println();

        for (int i = 0; i < num3.length; i++) {
            if (i > 0) {
                System.out.print(", ");
            }
            System.out.print(num3[i]);
        }
        System.out.println();

        System.out.println("Задание 3!");

        for (int i = num.length-1; i >= 0; i--) {
            System.out.print(num[i]);
            if (i > 0) {
                System.out.print(", ");
            }
        }
        System.out.println();

        for (int i = num2.length - 1; i >= 0; i--) {
            System.out.print(num2[i]);
            if (i > 0) {
                System.out.print(", ");
            }
        }
        System.out.println();

        for (int i = num3.length - 1; i >= 0; i--) {
            System.out.print(num3[i]);
            if (i > 0) {
                System.out.print(", ");
            }
        }
        System.out.println();

        System.out.println("Задание 4! ");

        for (int n = 0; n < num.length; n++) {
            if (num[n] % 2 != 0) {
                num[n] += 1;
            }
        }
        System.out.println(Arrays.toString(num)); //num[0] = 1; num[1] = 2; num[2] = 3;
    }
}