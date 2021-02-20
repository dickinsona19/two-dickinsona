package EDU.BSU.CS22;

import java.util.Scanner;

public class Main extends WikipediaRevisionReader {
    public static void main(String[] args) {
        WikipediaRevisionReader wikipediaRevisionReader = new WikipediaRevisionReader();
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter in Wikipedia Name: ");
        String line = scanner.nextLine();
        try{
            String timeStamp = wikipediaRevisionReader.checkURL(line);
            System.out.println(timeStamp);
        } catch (Exception ioException) {
            System.err.println("Network Connection Problem" +ioException.getMessage());
        }
    }
}
