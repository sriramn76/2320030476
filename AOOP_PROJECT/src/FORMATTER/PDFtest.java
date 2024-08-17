package FORMATTER;

import org.junit.Test;
import static org.junit.Assert.*;

public class PDFtest {

    @Test
    public void testPDFCreation() {
        Documentfactory pdfFactory = new PDFfactory();
        String text = "Test PDF Text";
        String image = "Test PDF Image";
        int option = 1;
        creators L=new creators();
        L.creator(pdfFactory, text, image, option);
        textformatter textFormatter = pdfFactory.createtext();
        imageformatter imageFormatter = pdfFactory.createimage();

        
        assertEquals("PDF formatted text: Test PDF Text", textFormatter.formattext(text));
        assertEquals("PDF formatted image: Test PDF Image", imageFormatter.formatimage(image));
    }

    @Test
    public void testWordCreation() {
    	creators L=new creators();
        Documentfactory wordFactory = new WORDfactory();
        String text = "Test Word Text";
        String image = "Test Word Image";
        int option = 2;
        L.creator(wordFactory, text, image, option);
        textformatter textFormatter = wordFactory.createtext();
        imageformatter imageFormatter = wordFactory.createimage();

        
        
        
        
        
        assertEquals("WORD formatted text: Test Word Text", textFormatter.formattext(text));
        assertEquals("WORD formatted image: Test Word Image", imageFormatter.formatimage(image));
    }
}
