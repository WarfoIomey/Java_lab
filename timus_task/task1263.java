package timus_task;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class task1263 {
    public static void main(String[] args) throws IOException {
        // id: 10910358
        String inputFileName = "timus_task/input.txt";
        boolean oj = System.getProperty("ONLINE_JUDGE") != null;
        try {
            BufferedReader bufferedReader =
                    oj ? new BufferedReader(new InputStreamReader(System.in)) :
                            new BufferedReader(new FileReader(inputFileName));
            String [] str = bufferedReader.readLine().split(" ");
            int countCandidates = Integer.parseInt(str[0]);
            int [] counting = new int[countCandidates];
            int countVoters = Integer.parseInt(str[1]);
            for (int i = 0; i < countVoters; i++) {
                int number = Integer.parseInt(bufferedReader.readLine());
                counting[number-1]++;
            }
            for (int i = 0; i < counting.length; i++) {
                float percent = (100 * (float) counting[i]) / countVoters;
                System.out.println(String.format("%.2f%%", percent));
            }
        } catch (IOException exception) {
            exception.printStackTrace();
        }
    }
}
