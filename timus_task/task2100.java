package timus_task;

import java.io.*;

public class task2100 {
    // id: 10882808
    public static void main(String[] args) {
        String inputFileName = "timus_task/input.txt";
        boolean oj = System.getProperty("ONLINE_JUDGE") != null;
        int marshalAndLilly = 2;

        try {
            BufferedReader bufferedReader =
                    oj ? new BufferedReader(new InputStreamReader(System.in)) :
                            new BufferedReader(new FileReader(inputFileName));
            String readLine = "";
            int numberFriends = 0;
            int numberFriendsPars = 0;
            int result = 0;
            while ((readLine = bufferedReader.readLine()) != null) {
                if (numberFriends == 0) {
                    numberFriends = Integer.parseInt(readLine);
                    continue;
                }
                if(readLine.contains("+")) {
                    numberFriendsPars++;
                }
            }
            int quests = marshalAndLilly + numberFriends + numberFriendsPars;
            if (quests == 13) {
                result = (quests * 100) + 100;
            } else {
                result = quests * 100;
            }
            System.out.println(result);
        } catch (IOException exception) {
            exception.printStackTrace();
        }
    }
}
