package lab4;

import java.util.Random;

public class task05 {
    public static void main(String[] args) {
        int arr[][];
        Random random = new Random();
        int heigth = 3;
        int length = 5;
        arr = new int[heigth][length];
        int new_arr[][] = new int[length][heigth];
        for (int i=0; i < heigth; i++) {
            for (int j=0; j < length; j++) {
                arr[i][j] = random.nextInt(100);
            }
        }
        for (int i=0; i < heigth; i++) {
            for (int j = 0; j < length; j++) {
                new_arr[j][i] = arr[i][j];
            }
        }
        System.out.println("Старый массив");
        for (int i=0; i < heigth; i++) {
            for (int j = 0; j < length; j++) {
                System.out.print(arr[i][j] + " ");
            }
            System.out.println();
        }
        System.out.println("Новый массив");
        for (int i=0; i < length; i++) {
            for (int j = 0; j < heigth; j++) {
                System.out.print(new_arr[i][j] + " ");
            }
            System.out.println();
        }
    }
}
