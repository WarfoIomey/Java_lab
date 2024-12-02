package lab1;

import java.util.Scanner;


public class example24_07{
    public static void main(String[] args) {
        int current_year = 2024;
        int your_year = 0;
        Scanner in = new Scanner(System.in);
        System.out.print("Input your age: ");
        int age = in.nextInt();
        your_year = current_year - age;
        System.out.printf("%d", your_year);
        in.close();
    }
}