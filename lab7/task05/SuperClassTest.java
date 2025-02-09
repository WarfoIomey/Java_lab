package lab7.task05;

public class SuperClassTest {
    private String str1;

    SuperClassTest(String strEx) {
        this.str1 = strEx;
    }


    @Override
    public String toString() {
        String superClassNameAndFieldValue;
        superClassNameAndFieldValue = "Class name: " + this.getClass().getSimpleName() + "\n" +
                "str 1 = " + this.str1 + "\n" +
                "-----------------------------";
        return superClassNameAndFieldValue;
    }
}
