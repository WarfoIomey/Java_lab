package lab6.task08;

public class Main {
    public static void main(String[] args) {
        int [] intArray = {2, 4, 5 ,34, 557, 23};
        Test test = new Test();
        double result = Test.getAvgArray(intArray);
        System.out.println(result);
    }
}
