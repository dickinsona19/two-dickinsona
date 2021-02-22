package EDU.BSU.CS22;

import java.io.IOException;
import java.net.MalformedURLException;

public class errorChecker {
    public void errorCheckerCall(String articleTitle) throws IOException {
        isThereNetworkError();
        doesWikiArticleExist(articleTitle);
        isWikipediaTitleSomething(articleTitle);
    }

    private void isThereNetworkError() throws IOException {//Sends error if NetworkError I run Soup in this method to differentiate Network error and Invalid Title Error
        connectionToWikipedia wikipediaConnection = new connectionToWikipedia();

        try {
            wikipediaConnection.requestConnectionToWikipedia(wikipediaConnection.createWikipediaURLQuery("Soup"));
        } catch (MalformedURLException malformedURLException) {
            System.err.println("A Network error has occurred");
            System.exit(3);
        }
    }

    private void doesWikiArticleExist(String articleTitle) throws IOException {
        connectionToWikipedia wikiConnection = new connectionToWikipedia();
        try {
            wikiConnection.establishConnectionToWikipedia(articleTitle);
        } catch (MalformedURLException malformedURLException) {
            System.err.println("The entered in Article does not Exist");
            System.exit(2);
        }
    }


    private void isWikipediaTitleSomething(String articleTitleName) {       //Confirms if Wikipedia Title is a real Title
        if (articleTitleName.equals("")) {
            System.err.println("Wikipedia Title name is not valid");
            System.exit(1);
        }
    }
}
