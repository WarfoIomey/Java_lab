package lab11.task05;

import java.util.List;
import java.util.stream.Collectors;

public class Main {
    public static void main(String[] args) {
        String string = "Напишите функцию, Которая принимает на вход список, " +
                "строк и возвращает новый, Содержащий только те строки, " +
                "которые Начинаются с большой буквы список.";
        List<String> strings = List.of(string.split(","));
        System.out.println("\n" + "Строка после сплитирования : " + "\n");
        for (String e : strings) {
            System.out.println(e);
        }
        List<String> stringsAfter = fingWordStrings(strings, "список");
        System.out.println("\n" + "Строка после преобразования : " + "\n");
        for (String e : stringsAfter) {
            System.out.println(e);
        }
    }

    public static List<String> fingWordStrings(List<String> list, String find) {
        return list.stream()
                .filter(s -> s.contains(find))
                .collect(Collectors.toList());
    }
}
