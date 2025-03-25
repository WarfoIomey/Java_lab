package timus_task;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.io.InputStreamReader;

    public class task1493 {
//        id: 10916677
        public static void main(String[] args) throws IOException {
            String inputFileName = "timus_task/input.txt";
            boolean oj = System.getProperty("ONLINE_JUDGE") != null;
            try {
                BufferedReader bufferedReader =
                        oj ? new BufferedReader(new InputStreamReader(System.in)) :
                                new BufferedReader(new FileReader(inputFileName));
                String string = bufferedReader.readLine();
                int value = Integer.parseInt(string);
                if (value == 999999 || value == 000000) {
                    System.out.println("Yes");
                } else {
                    int valuePlusOne = value + 1;
                    int valueMinusOne = value - 1;
                    String zero = "0";
                    String stringPlusOne = Integer.toString(valuePlusOne);
                    String stringMinusOne = Integer.toString(valueMinusOne);
                    int lengthPlusOne = stringPlusOne.length();
                    int lengthMinusOne = stringMinusOne.length();
                    if (stringPlusOne.length() < 6) {
                        for (int i = 0; i < string.length() - lengthPlusOne; i++) {
                            stringPlusOne = "0" + stringPlusOne;
                        }
                    }
                    if (stringMinusOne.length() < 6) {
                        for (int i = 0; i < string.length() - lengthMinusOne; i++) {
                            stringMinusOne = "0" + stringMinusOne;
                        }
                    }
                    String left = Integer.toString(Character.getNumericValue(string.charAt(0))
                            + Character.getNumericValue(string.charAt(1))
                            + Character.getNumericValue(string.charAt(2)));
                    String rigth = Integer.toString(Character.getNumericValue(string.charAt(3))
                            + Character.getNumericValue(string.charAt(4))
                            + Character.getNumericValue(string.charAt(5)));
                    String leftPluseOne = Integer.toString(Character.getNumericValue(stringPlusOne.charAt(0))
                            + Character.getNumericValue(stringPlusOne.charAt(1))
                            + Character.getNumericValue(stringPlusOne.charAt(2)));
                    String leftMinusOne = Integer.toString(Character.getNumericValue(stringMinusOne.charAt(0))
                            + Character.getNumericValue(stringMinusOne.charAt(1))
                            + Character.getNumericValue(stringMinusOne.charAt(2)));
                    String rigthPluseOne = Integer.toString(Character.getNumericValue(stringPlusOne.charAt(3))
                            + Character.getNumericValue(stringPlusOne.charAt(4))
                            + Character.getNumericValue(stringPlusOne.charAt(5)));
                    String rigthMinusOne = Integer.toString(Character.getNumericValue(stringMinusOne.charAt(3))
                            + Character.getNumericValue(stringMinusOne.charAt(4))
                            + Character.getNumericValue(stringMinusOne.charAt(5)));
                    if (leftPluseOne.equals(rigthPluseOne) || leftMinusOne.equals(rigthMinusOne) || left.equals(rigth)) {
                        System.out.println("Yes");
                    } else {
                        System.out.println("No");
                    }
                }
            } catch (IOException exception) {
                exception.printStackTrace();
            }
        }
    }
