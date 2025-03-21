package lab8.task01;

import java.io.*;

public class Buf_RW_2 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = null;
        PrintWriter out = null;
        try {
            br = new BufferedReader(
                    new InputStreamReader(
                            new FileInputStream("C:\\tmp\\MyFile1.txt"), "cp1251"));
            out = new PrintWriter("C:\\tmp\\MyFile2.txt", "cp1251");
            int lineCount = 0;
            String s;
            while ((s = br.readLine()) != null) {
                lineCount++;
                out.println(lineCount + ": " + s);
            }
        } catch (IOException e) {
            System.out.println("Ошибка!!!!" + e);
        } finally {
            br.close();
            out.flush();
            out.close();
        }
    }
}
