package FORMATTER;

public class PDFfactory implements Documentfactory{
	@Override
	public textformatter createtext() {
		return new PDFtext();
	}
	@Override
	public imageformatter createimage() {
		return new PDFimage();
	}
}
