package lab6.task05;

public class Test {
    public static void sumPowIntNumber(int number) {
        int count = 1;
        int result = 0;
        while (count <= number) {
            result += Math.pow(count, 2);
            count ++;
        }
        System.out.printf("Равно= %d", result);
    }
}
