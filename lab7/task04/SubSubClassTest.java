package lab7.task04;

public class SubSubClassTest extends SubClassTest {
    int int1;

    SubSubClassTest(char chrEx, String strEx, int intEx) {
        super(chrEx, strEx);
        this.int1 = intEx;
    }

    SubSubClassTest(SubSubClassTest obj) {
        super(obj);
        this.int1 = obj.int1;
    }

    @Override
    public String toString() {
        String superClassNameAndFieldValue;
        superClassNameAndFieldValue = "Class name: " + this.getClass().getSimpleName() + "\n" +
                "chr 1 = " + this.chr1 + "\n" +
                "str 1 = " + this.str1 + "\n" +
                "int 1 = " + this.int1;
        return superClassNameAndFieldValue;
    }
}
