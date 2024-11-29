package lab4;

import java.util.Random;

public class task06 {
    public static void main(String[] args) {
        int arr[][];
        Random random = new Random();
        int heigth = 4;
        int length = 7;
        int index_str = random.nextInt(0, heigth+1);
        int index_column = random.nextInt(0, length+1);
        int last_index_str = 0;

        arr = new int[heigth][length];
        int new_arr[][] = new int[heigth-1][length-1];
        for (int i=0; i < heigth; i++) {
            for (int j=0; j < length; j++) {
                arr[i][j] = random.nextInt(100);
            }
        }
        for (int i=0; i < heigth-1; i++) {
            int last_index_column = 0;
            if (i == index_str) {
                last_index_str++;
            }
            for (int j=0; j < length-1; j++) {
                if (j == index_column) {
                    last_index_column++;
                }
                new_arr[i][j] = arr[last_index_str][last_index_column];
                last_index_column++;
            }
            last_index_str++;
        }
        System.out.println("Старый массив");
        for (int i=0; i < heigth; i++) {
            for (int j = 0; j < length; j++) {
                System.out.print(arr[i][j] + " ");
            }
            System.out.println();
        }
        System.out.printf("Новый массив Удалена строка: %d Столбец: %d\n", index_str, index_column);
        for (int i=0; i < heigth-1; i++) {
            for (int j = 0; j < length-1; j++) {
                System.out.print(new_arr[i][j] + " ");
            }
            System.out.println();
        }
    }
}
