package lab11.task09;

import java.util.List;
import java.util.stream.Collectors;

public class Main {
    public static void main(String[] args) {
        String string = "Напиши23те функцию, Которая принимает на вход список " +
                "строк и возвращает, новый список, Содержащий толь32ко те строки, " +
                "которые Начинаются, с бол23ьшой буквы.";
        List<String> strings = List.of(string.split(","));
        System.out.println("\n" + "Строка после сплитирования : " + "\n");
        for (String e : strings) {
            System.out.println(e);
        }
        List<String> stringsAfter = filterNumberStrings(strings);
        System.out.println("\n" + "Строка после преобразования : " + "\n");
        for (String e : stringsAfter) {
            System.out.println(e);
        }
    }

    public static List<String> filterNumberStrings(List<String> list) {
        return list.stream()
                .filter(s -> !s.matches(".*\\d+.*"))
                .collect(Collectors.toList());
    }
}
