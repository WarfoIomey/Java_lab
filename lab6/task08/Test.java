package lab6.task08;

public class Test {
    public static double getAvgArray(int [] intArray) {
        double result = 0;
        for (int number : intArray) {
            result += number;
        }
        result /= intArray.length;
        return result;
    }
}
