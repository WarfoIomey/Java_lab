package lab3;

import java.util.InputMismatchException;
import java.util.Scanner;
import java.util.Random;

public class six_work {
    public static void main (String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Введите длинну массива: ");
        try {
            int length_list = in.nextInt();
            Random random = new Random();
            CompletionList.Completion(length_list, random);
        }
        catch (InputMismatchException e) {
            System.out.println("Некорректно введеная длина");
        }
    }
    static class CompletionList {
        static void Completion (int length_list, Random random) {
            int[] result = new int[length_list];
            System.out.println("Числа которые вошли в массив");
            while (length_list > 0) {
                int number = random.nextInt(1000);
                if (number % 5 == 2) {
                    result[length_list-1] = number;
                    System.out.printf("%d, ", number);
                    length_list--;
                }
            }
        }
    }
}
