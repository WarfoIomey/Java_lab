package lab7.task04;

public class SuperClassTest {
    char chr1;

    SuperClassTest(char chrEx) {
        this.chr1 = chrEx;
    }

    SuperClassTest(SuperClassTest obj) {
        this.chr1 = obj.chr1;
    }

    @Override
    public String toString() {
        String superClassNameAndFieldValue;
        superClassNameAndFieldValue = "Class name: " + this.getClass().getSimpleName() + "\n" +
                "chr 1 = " + this.chr1;
        return superClassNameAndFieldValue;
    }
}
