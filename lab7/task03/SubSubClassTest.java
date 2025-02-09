package lab7.task03;

public class SubSubClassTest extends SubClassTest{
    String str1;

    SubSubClassTest(int intEx, char chr1Ex, String str1Ex) {
        super(intEx, chr1Ex);
        this.str1 = str1Ex;
    }

    public void setFields(int int1, char chr1, String str1) {
        this.int1 = int1;
        this.chr1 = chr1;
        this.str1 = str1;
    }

    @Override
    public String toString() {
        String superClassNameAndFieldValue;
        superClassNameAndFieldValue = "Class name: " + this.getClass().getSimpleName() + "\n" +
                "int 1 = " + this.int1 + "\n" +
                "chr 1 = " + this.chr1 + "\n" +
                "str 1 = " + this.str1;
        return superClassNameAndFieldValue;
    }
}
