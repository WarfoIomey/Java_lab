package lab7.task02;

public class SubClassTest extends SuperClassTest {
    int int1;
    private String str2;

    SubClassTest(String strEx, int int1) {
        super(strEx);
        this.int1 = int1;
    }

    public void setFields() {
        super.setFields("База");
        this.int1 = 0;
    }

    public void setFields(String str1) {
        super.setFields(str1);
    }
    public void setFields(String str1, int int1) {
        super.setFields(str1);
        this.int1 = int1;
    }
}
