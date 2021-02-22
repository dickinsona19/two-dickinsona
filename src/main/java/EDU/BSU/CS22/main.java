package EDU.BSU.CS22;

import java.io.IOException;
import java.io.InputStream;

public class main {

    public static void main(String[] args) throws IOException {
        WikipediaReaderParser wikiParser = new WikipediaReaderParser();
        getWikipediaArticleTitle getWikipediaArticleTitle = new getWikipediaArticleTitle();
        connectionToWikipedia wikipediaConnection = new connectionToWikipedia();
        pageRedirection pageRedirection = new pageRedirection();
        errorChecker errorChecker = new errorChecker();
        consoleFormatter consoleFormatter = new consoleFormatter();

        String articleTitle = getWikipediaArticleTitle.getWikipediaTitleName();

        errorChecker.errorCheckerCall(articleTitle);
        InputStream articleInputStream = wikipediaConnection.establishConnectionToWikipedia(articleTitle);
        pageRedirection.pageRedirected(articleInputStream, articleTitle);

        consoleFormatter.printTimestampUser(wikiParser.parseRevision(wikipediaConnection.establishConnectionToWikipedia(articleTitle)));

    }
}
