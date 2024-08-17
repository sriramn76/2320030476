package FORMATTER;

import java.util.*;

public class MAIN {
	public static void main(String[] args) {
		creators L=new creators();
		Documentfactory PDF = new PDFfactory();
		Documentfactory WORD = new WORDfactory();
		Scanner sc = new Scanner(System.in);
		
		System.out.println("insert the text and image \npress 1 if you want in PDF format.. \n\t\t(or)\npress 2 if you want it in WORD format..");
		String text = sc.nextLine();
		String image = sc.nextLine();
		int a = sc.nextInt();
		
		if (a == 1) {
			L.creator(WORD, text, image, a);
		} else {
			L.creator(WORD, text, image, a);
		}
		sc.close();
	}
}