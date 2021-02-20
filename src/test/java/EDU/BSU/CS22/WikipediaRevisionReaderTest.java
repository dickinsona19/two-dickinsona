package EDU.BSU.CS22;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.io.InputStream;

public class WikipediaRevisionReaderTest {

    @Test
    public void testParse() throws Exception {
        WikipediaRevisionParser parser = new WikipediaRevisionParser();
        InputStream testDataStream = Thread.currentThread().getContextClassLoader().getResourceAsStream("test.json");
        String timeStamp = parser.parse(testDataStream);
        Assertions.assertEquals("2021-02-17T15:56:18Z", timeStamp);
        }

    }
