package timus_task;

import java.io.PrintWriter;
import java.util.Scanner;

public class task2066 {
    public static void main(String[] args) {
        // id : 10882338
        Scanner in = new Scanner(System.in);
        PrintWriter out = new PrintWriter(System.out);
        int a = in.nextInt();
        int b = in.nextInt();
        int c = in.nextInt();
        int min = 0;
        int[] list = new int[9];
        list[0] = a + b + c;
        list[1] = a + b - c;
        list[2] = a - b + c;
        list[3] = a - b - c;
        list[4] = a * b * c;
        list[5] = a * b + c;
        list[6] = a + b * c;
        list[7] = a * b - c;
        list[8] = a - b * c;
        for (int i = 0; i < list.length; i++) {
            if (min > list[i]) {
                min = list[i];
            }
        }
        out.print(min);
        out.flush();
    }
}
