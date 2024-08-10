package Random;
import java.io.*;

public class first {

	public static void main(String[] args) {
		Runtime.getRuntime().addShutdownHook(new Thread() {
		public void run() {
			System.out.println("shutdown procees is turning on!!");
		}
	});
		System.out.println("Application treminating...");
	}

}
