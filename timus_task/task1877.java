package timus_task;

import java.io.PrintWriter;
import java.util.Scanner;

//id: 10816113
public class task1877 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        PrintWriter out = new PrintWriter(System.out);
        int padlock_1 = in.nextInt();
        int padlock_2 = in.nextInt();
        String result = "no";
        int first_password_robber = 0;
        for (;first_password_robber < 9999; first_password_robber++) {
            if (padlock_1 == first_password_robber) {
                result = "yes";
                break;
            } else {
                int temp = padlock_1;
                padlock_1 = padlock_2;
                padlock_2 = temp;
            }
        }
        out.print(result);
        out.flush();
    }
}
