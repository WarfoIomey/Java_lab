package timus_task;

import java.io.PrintWriter;
import java.util.Scanner;

// id: 10814333
public class task1409 {
    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);
        PrintWriter out = new PrintWriter(System.out);

        int garry = in.nextInt();
        int larry = in.nextInt();
        int max_pots = (garry + larry) - 2;
        int miss_garry = max_pots - (garry - 1);
        int miss_larry = max_pots - (larry - 1);
        out.printf("%d %d", miss_garry, miss_larry);
        out.flush();
    }
}
