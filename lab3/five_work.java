package lab3;

import java.util.Scanner;
import java.util.Random;

public class five_work {
    public static void main (String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Введите количество чисел: ");
        int count_number = in.nextInt();
        Random random = new Random();
        SumNumbers.ForSum(count_number, random);
        SumNumbers.WhileSum(count_number, random);
    }
    static class SumNumbers{
        static void ForSum(int count_number, Random random) {
            System.out.println("Оператор For");
            int result = 0;
            for (;count_number > 0;) {
                int number = random.nextInt(1000);
                if (number % 5 == 2 || number % 3 ==1) {
                    result += number;
                    if (count_number == 1) {
                        System.out.printf("%d", number);
                    } else {
                        System.out.printf("%d + ", number);
                    }
                    count_number--;
                }
            }
            System.out.printf(" = %d", result);
        }
    static void WhileSum(int count_number, Random random) {
        System.out.println("\nОператор while");
        int result = 0;
        while (count_number > 0) {
            int number = random.nextInt(1000);
            if (number % 5 == 2 || number % 3 ==1) {
                result += number;
                if (count_number == 1) {
                    System.out.printf("%d", number);
                } else {
                    System.out.printf("%d + ", number);
                }
                count_number--;
            }
        }
        System.out.printf(" = %d", result);
    }
    }
}
