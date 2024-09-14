package POSTLAB;

public class PostLab_1 {
	public static void main(String[] args) {
        java.util.Scanner scanner = new java.util.Scanner(System.in);

        LoginState loginState = LoginState.getInstance();
        BankAccount account = new BankAccount(1000.00); 

        while (true) {
            System.out.println("\n1. Login\n2. Logout\n3. View Balance\n4. Deposit\n5. Withdraw\n6. Exit");
            System.out.print("Choose an option: ");
            int option = scanner.nextInt();

            switch (option) {
                case 1:
                    loginState.login();
                    break;
                case 2:
                    loginState.logout();
                    break;
                case 3:
                    account.viewBalance();
                    break;
                case 4:
                    System.out.print("Enter deposit amount: ");
                    double depositAmount = scanner.nextDouble();
                    account.deposit(depositAmount);
                    break;
                case 5:
                    System.out.print("Enter withdrawal amount: ");
                    double withdrawAmount = scanner.nextDouble();
                    account.withdraw(withdrawAmount);
                    break;
                case 6:
                    scanner.close();
                    System.out.println("Exiting...");
                    return;
                default:
                    System.out.println("Invalid option. Please try again.");
            }
        }
    }

}
