package lab7.task03;

public class SuperClassTest {
    int int1;

    SuperClassTest(int intEx) {
        this.int1 = intEx;
    }

    public void setFields(int int1) {
        this.int1 = int1;
    }

    @Override
    public String toString() {
        String superClassNameAndFieldValue;
        superClassNameAndFieldValue = "Class name: " + this.getClass().getSimpleName() + "\n" +
                "int 1 = " + this.int1;
        return superClassNameAndFieldValue;
    }
}
