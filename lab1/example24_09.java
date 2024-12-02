package lab1;

import java.util.Scanner;


public class example24_09{
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Input number: ");
        int two_sequence = in.nextInt();
        int one_sequence = two_sequence - 1;
        int three_sequence = two_sequence + 1;
        int summa = one_sequence + two_sequence + three_sequence;
        double four_sequence = Math.pow(summa, 2);
        System.out.printf("%d, %d, %d, %.0f", one_sequence, two_sequence, three_sequence, four_sequence);
        in.close();
    }
}