package lab3;

import java.util.Scanner;
import java.util.Random;

public class nine_work {
    public static void main (String[] args) {
        Scanner in = new Scanner(System.in);
        Random random = new Random();
        System.out.print("Введите длинну массива: ");
        int length_array = in.nextInt();
        int[] list = new int[length_array];
        for (int i = 0; i < length_array; i++) {
            list[i] = random.nextInt(200);
            System.out.printf("%d, ", list[i]);
        }
        ElementArray.SearchMinElement(list);
    }
    static class ElementArray {
        static void SearchMinElement (int[] list) {
            int last_number = list[0];
            for (int i = 0; i < list.length; i++) {
                if (last_number > list[i]) {
                    last_number = list[i];
                }
            }
            System.out.printf("\nМинимальное числов в списке: %d, индексы: ", last_number);
            for (int i = 0; i < list.length; i++) {
                if (last_number == list[i]) {
                    System.out.printf("%d, ", i);
                }
            }
        }
    }
}
