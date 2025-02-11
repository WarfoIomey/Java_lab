package lab8.task03;

import java.io.*;

public class WriteConsonantWords {
    public static String parsString(String [] str) {
        char [] accepted_letter = "бвгджзйклмнпрстфхцчшщ".toCharArray();
        String result = "";
        for (int i = 0; i < str.length; i++) {
            String check = str[i].toLowerCase();
            for (char letter: accepted_letter) {
                if (check.charAt(0) == letter) {
                    result += str[i] + " ";
                }
            }
        }
        return result;
    }

    public static Integer countWord(String str) {
        String trim = str.trim();
        if (trim.isEmpty())
            return 0;
        return trim.split("\\s+").length;
    }

    public static void main(String[] args) throws IOException {
        BufferedReader br = null;
        BufferedWriter bw = null;
        try {
            br = new BufferedReader(
                    new InputStreamReader(
                            new FileInputStream("C:\\Java_ex\\labs\\lab8\\task03\\MyFile1.txt"), "UTF-8"));
            bw = new BufferedWriter(
                    new OutputStreamWriter(
                            new FileOutputStream("C:\\Java_ex\\labs\\lab8\\task03\\MyFile2.txt"), "UTF-8"));
            int lineCount = 0;
            String s;
            while ((s = br.readLine()) != null) {
                lineCount++;
                String parseStr = parsString(s.split(" "));
                int count_word = countWord(parseStr);
                System.out.println(lineCount +") " + parseStr + " Количество слов: " + count_word);
                bw.write(lineCount +") " + parseStr + " Количество слов: " + count_word);
                bw.newLine();
            }
        } catch (IOException e) {
            System.out.println("Ошибка!!!");
        } finally {
            br.close();
            bw.flush();
            bw.close();
        }
    }
}
