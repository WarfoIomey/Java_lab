package lab1;

import java.util.Scanner;


public class example24_10{
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Input first number: ");
        int first_number = in.nextInt();
        System.out.print("Input second_number: ");
        int second_number = in.nextInt();
        int result_plus = second_number + first_number;
        int result_minus = second_number - first_number;
        System.out.printf("%d, %d", result_plus, result_minus);
        in.close();
    }
}