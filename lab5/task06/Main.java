package lab5.task06;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Введите число 1: ");
        int number_1 = in.nextInt();
        System.out.print("Введите число 2: ");
        int number_2 = in.nextInt();

        Test test = new Test();
        System.out.print("\nТест с 1 аргументом");
        test.setMaxAndMin(number_1);
        test.showMaxMin();
        System.out.print("\nТест с 2 аргументами");
        test.setMaxAndMin(number_1, number_2);
        test.showMaxMin();
    }
}
