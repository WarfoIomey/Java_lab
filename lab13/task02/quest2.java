package lab13.task02;

import java.util.InputMismatchException;
import java.util.Scanner;

public class quest2 {
    public static void main(String[] args) {
        int xLength = 3;
        int yLength = 3;
        int [][] matrix = new int[xLength][yLength];
        Scanner in = new Scanner(System.in);
        int column;
        while (true) {
            System.out.println("Введите столбец:");
            try {
                column = in.nextInt();
                if (0 <= column && column < yLength) {
                    break;
                } else {
                    throw new IndexOutOfBoundsException("Ошибка: размер должен быть меньше " + yLength + " и больше или равен 0!");
                }
            } catch (InputMismatchException e) {
                System.out.println("Ошибка: введите целое число! ");
                in.next();
            } catch (IndexOutOfBoundsException e) {
                System.out.println(e.getMessage());
            }
        }
        for (int i = 0; i < xLength; i++) {
            System.out.println(matrix[i][column]);
        }
    }
}
