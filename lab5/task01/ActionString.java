package lab5.task01;

public class ActionString {
    private char field1;

    public void setField1(char field1) {
        this.field1 = field1;
    }

    public int getCodeSymbol() {
        return field1;
    }

    public void showCodeAndValue() {
        System.out.println(field1);
        System.out.println((int) field1);
    }
}