package FORMATTER;

import java.util.*;

public class MAIN {
    public static void creator(Documentfactory fact, String text, String image, int a) {
        textformatter Text = fact.createtext();
        imageformatter Image = fact.createimage();

        String Ftext = Text.formattext(text);
        String Fimage = Image.formatimage(image);

        System.out.println(Ftext);
        System.out.println(Fimage);
    }

    public static void main(String[] args) {
        Documentfactory PDF = new PDFfactory();
        Documentfactory WORD = new WORDfactory();
        Scanner sc = new Scanner(System.in);

        System.out.println("insert the text and image \npress 1 if you want in PDF format.. \n\t\t(or)\npress 2 if you want it in WORD format..");
        String text = sc.nextLine();
        String image = sc.nextLine();
        int a = sc.nextInt();

        if (a == 1) {
            creator(PDF, text, image, a);
        } else {
            creator(WORD, text, image, a);
        }
        sc.close();
    }
}
