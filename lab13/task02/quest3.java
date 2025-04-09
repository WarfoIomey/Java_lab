package lab13.task02;

import java.util.InputMismatchException;
import java.util.Scanner;

public class quest3 {
    public static void main(String[] args) {
        int length = 2;
        byte [] arrByte = new byte[length];
        Scanner in = new Scanner(System.in);
        for (int i = 0; i < length; i++) {
            while (true) {
                System.out.print("Введите элемент " + i + ": ");
                try {
                    arrByte[i] = in.nextByte();
                    break;
                } catch (InputMismatchException e) {
                    System.out.println("Ошибка: введите число типа byte " + e);
                    in.next();
                }
            }
        }
        try {
            byte sum = calculateByteSum(arrByte);
            System.out.println("Сумма элементов: " + sum);
        } catch (ArithmeticException e) {
            System.out.println("Ошибка: сумма вышла за границы типа byte!");
        }
    }
    public static byte calculateByteSum(byte[] arr) {
        int sum = 0;
        for (byte num : arr) {
            sum += num;
            if (sum > Byte.MAX_VALUE || sum < Byte.MIN_VALUE) {
                throw new ArithmeticException("Переполнение byte!");
            }
        }
        return (byte) sum;
    }
}
