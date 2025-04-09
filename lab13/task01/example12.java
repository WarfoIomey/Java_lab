package lab13.task01;

public class example12 {
    public static void m(String str, double chislo) {
        if (str == null) {
            try {
                throw new IllegalArgumentException("Строка введена неверно");
            } catch (IllegalArgumentException e) {
                System.out.println("Строка введена неверно " + e);
            }
        }
        if (chislo > 0.001) {
            try {
                throw new IllegalArgumentException("Неверно число");
            } catch (IllegalArgumentException e) {
                System.out.println("Число введено неверно " + e);
            }
        }
    }

    public static void main(String[] args) {
        m(null, 0.000001);
        System.out.println("------------");
        m("Hello", 1);

    }
}
