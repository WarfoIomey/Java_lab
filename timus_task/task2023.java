package timus_task;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.Map;

public class task2023 {
    // id: 10884066
    public static void main(String[] args) throws IOException {
        String inputFileName = "timus_task/input.txt";
        boolean oj = System.getProperty("ONLINE_JUDGE") != null;
        try {
            BufferedReader bufferedReader =
                    oj ? new BufferedReader(new InputStreamReader(System.in)) :
                            new BufferedReader(new FileReader(inputFileName));
            String readLine = "";
            int n = Integer.parseInt(bufferedReader.readLine());
            int result = 0;
            int index = 1;
            Map<String,String> firstBoard = new HashMap<String,String>() {{
                put("Alice", "1");
                put("Ariel", "2");
                put("Aurora", "3");
                put("Phil", "4");
                put("Peter", "5");
                put("Olaf", "6");
                put("Phoebus", "7");
                put("Ralph", "8");
                put("Robin", "9");
            }};
            Map<String,String> secondBoard = new HashMap<String,String>() {{
                put("Bambi", "1");
                put("Belle", "2");
                put("Bolt", "3");
                put("Mulan", "4");
                put("Mowgli", "5");
                put("Mickey", "6");
                put("Silver", "7");
                put("Simba", "8");
                put("Stitch", "9");;
            }};
            Map<String,String> thirdBoard = new HashMap<String,String>() {{
                put("Dumbo", "1");
                put("Genie", "2");
                put("Jiminy", "3");
                put("Kuzko", "4");
                put("Kida", "5");
                put("Kenai", "6");
                put("Tarzan", "7");
                put("Tiana", "8");
                put("Winnie", "9");
            }};
            while ((readLine = bufferedReader.readLine()) != null) {
                if (firstBoard.containsKey(readLine)) {
                    if (index != 1) {
                        if (index == 3) {
                            result += 2;
                        } else {
                            result++;
                        }
                    }
                    index = 1;
                } else if (secondBoard.containsKey(readLine)) {
                    if (index != 2) {
                        result++;
                    }
                    index = 2;
                } else if (thirdBoard.containsKey(readLine)) {
                    if (index != 3) {
                        if (index == 1) {
                            result += 2;
                        } else {
                            result++;
                        }
                    }
                    index = 3;
                }
            }
            System.out.println(result);
        } catch (IOException exception) {
            exception.printStackTrace();
        }
    }
}
