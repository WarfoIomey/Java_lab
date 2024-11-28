package lab3;


public class eight_work {
    public static void main (String[] args) {
        int length_array = 10;
        char[] alphabet = "ABCDEFGHIJKLMNOPQRSTUVWXYZ".toCharArray();
        char[] accepted_char = "BCDFGHJKLMNPQRSTVWXZ".toCharArray();
        OutArrays.FilterVowelsArray(alphabet, accepted_char, length_array);
    }
    static class OutArrays {
        static void FilterVowelsArray (char[] alphabet, char[] accepted_char, int length_array) {
            char[] result = new char[length_array];
            int index = 0;
            for (char letter: alphabet) {
                if (index == length_array) {
                    break;
                }
                for (char accept_letter: accepted_char) {
                    if (letter == accept_letter) {
                        result[index] = letter;
                        index++;
                    }
                }
            }
            for (char letter: result) {
                System.out.printf("%c, ", letter);
            }
        }
    }
}
