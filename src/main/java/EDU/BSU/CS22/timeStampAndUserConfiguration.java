package EDU.BSU.CS22;

import java.util.ArrayList;

public class timeStampAndUserConfiguration {
    public ArrayList<String> configureTimestamp(ArrayList<String> revisionsTimestamp) {
        ArrayList<String> timestamps = new ArrayList<>();
        for (int i = 1; i <= revisionsTimestamp.size(); i =i + 2) {
            timestamps.add(revisionsTimestamp.get(i));
        }
        return timestamps;
    }

    public ArrayList<String> configureUser(ArrayList<String> revisionsUser) {
        ArrayList<String> users = new ArrayList<>();
        for (int i = 0; i < revisionsUser.size(); i = i + 2) {
            users.add(revisionsUser.get(i));
        }
        return users;
    }
}
