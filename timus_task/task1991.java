package timus_task;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class task1991 {
    // id: 10916686
    public static void main(String[] args) throws IOException {
        String inputFileName = "timus_task/input.txt";
        boolean oj = System.getProperty("ONLINE_JUDGE") != null;
        try {
            BufferedReader bufferedReader =
                    oj ? new BufferedReader(new InputStreamReader(System.in)) :
                            new BufferedReader(new FileReader(inputFileName));
            String [] fistLine = bufferedReader.readLine().split(" ");
            int size = Integer.parseInt(fistLine[0]);
            int drone = Integer.parseInt(fistLine[1]);
            int [] army = new int[size];
            int [] cart = new int[size];
            int remainedArmy = 0;
            int remainedAmmo = 0;
            String [] secondLine = bufferedReader.readLine().split(" ");
            for (int i = 0; i < army.length; i++) {
                army[i] = drone;
                cart[i] = Integer.parseInt(secondLine[i]);
            }
            for (int i = 0; i < army.length; i++) {
                int resultBattel = army[i] - cart[i];
                int resultAmmo = cart[i] - army[i];
                army[i] = resultBattel;
                cart[i] = resultAmmo;
                if (cart[i] < 0) {
                    cart[i] = 0;
                }
                if (army[i] < 0) {
                    army[i] = 0;
                }
                remainedArmy += army[i];
                remainedAmmo += cart[i];
            }
            System.out.println(remainedAmmo + " " + remainedArmy);
        } catch (IOException exception) {
            exception.printStackTrace();
        }
    }
}
