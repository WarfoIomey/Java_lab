package lab1;

import java.util.Scanner;


public class example24_04{
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
	System.out.print("Input name mounth: ");
	String mounth = in.nextLine();
	System.out.print("Input quantity day: ");
	int day = in.nextInt();
	System.out.printf("%s - %d", mounth, day);
	in.close();
    }
}