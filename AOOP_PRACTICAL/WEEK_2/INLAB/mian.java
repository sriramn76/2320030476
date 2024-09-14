package INLAB;

import java.util.Scanner;

public class mian {
	 public static void main(String[] args) {
	        Scanner sc = new Scanner(System.in);

	        
	        Logger1 logger = Logger1.getInstance();

	        System.out.println("Enter log messages (type 'exit' to stop):");
	        while (true) {
	            String input = sc.nextLine();
	            if (input.equalsIgnoreCase("exit")) {
	                break;
	            }
	            logger.log(input);
	        }

	        System.out.println("\nLogs:");
	        logger.showLog();

	        sc.close();
	    }
}