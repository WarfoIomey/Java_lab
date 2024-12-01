package lab5.task01;

public class Main {
    public static void main(String[] args) {
        ActionString test = new ActionString();

        test.setField1('K');
        System.out.println(test.getCodeSymbol());

        test.showCodeAndValue();
    }
}
