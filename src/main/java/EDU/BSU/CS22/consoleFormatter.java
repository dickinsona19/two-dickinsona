package EDU.BSU.CS22;

import java.util.ArrayList;

public class consoleFormatter {
    public void printTimestampUser(ArrayList<String> parsedJson) {
        timeStampAndUserConfiguration TSAUConfig = new timeStampAndUserConfiguration();


        ArrayList<String> users = (TSAUConfig.configureUser(parsedJson));
        ArrayList<String> timestamps = (TSAUConfig.configureTimestamp(parsedJson));

        for (int i = 0; i < timestamps.size() || i > 30; i++) {
            System.out.println(timestamps.get(i)+ "  " + users.get(i));
        }
    }
}
