package timus_task;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class task1196 {
    // id: 10917518
    public static void main(String[] args) throws IOException {
        String inputFileName = "timus_task/input.txt";
        boolean oj = System.getProperty("ONLINE_JUDGE") != null;
        try {
            BufferedReader bufferedReader =
                    oj ? new BufferedReader(new InputStreamReader(System.in)) :
                            new BufferedReader(new FileReader(inputFileName));
            int result = 0;
            int sizeTeacher = Integer.parseInt(bufferedReader.readLine());
            int [] teacher = new int[sizeTeacher];
            for (int i = 0; i < sizeTeacher; i++) {
                teacher[i] = Integer.parseInt(bufferedReader.readLine());
            }
            int sizeStudent = Integer.parseInt(bufferedReader.readLine());
            int [] student = new int[sizeStudent];
            for (int i = 0; i < sizeStudent; i++) {
                student[i] = Integer.parseInt(bufferedReader.readLine());
            }
            for (int year : student) {
                if (Arrays.binarySearch(teacher, year) >= 0) {
                    result++;
                }
            }
            System.out.println(result);
        } catch (IOException exception) {
            exception.printStackTrace();
        }
    }
}
