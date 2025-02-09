package lab7.task04;

public class Main {
    public static void main(String[] args) {
        SuperClassTest superObject =
                new SuperClassTest('c');

        SubClassTest subObject =
                new SubClassTest('p', "Hello");

        SubSubClassTest subSubObject =
                new SubSubClassTest('d', "My friend", 5);

        SuperClassTest superClassObject =
                new SuperClassTest(superObject);
        String className = superClassObject.toString();
        System.out.println(className);

        SubClassTest subClassObject =
                new SubClassTest(subObject);
        String subClassName = subClassObject.toString();
        System.out.println(subClassName);

        SubClassTest subSubClassObject =
                new SubSubClassTest(subSubObject);
        String subClassName2 = subSubClassObject.toString();
        System.out.println(subClassName2);
    }
}
