package lab1;

import java.util.Scanner;


public class example24_02{
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
	System.out.print("Input name: ");
	String name = in.nextLine();
	System.out.print("Input age: ");
	int age = in.nextInt();
	System.out.printf("name: %s,  age: %d", name, age);
	in.close();
    }
}