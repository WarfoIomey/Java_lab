package lab5.task03;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        creatObject test = new creatObject();
        Scanner in = new Scanner(System.in);
        System.out.print("Введите число 1: ");
        int number_1 = in.nextInt();
        System.out.print("Введите число 2: ");
        int number_2 = in.nextInt();
        test.setDontArguments();
        test.setOneArguments(number_1);
        test.setTwoArguments(number_1, number_2);
    }
}
