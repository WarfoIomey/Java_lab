package lab6.task03;

public class Test {
    public static void printMaxMinAvg(int... args) {
        int max_number = args[0];
        int min_number = args[0];
        int avg_number = 0;
        for (int number : args) {
            if (number > max_number) {
                max_number = number;
            } else if (number < min_number) {
                 min_number = number;
            }
            avg_number += number;
        }
        avg_number = avg_number / args.length;
        System.out.printf("Max: %d, Min: %d, AVG: %d\n", max_number, min_number, avg_number);
    }
}
