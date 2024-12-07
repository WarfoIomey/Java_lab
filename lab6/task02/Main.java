package lab6.task02;

public class Main {
    public static void main(String[] args) {
        int count = 6;
        Test test = new Test();
        for (int i=0; i < count; i++) {
            Test.printNumberFieldAndIncrement();
        }
    }
}
