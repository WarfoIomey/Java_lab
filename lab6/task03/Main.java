package lab6.task03;

public class Main {
    public static void main(String[] args) {
        int two = 2;
        int three = 3;
        int four = 4;
        int five = 6;
        int six = 30;
        int seven = 62;
        Test test = new Test();
        Test.printMaxMinAvg(two);
        Test.printMaxMinAvg(two, three);
        Test.printMaxMinAvg(two, three, four);
        Test.printMaxMinAvg(two, three, four, five);
        Test.printMaxMinAvg(three, four, five, six);
        Test.printMaxMinAvg(four, five, six, seven);
    }
}
