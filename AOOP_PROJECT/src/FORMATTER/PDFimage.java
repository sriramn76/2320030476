package FORMATTER;

public class PDFimage implements imageformatter{
	@Override
	public String formatimage(String image) {
		return "PDF formatted image: "+image;
	}
}
