package lab6.task07;

public class Test {
    private static int[] Array;
    public static int [] codeArrayChar(char [] charArray) {
        int[] intArray = new int[charArray.length];
        for (int i = 0; i < charArray.length; i++) {
            intArray[i] = (int) charArray[i];
        }
        Array = intArray;
        return Array;
    }
}
