package FORMATTER;

public class PDFtext implements textformatter{
	@Override
	public String formattext(String text) {
		return "PDF formatted text: "+text;
	} 
}
 