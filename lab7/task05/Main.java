package lab7.task05;

public class Main {
    public static void main(String[] args) {

        SuperClassTest superClassObject =
                new SuperClassTest("Hello");
        String className = superClassObject.toString();
        System.out.println(className);

        FirstSubClassTest subClassObject =
                new FirstSubClassTest("Friend", 5);
        String subClassName = subClassObject.toString();
        System.out.println(subClassName);

        SecondSubClassTest subSubClassObject =
                new SecondSubClassTest("Sunny", 'b');
        String subClassName2 = subSubClassObject.toString();
        System.out.println(subClassName2);

    }
}
