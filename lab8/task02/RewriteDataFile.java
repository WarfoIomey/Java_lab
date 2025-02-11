package lab8.task02;

import java.io.*;

public class RewriteDataFile {
    public static void main(String[] args) throws IOException {
        BufferedReader br = null;
        BufferedWriter bw = null;
        double [] list_double = new double[5];
        try {
            br = new BufferedReader(
                    new InputStreamReader(
                            new FileInputStream("C:\\Java_ex\\labs\\lab8\\task02\\MyFile1.txt"), "cp1251"));
            int count = 0;
            String s, result_str = "";
            br.readLine();
            while ((s = br.readLine()) != null) {
                try {
                    if (Double.parseDouble(s) > 0) {
                        list_double[count] = Double.parseDouble(s);
                        count++;
                    }
                } catch (NumberFormatException e) {
                    result_str = s;
                }
            }
            bw = new BufferedWriter(
                    new OutputStreamWriter(
                            new FileOutputStream("C:\\Java_ex\\labs\\lab8\\task02\\MyFile1.txt"), "cp1251"));
            bw.write(result_str);
            bw.newLine();
            for (int i=0; i < list_double.length; i++) {
                if (list_double[i] != 0.0) {
                    bw.write(String.valueOf(list_double[i]));
                    bw.newLine();
                }
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
