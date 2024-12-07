package lab6.task09;

public class Test {
    public static char [] replaceCharArray(char [] charArray) {
        char [] newCharArray = new char[charArray.length];
        int left_index = 0;
        int rigth_index = charArray.length-1;
        while (rigth_index >= 0) {
            newCharArray[left_index] = charArray[rigth_index];
            left_index++;
            rigth_index--;
        }
        return newCharArray;
    }
}
