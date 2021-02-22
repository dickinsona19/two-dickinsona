package EDU.BSU.CS22;

import java.io.IOException;
import java.io.InputStream;
import java.net.MalformedURLException;
import java.net.URL;
import java.net.URLConnection;

public class connectionToWikipedia {
    public InputStream establishConnectionToWikipedia(String articleTitle) throws IOException {              //Establishes Connection to Wikipedia Takes in articleTitle from "getWikipediaArticleTitle" return

        return requestConnectionToWikipedia(createWikipediaURLQuery(articleTitle));
    }


    public URL createWikipediaURLQuery(String articleTitle) throws MalformedURLException {                                      //Takes Article Name and Makes URL
        return new URL("https://en.wikipedia.org/w/api.php?action=query&format=" +
                "json&prop=revisions&titles=" + articleTitle + "&rvprop=timestamp|user&rvlimit=30&redirects");
    }


    public InputStream requestConnectionToWikipedia(URL encodedURl) throws IOException {           //Requests connection to Wikipedia Returns InputStream from Wikipedia
        URLConnection connection = encodedURl.openConnection();

        connection.setRequestProperty("User-Agent",
                "Revision Reporter/.01 (http.cs.bsu.edu/~pvg/courses/cs222Sp21 Adickinson@bsu.edu)");

        return  connection.getInputStream();
    }
}
