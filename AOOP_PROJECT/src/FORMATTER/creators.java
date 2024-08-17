package FORMATTER;

public class creators {
	  public static void creator(Documentfactory fact, String text, String image, int a) {
	        textformatter Text = fact.createtext();
	        imageformatter Image = fact.createimage();

	        String Ftext = Text.formattext(text);
	        String Fimage = Image.formatimage(image);

	        System.out.println(Ftext);
	        System.out.println(Fimage);
	    }
}
