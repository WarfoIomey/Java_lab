package lab5.task04;

import java.math.BigDecimal;

public class Test {
    public char field1;
    public int number1;

    public void setFieldAndNumber(char field1, int number1) {
        this.field1 = field1;
        this.number1 = number1;
        System.out.printf("Создан объект с полем: %c и числом: %d\n", this.field1, this.number1);
    }

    public void setFieldAndNumberDouble(double number_double) {
        BigDecimal bigDecimal = new BigDecimal(String.valueOf(number_double));
        int intValue = bigDecimal.intValue();
        number_double = Math.floor(number_double * 100.0) / 100.0;
        String numberDouble = String.valueOf(number_double);
        numberDouble = numberDouble.substring(numberDouble.indexOf(".")).substring(1);
        this.field1 = (char) intValue;
        this.number1 = Integer.parseInt(numberDouble);
        System.out.printf("Значение double преобразовались в поле field1: %c, number1: %d\n", this.field1, this.number1);
    }

}
