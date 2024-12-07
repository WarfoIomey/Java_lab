package lab6.task10;

public class Test {
    public static int [] getMaxMinArray(int... args) {
        int [] intArray = {args[0], args[0]};
        for (int number : args) {
            if (intArray[0] < number) {
                intArray[0] = number;
            } else if (intArray[1] > number) {
                intArray[1] = number;
            }
        }
        return intArray;

    }
}
