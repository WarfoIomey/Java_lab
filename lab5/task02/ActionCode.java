package lab5.task02;

public class ActionCode {
    public char field1, field2;

    public void printBetweenSymbols(char field1, char field2) {
        this.field1 = field1;
        this.field2 = field2;
        int code_field1 = (int) field1;
        int code_field2 = (int) field2;
        while (code_field1 <= code_field2) {
            System.out.printf("Символ: %c, код: %d\n", (char) code_field1, code_field1);
            code_field1++;
        }
    }
}
