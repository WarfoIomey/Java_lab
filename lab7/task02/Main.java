package lab7.task02;


public class Main {
    public static void main(String[] args) {
        SuperClassTest superClassObject =
                new SuperClassTest("Тест суперкласса");
        System.out.println(superClassObject.getLengthStr1());
        superClassObject.setFields("Новый");
        System.out.println(superClassObject.getLengthStr1());

        SubClassTest subClassObject =
                new SubClassTest("Тест подкласса", 4);
        System.out.println("Подкласс int 1 = " + subClassObject.int1);
        System.out.println("Длинна str1 = " + subClassObject.getLengthStr1());
        subClassObject.setFields("Новый");
        System.out.println("Перегрузка с 1 аргументом:");
        System.out.println("Подкласс int 1 = " + subClassObject.int1);
        System.out.println("Длинна str1 = " + subClassObject.getLengthStr1());
        subClassObject.setFields("Тест перегрузки", 8);
        System.out.println("Перегрузка с 2 аргументами:");
        System.out.println("Подкласс int 1 = " + subClassObject.int1);
        System.out.println("Длинна str1 = " + subClassObject.getLengthStr1());
        System.out.println("Перегрузка с без аргументов:");
        subClassObject.setFields();
        System.out.println("Подкласс int 1 = " + subClassObject.int1);
        System.out.println("Длинна str1 = " + subClassObject.getLengthStr1());
    }
}
