package timus_task;

import java.io.PrintWriter;
import java.util.Scanner;

public class task1068 {
    // id: 10884039
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        PrintWriter out = new PrintWriter(System.out);
        int n = in.nextInt();
        int result = 0;
        while (n != 1) {
            result += n;
            if (n > 0) {
                n -= 1;
            } else {
                n += 1;
            }
        }
        out.println(result+1);
        out.flush();
    }
}
