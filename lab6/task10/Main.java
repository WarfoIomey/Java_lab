package lab6.task10;

public class Main {
    public static void main(String[] args) {
        int number1 = 10;
        int number2 = 12;
        int number3 = -3;
        int number4 = 313;
        int number5 = 23;
        Test test = new Test();
        int[] result = Test.getMaxMinArray(number1, number2, number4);
        int[] result2 = Test.getMaxMinArray(number3, number2, number5);
        int[] result3 = Test.getMaxMinArray(number1, number2, number4, number3);
        System.out.printf("Max: %d, Min: %d\n", result[0], result[1]);
        System.out.printf("Max: %d, Min: %d\n", result2[0], result2[1]);
        System.out.printf("Max: %d, Min: %d\n", result3[0], result3[1]);

    }
}
