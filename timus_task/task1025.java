package timus_task;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class task1025 {
    //id: 10954905
    public static void main(String[] args) throws IOException {
        String inputFileName = "timus_task/input.txt";
        boolean oj = System.getProperty("ONLINE_JUDGE") != null;
        try {
            BufferedReader bufferedReader =
                    oj ? new BufferedReader(new InputStreamReader(System.in)) :
                            new BufferedReader(new FileReader(inputFileName));
            int count_group = Integer.parseInt(bufferedReader.readLine());
            String [] arr = bufferedReader.readLine().split(" ");
            int [] voters = new int [count_group];
            for (int i = 0; i < count_group; i++) {
                int size = Integer.parseInt(arr[i]);
                voters[i] = size / 2 + 1;
            }

            Arrays.sort(voters);

            int neededGroups = count_group / 2 + 1;
            int total = 0;

            for (int i = 0; i < neededGroups; i++) {
                total += voters[i];
            }

            System.out.println(total);
        } catch (IOException exception) {
            exception.printStackTrace();
        }
    }
}
