package lab1;

import java.util.Scanner;


public class example24_05{
    public static void main(String[] args) {
        int current_year = 2024;
        int age = 0;
        Scanner in = new Scanner(System.in);
        System.out.print("Input your year borth: ");
        int year = in.nextInt();
        age = current_year - year;
        System.out.printf("Your age:%d", age);
        in.close();
    }
}