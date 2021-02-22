package EDU.BSU.CS22;

import com.jayway.jsonpath.JsonPath;

import java.io.IOException;
import java.io.InputStream;
import java.util.ArrayList;

public class pageRedirection {
    public void pageRedirected(InputStream WikipediaInputStream, String articleTitle) throws IOException {
        if(pageRedirectChecker(WikipediaInputStream, articleTitle)){
            System.out.println(redirectMessage());
        }
    }

    private String redirectMessage() {      //Creates Redirect Message

        return "The entered Article Title has been Redirected to a new one";
    }

    private boolean pageRedirectChecker(InputStream WikipediaInputStream, String articleTitle) throws IOException {     // Checks if the name of the articleTitle changes to confirm Redirection
        ArrayList<String> title = JsonPath.read(WikipediaInputStream, "$..title");
        String newArticleTitle = title.get(0);
        return !newArticleTitle.equals(articleTitle);
    }
}
