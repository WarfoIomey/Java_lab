package lab5.task03;

public class creatObject {
    public Integer number1, number2;

    public void setDontArguments() {
        System.out.println("Создание объекта без аргументов");
    }

    public void setOneArguments(int number1) {
        this.number1 = number1;
        System.out.printf("Создание объекта с аргументом: %d\n", this.number1);
    }
    public void setTwoArguments(int number1, int number2) {
        this.number1 = number1;
        this.number2 = number2;
        System.out.printf("Создание объекта с двумя аргументами: 1) %d 2) %d\n", this.number1, this.number2);
    }
}
