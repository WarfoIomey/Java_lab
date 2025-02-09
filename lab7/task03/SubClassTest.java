package lab7.task03;

public class SubClassTest extends SuperClassTest {
    char chr1;

    SubClassTest(int intEx, char chr1Ex) {
        super(intEx);
        this.chr1 = chr1Ex;
    }

    public void setFields(int int1, char chr1) {
        this.int1 = int1;
        this.chr1 = chr1;
    }

    @Override
    public String toString() {
        String superClassNameAndFieldValue;
        superClassNameAndFieldValue = "Class name: " + this.getClass().getSimpleName() + "\n" +
                "int 1 = " + this.int1 + "\n" +
                "chr 1 = " + this.chr1;
        return superClassNameAndFieldValue;
    }
}
