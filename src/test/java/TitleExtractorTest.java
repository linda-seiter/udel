import org.junit.jupiter.api.Test;
import oo_warmup.TitleExtractor;

import static org.junit.jupiter.api.Assertions.*;
public class TitleExtractorTest {

    @Test
    void titleUppercase() {
        String str = "<HTML><TITLE>My Page</TITLE></HTML>";
        assertEquals("My Page", TitleExtractor.getTitle(str));
    }

    @Test
    void titleLowercase() {
        String str = "<html><head><title>Welcome!!!!</title></head></html>";
        assertEquals("Welcome!!!!", TitleExtractor.getTitle(str));
    }

    @Test
    void titleEmpty() {
        String str = "<title></title>";
        assertEquals("", TitleExtractor.getTitle(str));
    }

    @Test
    void missingStartTag() {
        String str = "<html><head>titleWelcome!!!!</title></head></html>";
        assertEquals("", TitleExtractor.getTitle(str));
    }

    @Test
    void missingEndTag() {
        String str = "<html><head><title>Welcome!!!!</head></html>";
        assertEquals("", TitleExtractor.getTitle(str));
    }

    @Test
    void endTagAfterStartTag() {
        String str = "</title>My Page<title>";
        assertEquals("", TitleExtractor.getTitle(str));
    }
}
