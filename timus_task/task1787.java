package timus_task;

import java.io.PrintWriter;
import java.util.Scanner;


public class task1787 {
    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);
        PrintWriter out = new PrintWriter(System.out);

        int k = in.nextInt();
        int n = in.nextInt();
        int cars = 0;
        for (int i = 0; i < n; i++) {
            int a = in.nextInt();
            cars = cars + a - k;
            if (cars < 0) {
                cars = 0;
            }
        }
        out.printf("%d", cars);
        out.flush();
    }
}
