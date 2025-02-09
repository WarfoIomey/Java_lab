package lab7.task05;

public class FirstSubClassTest extends SuperClassTest{
    protected int int1;

    FirstSubClassTest(String strEx, int intEx) {
        super(strEx);
        this.int1 = intEx;
    }

    @Override
    public String toString() {
        String superClassNameAndFieldValue;
        superClassNameAndFieldValue = "Class name: " + this.getClass().getSimpleName() + "\n" +
                "int 1 = " + this.int1 + "\n" +
                "super String: \n " + super.toString();
        return superClassNameAndFieldValue;
    }
}
