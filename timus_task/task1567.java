package timus_task;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;


public class task1567 {
//    id: 10895341
    public static void main(String[] args) throws IOException {
        String inputFileName = "timus_task/input.txt";
        boolean oj = System.getProperty("ONLINE_JUDGE") != null;
        try {
            BufferedReader bufferedReader =
                    oj ? new BufferedReader(new InputStreamReader(System.in)) :
                            new BufferedReader(new FileReader(inputFileName));
            HashMap<Character, Integer> keyAndValue = new HashMap<>();
            keyAndValue.put('a', 1);
            keyAndValue.put('b', 2);
            keyAndValue.put('c', 3);
            keyAndValue.put('d', 1);
            keyAndValue.put('e', 2);
            keyAndValue.put('f', 3);
            keyAndValue.put('g', 1);
            keyAndValue.put('h', 2);
            keyAndValue.put('i', 3);
            keyAndValue.put('j', 1);
            keyAndValue.put('k', 2);
            keyAndValue.put('l', 3);
            keyAndValue.put('m', 1);
            keyAndValue.put('n', 2);
            keyAndValue.put('o', 3);
            keyAndValue.put('p', 1);
            keyAndValue.put('q', 2);
            keyAndValue.put('r', 3);
            keyAndValue.put('s', 1);
            keyAndValue.put('t', 2);
            keyAndValue.put('u', 3);
            keyAndValue.put('v', 1);
            keyAndValue.put('w', 2);
            keyAndValue.put('x', 3);
            keyAndValue.put('y', 1);
            keyAndValue.put('z', 2);
            keyAndValue.put('.', 1);
            keyAndValue.put(',', 2);
            keyAndValue.put('!', 3);
            keyAndValue.put(' ', 1);
            int result = 0;
            String answer = bufferedReader.readLine();
            char[] charArray = answer.toCharArray();
            for (char c : charArray) {
                result += keyAndValue.get(c);
            }
            System.out.print(result);
        } catch (IOException exception) {
            exception.printStackTrace();
        }
    }
}
