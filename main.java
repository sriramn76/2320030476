package Week_1;

import java.util.Scanner;

public class main {
	 public static void main(String[] args) {
	        Scanner scanner = new Scanner(System.in);
	  
	        Logger1 logger = Logger1.getInstance();

	        System.out.println("Enter log messages (type 'exit' to stop):");
	        while (true) {
	            String input = scanner.nextLine();
	            if (input.equalsIgnoreCase("exit")) {
	                break;
	            }
	            logger.log(input);
	        }

	        System.out.println("\nLogs:");
	        logger.showLog();

	        scanner.close();
	    }
}
