package lab13.task01;

public class example8 {
    public static int m() {
        try {
            System.out.println("0");
            throw new RuntimeException();
        } catch (RuntimeException e) {
            System.out.println("Исправленный вариант");
        } finally {
            System.out.println("1");
        }
        return 53;
    }
    public static void main(String[] args) {
        System.out.println(m());
    }
}
