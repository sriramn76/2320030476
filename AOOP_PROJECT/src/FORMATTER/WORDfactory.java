package FORMATTER;

public class WORDfactory implements Documentfactory{
	@Override
	public textformatter createtext() {
		return new WORDtext();
	}
	@Override
	public imageformatter createimage() {
		return new WORDimage();
	}
}
