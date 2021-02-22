package EDU.BSU.CS22;

import java.util.Scanner;

public class getWikipediaArticleTitle {
    public String getWikipediaTitleName() {         //Returns Title of Wikipedia page
        Scanner scanner = new Scanner(System.in);
        askUserTitleName();

        return replaceSpacesWithValidCharacter(scanner.nextLine());

    }

    private void askUserTitleName(){ System.out.println("Enter in Valid Wikipedia title Name:"); }      //Asks user for Title Name



    private String replaceSpacesWithValidCharacter(String articleTitleName){        //Allows for articleTitles with spaces
        return articleTitleName.replace(" ","_");
    }
}
