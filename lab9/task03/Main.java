package lab9.task03;

import java.util.Random;
import java.util.Scanner;
import java.util.Random;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Введите длинну массива");
        int number = in.nextInt();
        int [] listTest = new int[number];
        InputList(0, listTest);
        System.out.println("Проверка массива: ");
        OutputList(0, listTest);
    }
    public static void OutputList(int index, int [] listTest) {
        if (index < listTest.length) {
            System.out.println("индекс: " + index + " элемент: " + listTest[index]);
            index++;
            OutputList(index, listTest);
        } else {
            System.out.println("Проверка завершена!");
        }
    }

    public static void InputList(int number, int [] listTest) {
        if (number < listTest.length) {
            Random random = new Random();
            int element = random.nextInt(200);
            listTest[number] = element;
            System.out.println("индекс: " + number + " элемент: " + element);
            number++;
            InputList(number, listTest);
        } else {
            System.out.println("Проверка завершена!");
        }
    }
}

