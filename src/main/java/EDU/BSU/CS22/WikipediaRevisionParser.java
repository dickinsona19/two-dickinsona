package EDU.BSU.CS22;

import com.jayway.jsonpath.JsonPath;
import net.minidev.json.JSONArray;
import net.minidev.json.JSONObject;
import net.minidev.json.parser.JSONParser;

import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;

public class WikipediaRevisionParser {
   /* public String parse(InputStream inputStream) throws IOException {
        JSONArray result = (JSONArray) JsonPath.read(inputStream, "$...timestamp");
        String JsonTimeStamp = result.get(0).toString();
        return JsonTimeStamp;
    } */
   /* public String parse(InputStream inputStream)throws Exception{
        InputStream JsonInputStream = JsonPath.read(inputStream, "$...timestamp");
        JSONParser jsonParser = new JSONParser();
        JSONObject jsonObject = (JSONObject)jsonParser.parse(
                new InputStreamReader(JsonInputStream, "UTF-8"));
        return String.valueOf(jsonObject); */
   public String parse(InputStream testDataStream) throws IOException {
       Object o = JsonPath.read(testDataStream, "$...timestamp");
       return null;
   }
    }
