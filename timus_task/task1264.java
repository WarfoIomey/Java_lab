package timus_task;

import java.io.PrintWriter;
import java.util.Scanner;

//id: 10816140
public class task1264 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        PrintWriter out = new PrintWriter(System.out);
        int number1 = in.nextInt();
        int number2 = in.nextInt();
        out.print(number1 * (number2+1));
        out.flush();
    }
}
