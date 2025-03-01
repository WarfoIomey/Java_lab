package timus_task;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class task2056 {
    // id: 10895350
    public static void main(String[] args) throws IOException {
        String inputFileName = "timus_task/input.txt";
        boolean oj = System.getProperty("ONLINE_JUDGE") != null;
        try {
            BufferedReader bufferedReader =
                    oj ? new BufferedReader(new InputStreamReader(System.in)) :
                            new BufferedReader(new FileReader(inputFileName));
            int length = Integer.parseInt(bufferedReader.readLine());
            int result = 0;
            boolean statusNominal = true;
            boolean statusScholarship = true;
            for (int i = 0; i < length; i++) {
                int score = Integer.parseInt(bufferedReader.readLine());
                result += score;
                if (score == 3) {
                    statusScholarship = false;
                    break;
                } else if (score != 5) {
                    statusNominal = false;
                }
            }
            if (!statusScholarship) {
                System.out.println("None");
            } else if (statusNominal) {
                System.out.println("Named");
            } else if (((double) result / length) >= 4.5) {
                System.out.println("High");
            } else {
                System.out.println("Common");
            }
        } catch (IOException exception) {
            exception.printStackTrace();
        }
    }
}
