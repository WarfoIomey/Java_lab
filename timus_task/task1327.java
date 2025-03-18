package timus_task;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class task1327 {
    // id: 10910410
    public static void main(String[] args) throws IOException {
        String inputFileName = "timus_task/input.txt";
        boolean oj = System.getProperty("ONLINE_JUDGE") != null;
        try {
            BufferedReader bufferedReader =
                    oj ? new BufferedReader(new InputStreamReader(System.in)) :
                            new BufferedReader(new FileReader(inputFileName));
            int a = Integer.parseInt(bufferedReader.readLine());
            int b = Integer.parseInt(bufferedReader.readLine());
            int result = 0;
            for (int i = a; i <= b; i++) {
                if (i % 2 != 0) {
                    result++;
                }
            }
            System.out.println(result);
        } catch (IOException exception) {
            exception.printStackTrace();
        }
    }
}
