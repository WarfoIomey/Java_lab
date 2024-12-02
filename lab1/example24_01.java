package lab1;

import java.util.Scanner;


public class example24_01{
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
	System.out.print("Input family: ");
	String family = in.nextLine();
	System.out.print("Input name: ");
	String name = in.nextLine();
	System.out.print("Input pytronomic: ");
	String pytronomic = in.nextLine();
	System.out.printf("Hallo %s, %s, %s", family, name, pytronomic);
	in.close();
    }
}