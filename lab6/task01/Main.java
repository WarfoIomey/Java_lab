package lab6.task01;

public class Main {
    public static void main(String[] args) {
        char test_char = 'K';
        String test_string = "hello";
        char [] charArray = {'a', 'b', 'c', 'd', 'e'};
        char [] charArraOne = {'f'};
        Test test = new Test();
        test.setCharOrStringField(test_char);
        test.setCharOrStringField(test_string);
        test.setCharOrStringField(charArray);
        test.setCharOrStringField(charArraOne);
    }
}
