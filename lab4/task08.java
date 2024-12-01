package lab4;

import java.util.InputMismatchException;
import java.util.Scanner;

public class task08 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Введите текст для шифрования: ");
        String text = in.nextLine();
        System.out.print("Введите ключ: ");
        int key = in.nextInt();
        char [] strToArray = text.toCharArray();
        String reform_text = "";
        String previous_text = "";
        for (char symbol: strToArray) {
            int key_ascii = (int) symbol;
            key_ascii += key;
            char symbol_for_ascii = (char) key_ascii;
            reform_text = reform_text.concat(Character.toString(symbol_for_ascii));
        }
        System.out.printf("Текст после преобразования: %s\n", reform_text);
        System.out.print("Выполнить обратное преобразование? (y/n)\n");
        boolean check = true;
        while (check) {
            try {
                Scanner reform = new Scanner(System.in);
                String choice = reform.nextLine();
                if (choice.equals("y")) {
                    char [] textToArray = reform_text.toCharArray();
                    for (char symbol: textToArray) {
                        int key_ascii = (int) symbol;
                        key_ascii -= key;
                        char symbol_for_ascii = (char) key_ascii;
                        previous_text = previous_text.concat(Character.toString(symbol_for_ascii));
                    }
                    System.out.printf("Обратное преобразование: %s", previous_text);
                    check = false;
                } else if (choice.equals("n")) {
                    System.out.print("До свидания!");
                    check = false;
                } else {
                    System.out.println("Введите корректный ответ");
                }
            } catch (InputMismatchException e) {
                System.out.println("Введите корректный ответ");
            }
        }
    }
}
