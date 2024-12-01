package lab5.task04;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Введите число: ");
        int number = in.nextInt();
        System.out.print("Введите символ: ");
        char symbol = in.next().charAt(0);
        System.out.print("Введите число double: ");
        double number_double = in.nextDouble();

        Test test = new Test();

        test.setFieldAndNumber(symbol, number);
        test.setFieldAndNumberDouble(number_double);
    }
}
