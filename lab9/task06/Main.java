package lab9.task06;

import java.util.HashMap;
import java.util.Map;

public class Main {
    public static void main(String[] args) {
        HashMap<Integer, String> keyAndValue = new HashMap<>();
        int result = 1;
        // Заполнение HashMap.
        for (int i = 0; i <= 10; i++) {
            String test = "Hi";
            keyAndValue.put(i, test.repeat(i));
        }
        System.out.println(keyAndValue);
        // Вывод всех значений у которых ключ > 5.
        for (Integer key : keyAndValue.keySet()) {
            if (key < 5) {
                continue;
            }
            System.out.println(keyAndValue.get(key));
        }
        // Перемножение всех ключей у которых значение > 5.
        for (Map.Entry<Integer, String> entry : keyAndValue.entrySet()) {
            String check = entry.getValue();
            if (check.length() > 5) {
                result *= entry.getKey();
            }
        }
        System.out.println(result);
    }
}
