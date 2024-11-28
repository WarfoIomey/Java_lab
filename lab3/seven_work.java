package lab3;


public class seven_work {
    public static void main (String[] args) {
        int length_array = 10;
        char[] list = new char[length_array];
        char[] alphabet = "abcdefghijklmnopqrstuvwxyz".toCharArray();
        for (int i =0; i < list.length; i++) {
            list[i] = alphabet[i];
        }
        OutArrays.CommonOut(list);
        OutArrays.InvertedOut(list);
    }
    static class OutArrays {
        static void CommonOut (char[] list) {
            System.out.println("Обычный список:");
            for (int i = 0; i < list.length; i++) {
                System.out.printf("%c, ", list[i]);
            }
        }
        static void InvertedOut (char[] list) {
            int count = list.length;
            System.out.println("\nИнвертированный список:");
            while (count > 0) {
                System.out.printf("%c, ", list[count-1]);
                count--;
            }
        }
    }
}
