package lab7.task02;

public class SuperClassTest {
    private String str1;

    SuperClassTest(String strEx) {
        this.str1 = strEx;
    }


    public void setFields(String str1) {
        this.str1 = str1;
    }

    public Integer getLengthStr1() {
        return this.str1.length();
    }
}
