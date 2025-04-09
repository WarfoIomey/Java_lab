package timus_task;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class task1636 {
    // id: 10931331
    public static void main(String[] args) throws IOException {
        String inputFileName = "timus_task/input.txt";
        boolean oj = System.getProperty("ONLINE_JUDGE") != null;
        try {
            BufferedReader bufferedReader =
                    oj ? new BufferedReader(new InputStreamReader(System.in)) :
                            new BufferedReader(new FileReader(inputFileName));
            String [] strOne = bufferedReader.readLine().split(" ");
            String [] strTwo = bufferedReader.readLine().split(" ");
            int fineQXX = Integer.parseInt(strOne[0]);
            int fineZZZ = Integer.parseInt(strOne[1]);
            int fineTime = 0;
            for (int i = 0; i < strTwo.length; i++) {
                fineTime += Integer.parseInt(strTwo[i]);
            }
            if (fineQXX <= (fineZZZ - fineTime * 20)) {
                System.out.println("No chance.");
            } else {
                System.out.println("Dirty debug :(");
            }
        } catch (IOException exception) {
            exception.printStackTrace();
        }
    }
}
