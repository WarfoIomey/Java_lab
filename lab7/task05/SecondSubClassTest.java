package lab7.task05;

public class SecondSubClassTest extends SuperClassTest{
    protected char chr1;

    SecondSubClassTest(String strEx, char chrEx) {
        super(strEx);
        this.chr1 = chrEx;
    }

    @Override
    public String toString() {
        String superClassNameAndFieldValue;
        superClassNameAndFieldValue = "Class name: " + this.getClass().getSimpleName() + "\n" +
                "chr 1 = " + this.chr1 + "\n" +
                "super String = " + super.toString();
        return superClassNameAndFieldValue;
    }
}
