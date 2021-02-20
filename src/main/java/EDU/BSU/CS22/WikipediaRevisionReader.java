package EDU.BSU.CS22;

import java.io.InputStream;
import java.net.MalformedURLException;
import java.net.URL;
import java.net.URLConnection;
import java.net.URLEncoder;
import java.nio.charset.Charset;

public class WikipediaRevisionReader {


   public String checkURL(String articleTitle) throws Exception{
        String urlString = String.format("https://en.wikipedia.org/w/api.php?action=query&format=json&" +
                "prop=revisions&titles=%s&rvprop=timestamp|user&rvlimit=4&redirects", articleTitle);
        String encoderURLString = URLEncoder.encode(urlString, Charset.defaultCharset());
        try {
            URL url= new URL(encoderURLString);
            URLConnection connection = url.openConnection();
            connection.setRequestProperty("User-Agent", "WikipediaRevisionReader/.01 (EDU.BSU.CS22 Adickinson@bsu.edu)");
            InputStream inputStream = connection.getInputStream();
            WikipediaRevisionParser parser = new WikipediaRevisionParser();
            String timeStamp = parser.parse(inputStream);
            return timeStamp;
        }
        catch (MalformedURLException malformedURLException){
           throw new RuntimeException(malformedURLException);
       }
   }
}
