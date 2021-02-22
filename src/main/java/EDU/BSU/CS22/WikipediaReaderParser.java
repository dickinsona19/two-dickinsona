package EDU.BSU.CS22;

import com.jayway.jsonpath.JsonPath;
import net.minidev.json.JSONArray;

import java.io.IOException;
import java.io.InputStream;
import java.util.ArrayList;

public class WikipediaReaderParser {
    public ArrayList<String> parseRevision(InputStream inputStream) throws IOException {
        ArrayList<String> revisionsWithTimestampPlusUser = new ArrayList<>();

        for(Object jsonRevisionData : findRevisionList(inputStream)) {
            revisionsWithTimestampPlusUser.add(jsonRevisionData.toString());
        }
        return revisionsWithTimestampPlusUser;
    }

    private JSONArray findRevisionList(InputStream inputStream) throws IOException {
        return JsonPath.read(inputStream,"$..revisions[*][*]");
    }
}

