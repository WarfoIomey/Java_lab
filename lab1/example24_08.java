package lab1;

import java.util.Scanner;


public class example24_08{
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Input first number: ");
        int first_number = in.nextInt();
        System.out.print("Input second_number: ");
        int second_number = in.nextInt();
        int result = second_number - first_number;
        System.out.printf("%d", result);
        in.close();
    }
}