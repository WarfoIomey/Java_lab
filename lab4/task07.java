package lab4;

public class task07 {
    public static void main(String[] args) {
        int arr[][];
        int heigth = 4;
        int length = 5;
        int filling = 0;
        int index = 0;
        arr = new int[heigth][length];
        for (int i=0; i < heigth; i++) {
            if (index == 0) {
                for (;index < length; index++) {
                    arr[i][index] = filling;
                    filling++;
                }
            } else {
                for (;index > 0;) {
                    index--;
                    arr[i][index] = filling;
                    filling++;
                }
            }
        }
        System.out.println("Массив");
        for (int i=0; i < heigth; i++) {
            for (int j = 0; j < length; j++) {
                System.out.print(arr[i][j] + " ");
            }
            System.out.println();
        }
    }
}
