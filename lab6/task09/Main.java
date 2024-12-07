package lab6.task09;

public class Main {
    public static void main(String[] args) {
        char [] charArray = {'a', 'b', 'c', 'd', 'e'};
        char [] charArray2 = {'c', 'd', 'f', 'g'};
        Test test = new Test();
        char [] newCharArray = Test.replaceCharArray(charArray);
        char [] newCharArray2 = Test.replaceCharArray(charArray2);
        for(int i=0; i < newCharArray.length; i++) {
            System.out.printf("%c,", newCharArray[i]);
        }
        System.out.println();
        for(int i=0; i < newCharArray2.length; i++) {
            System.out.printf("%c,", newCharArray2[i]);
        }
    }
}
