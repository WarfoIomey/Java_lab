package lab1;

import java.util.Scanner;


public class example24_03{
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
	System.out.print("Input day today: ");
	String day = in.nextLine();
	System.out.print("Input name mounth: ");
	String mounth = in.nextLine();
	System.out.print("Input data: ");
	int data = in.nextInt();
	System.out.printf("(%s, %s, %d)", day, mounth, data);
	in.close();
    }
}