package lab6.task07;

public class Main {
    public static void main(String[] args) {
        char[] charArray = {'a', 'b', 'c', 'f', 'k'};
        Test test = new Test();
        int [] result = Test.codeArrayChar(charArray);
        for (int number : result) {
            System.out.println(number);
        }
    }
}
