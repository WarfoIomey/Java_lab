package lab6.task06;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Введите число");
        int number = in.nextInt();
        int[] array = {23, 32, 45, 67, 89, 65};
        Test test = new Test();
        int [] result = Test.newArrayArgument(array, number);
        for (int arr : result) {
            System.out.println(arr);
        }
    }
}
