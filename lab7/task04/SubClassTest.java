package lab7.task04;

public class SubClassTest extends SuperClassTest{
    String str1;

    SubClassTest(char chrEx, String strEx) {
        super(chrEx);
        this.str1 = strEx;
    }

    SubClassTest(SubClassTest obj) {
        super(obj);
        this.str1 = obj.str1;
    }

    @Override
    public String toString() {
        String superClassNameAndFieldValue;
        superClassNameAndFieldValue = "Class name: " + this.getClass().getSimpleName() + "\n" +
                "chr 1 = " + this.chr1 + "\n" +
                "str 1 = " + this.str1;
        return superClassNameAndFieldValue;
    }
}
