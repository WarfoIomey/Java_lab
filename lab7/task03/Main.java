package lab7.task03;

public class Main {
    public static void main(String[] args) {
        SuperClassTest superClassObject =
                new SuperClassTest(5);
        String className = superClassObject.toString();
        System.out.println(className);

        SubClassTest subClassObject =
                new SubClassTest(1, 'a');
        String subClassName = subClassObject.toString();
        System.out.println(subClassName);

        SubClassTest subSubClassObject =
                new SubSubClassTest(10, 'g', "Hello my friend");
        String subClassName2 = subSubClassObject.toString();
        System.out.println(subClassName2);
    }
}
