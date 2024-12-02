package lab1;

import java.util.Scanner;


public class example24_11{
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Input katet a: ");
        int a = in.nextInt();
        System.out.print("Input katet b: ");
        int b = in.nextInt();
        double result = Math.exp(b * Math.log(a));
        System.out.printf("%.0f", result);
        in.close();
    }
}